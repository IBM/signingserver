// Copyright contributors to the Signing Server project
package com.ibm.example.signingserver.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;


import com.google.protobuf.ByteString;
import com.ibm.crypto.grep11.grpc.KeyBlob;
import com.ibm.example.signingserver.cryptoclient.KeyPair;
import com.ibm.example.signingserver.cryptoclient.KeyPair.Type;

public class KeyStore {


    private static final String PRIVKEY_TXT = "-privkey.txt";
    private static final String PUBKEY_TXT = "-pubkey.txt";
    private static final String KEYTYPE_TXT = "-keytype.txt";

    public static String storeKeyPair(final KeyPair keypair) throws IOException {
        final String pubkey = Base64.getEncoder().encodeToString(keypair.getPubKey().toByteArray());
        final String privkey = Base64.getEncoder().encodeToString(keypair.getPrivKey().toByteArray());
        final String type = keypair.getType().toString();

        final UUID uuid = UUID. randomUUID();
        final String uuidAsString = uuid.toString();

        storeToFile(pubkey, uuidAsString + PUBKEY_TXT);
        storeToFile(privkey, uuidAsString + PRIVKEY_TXT);
        storeToFile(type, uuidAsString + KEYTYPE_TXT);

        return uuidAsString;
    }

    public static KeyPair getKeyPair(final String id) throws IOException {
        final String pubKey = readFromFile(id + PUBKEY_TXT);
        final String privKey = readFromFile(id + PRIVKEY_TXT);
        final String type = readFromFile(id + KEYTYPE_TXT);

        return new KeyPair(
                KeyBlob.parseFrom(ByteString.copyFrom(Base64.getDecoder().decode(pubKey))),
                KeyBlob.parseFrom(ByteString.copyFrom(Base64.getDecoder().decode(privKey))), 
                Type.valueOf(type));
    }

    private static void storeToFile(final String keyval, final String filename) throws FileNotFoundException, UnsupportedEncodingException {
        final PrintWriter writer = new PrintWriter(getFileName(filename), "UTF-8");
        writer.println(keyval);
        writer.close();     
    }

    private static String readFromFile(final String filename) throws IOException {
        final BufferedReader br = new BufferedReader(new FileReader(getFileName(filename)));
        final String val = br.readLine();
        br.close();
        return val;
    }

    private static String getFileName(final String filename) {
        return Config.getInstance().getKeyStorePath() + "/" + filename;
    }


}
