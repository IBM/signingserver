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

package com.ibm.example.cryptoclient;

import java.util.Calendar;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.protobuf.ByteString;
import com.ibm.crypto.grep11.grpc.AttributeValue;
import com.ibm.crypto.grep11.grpc.CryptoGrpc;
import com.ibm.crypto.grep11.grpc.GenerateKeyPairRequest;
import com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse;
import com.ibm.crypto.grep11.grpc.GenerateKeyRequest;
import com.ibm.crypto.grep11.grpc.GenerateKeyResponse;
import com.ibm.crypto.grep11.grpc.Mechanism;
import com.ibm.crypto.grep11.grpc.SignSingleRequest;
import com.ibm.crypto.grep11.grpc.SignSingleResponse;
import com.ibm.crypto.grep11.grpc.VerifySingleRequest;
import com.ibm.crypto.grep11.grpc.CryptoGrpc.CryptoBlockingStub;
import com.ibm.crypto.grep11.grpc.DecryptSingleRequest;
import com.ibm.crypto.grep11.grpc.DecryptSingleResponse;
import com.ibm.crypto.grep11.grpc.EncryptSingleRequest;
import com.ibm.crypto.grep11.grpc.EncryptSingleResponse;
import com.ibm.example.signingserver.Config;
import com.ibm.example.signingserver.cryptoclient.Constants;

import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ForwardingClientCall.SimpleForwardingClientCall;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;

public class CryptoClient {
	
	public static CryptoClient getInstance() {
		return INSTANCE;
	}

	private static final String CLASSNAME = CryptoClient.class.getName();

	private static final Logger LOGGER = Logger.getLogger(CLASSNAME);
	
	private static final CryptoClient INSTANCE = new CryptoClient();

	private static final AttributeValue IDNamedCurveEd25519 = AttributeValue.newBuilder().setAttributeB(
			ByteString.copyFrom(new byte[]{6, 3, 43, 101, 112})).build();         // byte array representation of the hex conversion of the ASN.1 OID of the mechanism 
	
	private static class HeadersAddingInterceptor implements ClientInterceptor {

		private final String apikey;
		private final String instanceid;
		
		public HeadersAddingInterceptor(final String apikey, final String instanceid) {
			super();
			this.apikey = apikey;
			this.instanceid = instanceid;
		}

