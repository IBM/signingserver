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

package com.ibm.example.signingserver.cryptoclient;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.List;
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

import org.apache.commons.codec.binary.Base64InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

import com.google.protobuf.ByteString;
import com.ibm.crypto.grep11.grpc.AttributeValue;
import com.ibm.crypto.grep11.grpc.CryptoGrpc;
import com.ibm.crypto.grep11.grpc.GenerateKeyPairRequest;
import com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse;
import com.ibm.crypto.grep11.grpc.GetMechanismListRequest;
import com.ibm.crypto.grep11.grpc.GetMechanismListResponse;
import com.ibm.crypto.grep11.grpc.KeyBlob;
import com.ibm.crypto.grep11.grpc.Mechanism;
import com.ibm.crypto.grep11.grpc.SignSingleRequest;
import com.ibm.crypto.grep11.grpc.SignSingleResponse;
import com.ibm.crypto.grep11.grpc.VerifySingleRequest;
import com.ibm.crypto.grep11.grpc.VerifySingleResponse;
import com.ibm.crypto.grep11.grpc.CryptoGrpc.CryptoBlockingStub;
import com.ibm.example.signingserver.utils.Config;

import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ChannelCredentials;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ForwardingClientCall.SimpleForwardingClientCall;
import io.grpc.Grpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.TlsChannelCredentials;

public class CryptoClient {
    
	public static synchronized CryptoClient getInstance() throws IOException {
        if (INSTANCE == null) {
            INSTANCE = new CryptoClient();
        }
        return INSTANCE;
    }

    private static final String CLASSNAME = CryptoClient.class.getName();

    private static final Logger LOGGER = Logger.getLogger(CLASSNAME);
    
	public static final String ED25519_OID = "1.3.101.112";

    private static final ASN1ObjectIdentifier OIDNamedCurveEd25519 = new ASN1ObjectIdentifier(ED25519_OID);
    private static final ASN1ObjectIdentifier OIDNamedCurveSecp256k1  = new ASN1ObjectIdentifier("1.3.132.0.10");
    private static final ASN1ObjectIdentifier OIDDilithiumHigh = new ASN1ObjectIdentifier("1.3.6.1.4.1.2.267.1.6.5");

    private static final Mechanism DILITHIUM_MECHANISM = Mechanism.newBuilder().setMechanism(Constants.CKM_IBM_DILITHIUM).build();
	private static final Mechanism ECDSA_SECP256K1_MECHANISM = Mechanism.newBuilder().setMechanism(Constants.CKM_ECDSA).build();
	private static final Mechanism EDDSA_ED25519_MECHANISM = Mechanism.newBuilder().setMechanism(Constants.CKM_IBM_ED25519_SHA512).build();
	
    private static CryptoClient INSTANCE;

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
    
    public CryptoClient() throws IOException {
        final String METHOD = "CryptoClient()";
        if (LOGGER.isLoggable(Level.FINER)) LOGGER.entering(CLASSNAME, METHOD);
        
        if (Config.getInstance().isClientAuthEnabled()) {
            final InputStream caCert = new Base64InputStream(new ByteArrayInputStream(Config.getInstance().getCacert().getBytes(UTF_8)), false);
            final InputStream clientCert = new Base64InputStream(new ByteArrayInputStream(Config.getInstance().getClientcert().getBytes(UTF_8)), false);
            final InputStream clientKey = new Base64InputStream(new ByteArrayInputStream(Config.getInstance().getClientkey().getBytes(UTF_8)), false);
            final ChannelCredentials creds = TlsChannelCredentials.newBuilder()
                      .trustManager(caCert)
                      .keyManager(clientCert, clientKey)
                      .build();
			this.channel = Grpc.newChannelBuilder(
					Config.getInstance().getHpcsEndpoint()
							+ (Config.getInstance().getHpcsPort() != 0 ? ":" + Config.getInstance().getHpcsPort() : ""),
					creds).build();
            this.stub = CryptoGrpc.newBlockingStub(channel);
            caCert.close();
            clientCert.close();
            clientKey.close();
        }
        else {
            this.channel = ManagedChannelBuilder
                .forAddress(Config.getInstance().getHpcsEndpoint(), Config.getInstance().getHpcsPort())
                .intercept(new HeadersAddingInterceptor(Config.getInstance().getHpcsAPIKey(),
                        Config.getInstance().getHpcsInstanceId()))
                .build();
            this.stub = CryptoGrpc.newBlockingStub(channel);
        }
        
    }

	public boolean checkMechanisms(final boolean checkDilithiumMechanism) {
		final GetMechanismListRequest request = GetMechanismListRequest.newBuilder().build();
        final GetMechanismListResponse mechanismList = stub.getMechanismList(request);
        boolean ok = mechanismList.getMechsCount() > 0;
        final List<Long> mechsList = mechanismList.getMechsList();
		ok = ok && mechsList.contains(ECDSA_SECP256K1_MECHANISM.getMechanism());
        ok = ok && mechsList.contains(EDDSA_ED25519_MECHANISM.getMechanism());
        if (checkDilithiumMechanism) {
            ok = ok && mechsList.contains(DILITHIUM_MECHANISM.getMechanism());
        }
        return ok;
	}
    
