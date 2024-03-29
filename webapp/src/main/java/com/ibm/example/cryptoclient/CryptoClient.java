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

import java.io.IOException;
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

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

import com.google.protobuf.ByteString;
import com.ibm.crypto.grep11.grpc.AttributeValue;
import com.ibm.crypto.grep11.grpc.CryptoGrpc;
import com.ibm.crypto.grep11.grpc.GenerateKeyPairRequest;
import com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse;
import com.ibm.crypto.grep11.grpc.Mechanism;
import com.ibm.crypto.grep11.grpc.SignInitRequest;
import com.ibm.crypto.grep11.grpc.SignInitResponse;
import com.ibm.crypto.grep11.grpc.SignRequest;
import com.ibm.crypto.grep11.grpc.SignResponse;
import com.ibm.crypto.grep11.grpc.VerifyInitRequest;
import com.ibm.crypto.grep11.grpc.VerifyInitResponse;
import com.ibm.crypto.grep11.grpc.VerifyRequest;
import com.ibm.crypto.grep11.grpc.CryptoGrpc.CryptoBlockingStub;
import com.ibm.example.signingserver.cryptoclient.Constants;
import com.ibm.example.signingserver.utils.Config;

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

	private static final ASN1ObjectIdentifier OIDNamedCurveEd25519 = new ASN1ObjectIdentifier("1.3.101.112");
	
	private static final ASN1ObjectIdentifier OIDDilithiumHigh = new ASN1ObjectIdentifier("1.3.6.1.4.1.2.267.1.6.5");

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
		this.channel = ManagedChannelBuilder
				.forAddress(Config.getInstance().getHpcsEndpoint(), Config.getInstance().getHpcsPort())
				.intercept(new HeadersAddingInterceptor(Config.getInstance().getHpcsAPIKey(),
						Config.getInstance().getHpcsInstanceId()))
				.build();
        this.stub = CryptoGrpc.newBlockingStub(channel);
	}
	
    public KeyPair createKeyPair(final KeyPair.Type keyType) throws IOException {
    	final String METHOD = "createKeyPair";
    	if (LOGGER.isLoggable(Level.FINER)) LOGGER.entering(CLASSNAME, METHOD, keyType);
    	
    	final Mechanism mechanism;
    	final GenerateKeyPairRequest request;
    	switch (keyType) {
    	case EC:
        	mechanism = Mechanism.newBuilder().setMechanism(Constants.CKM_EC_KEY_PAIR_GEN).build();
			request = GenerateKeyPairRequest.newBuilder().setMech(mechanism)
					.putPubKeyTemplate(Constants.CKA_EC_PARAMS,
							AttributeValue.newBuilder()
									.setAttributeB(ByteString.copyFrom(OIDNamedCurveEd25519.getEncoded())).build())
					.putPubKeyTemplate(Constants.CKA_VERIFY, aTF(true))
					.putPubKeyTemplate(Constants.CKA_EXTRACTABLE, aTF(false))
					.putPrivKeyTemplate(Constants.CKA_SIGN, aTF(true))
					.putPrivKeyTemplate(Constants.CKA_EXTRACTABLE, aTF(false)).build();
    		
    		break;
    		
    	case Dilithium:
    	default:
        	mechanism = Mechanism.newBuilder().setMechanism(Constants.CKM_IBM_DILITHIUM).build();
			request = GenerateKeyPairRequest.newBuilder().setMech(mechanism)
					.putPubKeyTemplate(Constants.CKA_IBM_PQC_PARAMS,
							AttributeValue.newBuilder()
									.setAttributeB(ByteString.copyFrom(OIDDilithiumHigh.getEncoded())).build())
					.putPubKeyTemplate(Constants.CKA_VERIFY, aTF(true))
					.putPubKeyTemplate(Constants.CKA_EXTRACTABLE, aTF(false))
					.putPrivKeyTemplate(Constants.CKA_SIGN, aTF(true))
					.putPrivKeyTemplate(Constants.CKA_EXTRACTABLE, aTF(false)).build();

    		break;
    	}
    	
    	final GenerateKeyPairResponse response = stub.generateKeyPair(request);
    	final KeyPair ret = new KeyPair(response.getPubKeyBytes(), response.getPrivKeyBytes(), keyType);
    	
    	if (LOGGER.isLoggable(Level.FINER)) LOGGER.exiting(CLASSNAME, METHOD);
    	return ret;
    }
    
    public ByteString sign(final ByteString privKey, final ByteString data, final KeyPair.Type keyType) {
    	final String METHOD = "sign";
    	if (LOGGER.isLoggable(Level.FINER)) LOGGER.entering(CLASSNAME, METHOD, keyType);
    	
    	final Mechanism mechanism;
    	switch (keyType) {
    	case EC:
           	mechanism = Mechanism.newBuilder().setMechanism(Constants.CKM_IBM_ED25519_SHA512).build();
    		break;
    		
    	case Dilithium:
    	default:
           	mechanism = Mechanism.newBuilder().setMechanism(Constants.CKM_IBM_DILITHIUM).build();
    		break;
    	}

    	final SignInitRequest signInitRequest = SignInitRequest.newBuilder().
				setMech(mechanism).
				setPrivKey(privKey).
				build();
    	final SignInitResponse signInitResponse = stub.signInit(signInitRequest);
    	
    	final SignRequest request = SignRequest.newBuilder().
				setState(signInitResponse.getState()).
				setData(data).
				build();
    	final SignResponse response = stub.sign(request);
    	
    	if (LOGGER.isLoggable(Level.FINER)) LOGGER.exiting(CLASSNAME, METHOD);
    	return response.getSignature();
    }
    
    public void verify(final ByteString signature, final ByteString pubKey, final ByteString data, final KeyPair.Type keyType) {
    	final String METHOD = "verify";
    	if (LOGGER.isLoggable(Level.FINER)) LOGGER.entering(CLASSNAME, METHOD, keyType);
    	
    	final Mechanism mechanism;
    	switch (keyType) {
    	case EC:
           	mechanism = Mechanism.newBuilder().setMechanism(Constants.CKM_IBM_ED25519_SHA512).build();
    		break;
    		
    	case Dilithium:
    	default:
           	mechanism = Mechanism.newBuilder().setMechanism(Constants.CKM_IBM_DILITHIUM).build();
    		break;
    	}
    	
    	final VerifyInitRequest initRequest = VerifyInitRequest.newBuilder().
				setMech(mechanism).
				setPubKey(pubKey).
				build();
    	final VerifyInitResponse verifyInitResponse = stub.verifyInit(initRequest);

    	final VerifyRequest verifyRequest = VerifyRequest.newBuilder().
				setState(verifyInitResponse.getState()).
				setData(data).
				setSignature(signature).
				build();
    	
      	// this will throw "io.grpc.StatusRuntimeException: UNKNOWN: CKR_SIGNATURE_INVALID" 
   		// if the signature cannot be verified
   		stub.verify(verifyRequest);

    	if (LOGGER.isLoggable(Level.FINER)) LOGGER.exiting(CLASSNAME, METHOD);
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
}
