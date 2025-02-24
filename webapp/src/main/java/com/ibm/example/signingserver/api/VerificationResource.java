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
package com.ibm.example.signingserver.api;

import java.util.Base64;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.protobuf.ByteString;
import com.ibm.crypto.grep11.grpc.KeyBlob;
import com.ibm.example.signingserver.utils.KeyStore;
import com.ibm.example.signingserver.cryptoclient.CryptoClient;
import com.ibm.example.signingserver.cryptoclient.KeyPair;
import com.ibm.example.signingserver.utils.Errors;

@Path("verify")
public class VerificationResource {
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response verifySignature(final Request request) throws Exception {
    	try {
    		final ByteString data = ByteString.copyFrom(Base64.getDecoder().decode(request.getData()));
    		final ByteString signature = ByteString.copyFrom(Base64.getDecoder().decode(request.getSignature()));
    	
    		final String id = request.getId();
    		final KeyPair keypair = (id != null ? KeyStore.getKeyPair(id) : null);
    		final KeyBlob key = (keypair != null ? keypair.getPubKey() : KeyBlob.parseFrom(ByteString.copyFromUtf8(request.getPubKey())));
    		final KeyPair.Type type =  (keypair != null ? keypair.getType() : request.getType());

    		if ((keypair != null && request.getPubKey() != null) || key == null || type == null) {
    			return Errors.badRequest();
    		}
    		
        	try {
        		CryptoClient.getInstance().verify(signature, key, data, type);
        	}
        	catch (Exception e) {
        		return Errors.verificationFailed();
        	}
    	}
    	catch (Exception e) {
    		return Errors.badRequest();
    	}
    	
   		return Response.ok().build();
    }
}
