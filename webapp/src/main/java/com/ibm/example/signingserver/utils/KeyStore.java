// Copyright 2021 IBM Corp. All Rights Reserved.

// Licensed under the Apache License, Version 2.0 (the "License"); you
// may not use this file except in compliance with the License.  You
// may obtain a copy of the License at

// http://www.apache.org/licenses/LICENSE-2.0

// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
// implied.  See the License for the specific language governing
// permissions and limitations under the License.
package com.ibm.example.signingserver.utils;

import static com.mongodb.client.model.Filters.eq;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Base64;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.google.protobuf.ByteString;
import com.ibm.example.cryptoclient.CryptoClient;
import com.ibm.example.cryptoclient.KeyPair;
import com.ibm.example.signingserver.Config;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;

public class KeyStore {
	private static final String PRIVKEY = "privkey";
	private static final String PUBKEY = "pubkey";
	private static final String ID = "_id";
	private static final String DBNAME = "signingserverdb";


	private static ByteString kek;
	private static MongoCollection<Document> collection;
	
	public static String createKeyPair(final KeyPair keypair) throws IOException {
		final ByteString wrappedPrivKey = CryptoClient.getInstance().encryptAES(getKeK(), keypair.getPrivKey()); 
		final String pubkey = Base64.getEncoder().encodeToString(keypair.getPubKey().toByteArray());
		final String privkey = Base64.getEncoder().encodeToString(wrappedPrivKey.toByteArray());
		
		final Document doc = new Document(PRIVKEY, privkey).append(PUBKEY, pubkey);
		getCollection().insertOne(doc);
		
		return doc.getObjectId(ID).toHexString();
	}

	public static KeyPair getKeyPair(final String id) throws IOException {
		final Document document = getCollection().find(eq(ID, new ObjectId(id))).first();
		
		final String pubKey = document.getString(PUBKEY);
		final String privKey = document.getString(PRIVKEY);
		final ByteString wrappedKey = ByteString.copyFrom(Base64.getDecoder().decode(privKey));
		final ByteString unwrappedPrivKey = CryptoClient.getInstance().decryptAES(getKeK(), wrappedKey);
		
		return new KeyPair(
				ByteString.copyFrom(Base64.getDecoder().decode(pubKey)),
				unwrappedPrivKey);
	}

	private synchronized static ByteString getKeK() throws IOException {
		if (kek == null) {
			final File file = new File(getFileName());
			if (file.exists()) {
				final BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
				final String txt = br.readLine();
				br.close();
				if (txt == null) {
					throw new IllegalStateException("Expected KEK not found");
				}
				kek = ByteString.copyFrom(Base64.getDecoder().decode(txt));
			} else {
				final ByteString kektemp = CryptoClient.getInstance().createAESKey();
				final PrintWriter pw = new PrintWriter(file);
				pw.println(Base64.getEncoder().encodeToString(kektemp.toByteArray()));
				pw.close();
				kek = kektemp;
			}
		}
		return kek;
	}

	private synchronized static MongoCollection<Document> getCollection() {
		if (collection == null) {
			final String mongoClientURI = "mongodb://" + Config.getInstance().getDbUser() + ":" + Config.getInstance().getDbPW() + "@" + Config.getInstance().getDbURL() 
					+ "/admin?replicaSet=" +  Config.getInstance().getDbReplicaSet() +"&tls=true";
			final MongoClientURI connectionString = new MongoClientURI(mongoClientURI);
			final MongoClient mongoClient = new MongoClient(connectionString);
			final MongoDatabase database = mongoClient.getDatabase(DBNAME);
			collection = database.getCollection("keypairs");
		}
		return collection;
	}
	
	private static String getFileName() {
		return Config.getInstance().getKeyStorageFolder() + "signingserver-kek.txt";
	}
	
	
}
