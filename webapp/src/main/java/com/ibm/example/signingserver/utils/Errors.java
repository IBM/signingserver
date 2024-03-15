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

import javax.ws.rs.core.Response;

public class Errors {
	public static Response cannotCreateKeyPair() {
		return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("ERROR: Cannot create key: Key is already available.").build();
	}

	public static Response keyNotFound() {
   		return Response.status(Response.Status.NOT_FOUND).entity("ERROR: Expected key not found.").build();
	}

	public static Response dataInvalid() {
		return badRequest("ERROR: Invalid data provided. Cannot decode data.");
	}
	
	public static Response verificationFailed() {
		return badRequest("Signature verification failed.");
	}
	
	public static Response keyTypeMissing() {
		return badRequest("ERROR: The key type is missing or invalid. Please specify the query parameter 'type=EC' or 'type=Dilithium'.");
	}
	
	public static Response badRequest(final String msg) {
		return Response.status(Response.Status.BAD_REQUEST).entity(msg).build();
	}
}
