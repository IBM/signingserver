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

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ibm.example.cryptoclient.CryptoClient;
import com.ibm.example.cryptoclient.KeyPair;
import com.ibm.example.signingserver.utils.KeyStore;
import com.ibm.example.signingserver.utils.Utils;

@Path("keys")
public class KeysResource {
	
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response createKeyPair() throws Exception {
    	final CryptoClient client = CryptoClient.getInstance();
    	final KeyPair keypair = client.createECKeyPair();
		final String id = KeyStore.createKeyPair(keypair);

		return createResponse(id, keypair);
    }

	
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getKeyInfo(@PathParam("id") String id) throws Exception {
    	final KeyPair keypair = KeyStore.getKeyPair(id);
		if (keypair == null) {
    		return Utils.errorKeyNotFound();
    	}
		return createResponse(id, keypair);
    }


	private Response createResponse(String id, final KeyPair keypair) throws UnsupportedEncodingException {
		final com.ibm.example.signingserver.api.Response resp = new com.ibm.example.signingserver.api.Response();
		resp.setId(id);
		resp.setPubKey(new String(Base64.getEncoder().encode(keypair.getPubKey().toByteArray()), UTF_8.name()));
    	return Response.ok(resp, MediaType.APPLICATION_JSON).build();
	}
}