		@Override
		public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(io.grpc.MethodDescriptor<ReqT, RespT> method,
				CallOptions callOptions, Channel next) {
	        return new SimpleForwardingClientCall<ReqT, RespT>(next.newCall(method, callOptions.withDeadlineAfter(10000, TimeUnit.MILLISECONDS))) {

	            @Override
	            public void start(Listener<RespT> responseListener, Metadata headers) {
	              final Metadata header= new Metadata();
	              final Metadata.Key<String> key = Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER);
	              header.put(key, login(apikey));
	              final Metadata.Key<String> key2 = Metadata.Key.of("bluemix-instance", Metadata.ASCII_STRING_MARSHALLER);
	              header.put(key2, instanceid);
	              headers.merge(header);
	              if (LOGGER.isLoggable(Level.FINEST)) LOGGER.log(Level.FINEST, "headers", headers);
	              super.start(responseListener, headers);
	            }


	        };
	    }
	};
    
    private synchronized static String login(final String apikey) {
    	final String METHOD = "login";
    	if (LOGGER.isLoggable(Level.FINER)) LOGGER.entering(CLASSNAME, METHOD);
    	
    	if (iamtoken == null || iamtokenTS == null || Calendar.getInstance().getTimeInMillis() > iamtokenTS + (3600 - 120) * 1000) {
    		Client client = ClientBuilder.newClient();
    		WebTarget target = client.target("https://iam.cloud.ibm.com/identity/token");
    		final Form form = new Form();
    		form.param("grant_type", "urn:ibm:params:oauth:grant-type:apikey");
    		form.param("apikey", apikey);
    		final Response response = target.request().header("Content-Type", "application/x-www-form-urlencoded")
    				.header("Accept", "application/json")
    				.buildPost(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED_TYPE))
    				.invoke();

    		iamtoken = (String) response
    				.readEntity(new GenericType<Map<String, Object>>() {})
    				.get("access_token");
    		
    		iamtokenTS = Calendar.getInstance().getTimeInMillis();
    	}
   	
    	if (LOGGER.isLoggable(Level.FINER)) LOGGER.exiting(CLASSNAME, METHOD);
		return iamtoken;
    }
    
	public CryptoClient() {
		this.channel = ManagedChannelBuilder.forAddress(Config.getInstance().getHpcsEndpoint(), 
				Config.getInstance().getHpcsPort()).intercept(new HeadersAddingInterceptor(Config.getInstance().getHpcsAPIKey(), Config.getInstance().getHpcsInstanceId())).build();
        this.stub = CryptoGrpc.newBlockingStub(channel);
	}
	
    public KeyPair createECKeyPair() {
    	final String METHOD = "createECKeyPair";
    	if (LOGGER.isLoggable(Level.FINER)) LOGGER.entering(CLASSNAME, METHOD);
    	
    	final Mechanism mechanism = Mechanism.newBuilder().setMechanism(Constants.CKM_EC_KEY_PAIR_GEN).build();
    	final GenerateKeyPairRequest request = GenerateKeyPairRequest.
    											newBuilder().
    											setMech(mechanism).
    											putPubKeyTemplate(Constants.CKA_EC_PARAMS, IDNamedCurveEd25519).
    											putPubKeyTemplate(Constants.CKA_VERIFY, aTF(true)).
    											putPubKeyTemplate(Constants.CKA_EXTRACTABLE, aTF(false)).
    											putPrivKeyTemplate(Constants.CKA_SIGN, aTF(true)).
    											putPrivKeyTemplate(Constants.CKA_EXTRACTABLE, aTF(false)).
    											build();
    	final GenerateKeyPairResponse response = stub.generateKeyPair(request);
    	final KeyPair ret = new KeyPair(response.getPubKeyBytes(), response.getPrivKeyBytes());
    	
    	if (LOGGER.isLoggable(Level.FINER)) LOGGER.exiting(CLASSNAME, METHOD);
    	return ret;
    }
    
    public ByteString signEC(final ByteString privKey, final ByteString data) {
    	final String METHOD = "signEC";
    	if (LOGGER.isLoggable(Level.FINER)) LOGGER.entering(CLASSNAME, METHOD);
    	
       	final Mechanism mechanism = Mechanism.newBuilder().setMechanism(Constants.CKM_IBM_ED25519_SHA512).build();
    	final SignSingleRequest request = SignSingleRequest.
    											newBuilder().
    											setMech(mechanism).
    											setPrivKey(privKey).
    											setData(data).
    											build();
    	final SignSingleResponse response = stub.signSingle(request);
    	
    	if (LOGGER.isLoggable(Level.FINER)) LOGGER.exiting(CLASSNAME, METHOD);
    	return response.getSignature();
    }
    
    public void verifyEC(final ByteString signature, final ByteString pubKey, final ByteString data) {
    	final String METHOD = "verifyEC";
    	if (LOGGER.isLoggable(Level.FINER)) LOGGER.entering(CLASSNAME, METHOD);
    	
       	final Mechanism mechanism = Mechanism.newBuilder().setMechanism(Constants.CKM_IBM_ED25519_SHA512).build();
    	final VerifySingleRequest request = VerifySingleRequest.
    											newBuilder().
    											setMech(mechanism).
    											setPubKey(pubKey).
    											setData(data).
    											setSignature(signature).
    											build();
    	stub.verifySingle(request);    	// this will throw "io.grpc.StatusRuntimeException: UNKNOWN: CKR_SIGNATURE_INVALID" if signature cannot be verified successfully

    	if (LOGGER.isLoggable(Level.FINER)) LOGGER.exiting(CLASSNAME, METHOD);
    }
    
    public ByteString createAESKey() {
    	final String METHOD = "createAESKey";
    	if (LOGGER.isLoggable(Level.FINER)) LOGGER.entering(CLASSNAME, METHOD);
    	
    	final Mechanism mechanism = Mechanism.newBuilder().setMechanism(Constants.CKM_AES_KEY_GEN).build();
    	final GenerateKeyRequest request = GenerateKeyRequest.
    											newBuilder().
    											setMech(mechanism).
    											putTemplate(Constants.CKA_VALUE_LEN, aTI(128/8)).
    											putTemplate(Constants.CKA_WRAP, aTF(true)).
    											putTemplate(Constants.CKA_UNWRAP, aTF(true)).
    											putTemplate(Constants.CKA_EXTRACTABLE, aTF(false)).
    											build();
    	final GenerateKeyResponse response = stub.generateKey(request);
    	
    	if (LOGGER.isLoggable(Level.FINER)) LOGGER.exiting(CLASSNAME, METHOD);
    	return response.getKeyBytes();
    }
    
    public ByteString encryptAES(final ByteString kek, final ByteString plain) {
    	final String METHOD = "encryptAES";
    	if (LOGGER.isLoggable(Level.FINER)) LOGGER.entering(CLASSNAME, METHOD);
    	
       	final Mechanism mechanism = Mechanism.newBuilder().setMechanism(Constants.CKM_AES_ECB).build();
    	final EncryptSingleRequest request = EncryptSingleRequest.
    											newBuilder().
    											setMech(mechanism).
    											setKey(kek).
    											setPlain(plain).
    											build();
    	final EncryptSingleResponse response = stub.encryptSingle(request);
    	
    	if (LOGGER.isLoggable(Level.FINER)) LOGGER.exiting(CLASSNAME, METHOD);
    	return response.getCiphered();
    }
    
    public ByteString decryptAES(final ByteString kek, final ByteString ciphered) {
    	final String METHOD = "decryptAES";
    	if (LOGGER.isLoggable(Level.FINER)) LOGGER.entering(CLASSNAME, METHOD);
    	
       	final Mechanism mechanism = Mechanism.newBuilder().setMechanism(Constants.CKM_AES_ECB).build();
    	final DecryptSingleRequest request = DecryptSingleRequest.
    											newBuilder().
    											setMech(mechanism).
    											setKey(kek).
    											setCiphered(ciphered).
    											build();
    	final DecryptSingleResponse response = stub.decryptSingle(request);

    	if (LOGGER.isLoggable(Level.FINER)) LOGGER.exiting(CLASSNAME, METHOD);
    	return response.getPlain();
    }

    
    public void shutdownNow() {
        channel.shutdownNow();
    }

	private final CryptoBlockingStub stub;
	private final ManagedChannel channel;
	private static String iamtoken;
	private static Long iamtokenTS;

	private AttributeValue aTF(final boolean val) {
		return AttributeValue.newBuilder().setAttributeTF(val).build();
	}

	private AttributeValue aTI(final long val) {
		return AttributeValue.newBuilder().setAttributeI(val).build();
	}

}