    public KeyPair createKeyPair(final KeyPair.Type keyType) throws IOException {
        final String METHOD = "createKeyPair";
        if (LOGGER.isLoggable(Level.FINER)) LOGGER.entering(CLASSNAME, METHOD, keyType);
        
        final Mechanism mechanism;
        final GenerateKeyPairRequest request;
        switch (keyType) {
        case EDDSA_ED25519:
            mechanism = Mechanism.newBuilder().setMechanism(Constants.CKM_EC_KEY_PAIR_GEN).build();
            request = GenerateKeyPairRequest.newBuilder().setMech(mechanism)
                    .putPubKeyTemplate(Constants.CKA_EC_PARAMS,
                            AttributeValue.newBuilder()
                                    .setAttributeB(ByteString.copyFrom(OIDNamedCurveEd25519.getEncoded())).build())
                    .putPubKeyTemplate(Constants.CKA_VERIFY, aTF(true))
                    .putPubKeyTemplate(Constants.CKA_TOKEN, aTF(true))
                    .putPrivKeyTemplate(Constants.CKA_TOKEN, aTF(true))
                    .putPrivKeyTemplate(Constants.CKA_SIGN, aTF(true))
                    .putPrivKeyTemplate(Constants.CKA_EXTRACTABLE, aTF(false)).build();
            
            break;
            
        case ECDSA_SECP256K1:
            mechanism = Mechanism.newBuilder().setMechanism(Constants.CKM_EC_KEY_PAIR_GEN).build();
            request = GenerateKeyPairRequest.newBuilder().setMech(mechanism)
                    .putPubKeyTemplate(Constants.CKA_EC_PARAMS,
                            AttributeValue.newBuilder()
                                    .setAttributeB(ByteString.copyFrom(OIDNamedCurveSecp256k1.getEncoded())).build())
                    .putPubKeyTemplate(Constants.CKA_VERIFY, aTF(true))
                    .putPubKeyTemplate(Constants.CKA_TOKEN, aTF(true))
                    .putPrivKeyTemplate(Constants.CKA_SIGN, aTF(true))
                    .putPrivKeyTemplate(Constants.CKA_DERIVE, aTF(true))
                    .putPrivKeyTemplate(Constants.CKA_TOKEN, aTF(true))
                    .putPrivKeyTemplate(Constants.CKA_EXTRACTABLE, aTF(false)).build();
            
            break;
            
        case Dilithium:
        default:
            mechanism = DILITHIUM_MECHANISM;
            request = GenerateKeyPairRequest.newBuilder().setMech(mechanism)
                    .putPubKeyTemplate(Constants.CKA_IBM_PQC_PARAMS,
                            AttributeValue.newBuilder()
                                    .setAttributeB(ByteString.copyFrom(OIDDilithiumHigh.getEncoded())).build())
                    .putPubKeyTemplate(Constants.CKA_VERIFY, aTF(true))
                    .putPrivKeyTemplate(Constants.CKA_SIGN, aTF(true))
                    .putPrivKeyTemplate(Constants.CKA_EXTRACTABLE, aTF(false)).build();

            break;
        }
        
        final GenerateKeyPairResponse response = stub.generateKeyPair(request);
        final KeyPair ret = new KeyPair(response.getPubKey(), response.getPrivKey(), keyType);
        
        if (LOGGER.isLoggable(Level.FINER)) LOGGER.exiting(CLASSNAME, METHOD);
        return ret;
    }
    
    public ByteString sign(final KeyBlob privKey, final ByteString data, final KeyPair.Type keyType) {
        final String METHOD = "sign";
        if (LOGGER.isLoggable(Level.FINER)) LOGGER.entering(CLASSNAME, METHOD, keyType);
        
        final Mechanism mechanism;
        switch (keyType) {
        case EDDSA_ED25519:
            mechanism = EDDSA_ED25519_MECHANISM;
            break;
            
        case ECDSA_SECP256K1:
			mechanism = ECDSA_SECP256K1_MECHANISM;
            break;
            
        case Dilithium:
        default:
            mechanism = DILITHIUM_MECHANISM;
            break;
        }

        final SignSingleRequest request = SignSingleRequest.newBuilder().
                setMech(mechanism).
                setPrivKey(privKey).
                setData(data).
                build();
        final SignSingleResponse response = stub.signSingle(request);
        
        if (LOGGER.isLoggable(Level.FINER)) LOGGER.exiting(CLASSNAME, METHOD);
        return response.getSignature();
    }
    
    public void verify(final ByteString signature, final KeyBlob pubKey, final ByteString data, final KeyPair.Type keyType) {
        final String METHOD = "verify";
        if (LOGGER.isLoggable(Level.FINER)) LOGGER.entering(CLASSNAME, METHOD, keyType);
        
        final Mechanism mechanism;
        switch (keyType) {
        case EDDSA_ED25519:
            mechanism = EDDSA_ED25519_MECHANISM;
            break;
            
        case ECDSA_SECP256K1:
			mechanism = ECDSA_SECP256K1_MECHANISM;
            break;
            
        case Dilithium:
        default:
            mechanism = DILITHIUM_MECHANISM;
            break;
        }
        
        final VerifySingleRequest request = VerifySingleRequest.newBuilder().
                setMech(mechanism).
                setPubKey(pubKey).
                setData(data).
                setSignature(signature).
                build();
        final VerifySingleResponse response = stub.verifySingle(request);
        // this will throw "io.grpc.StatusRuntimeException: UNKNOWN: CKR_SIGNATURE_INVALID" 
        // if the signature cannot be verified
        
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
