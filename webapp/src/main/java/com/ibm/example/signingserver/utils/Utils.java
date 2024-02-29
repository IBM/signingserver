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

import java.util.logging.Logger;

import javax.ws.rs.core.Response;

public class Utils {
	public static Response errorCannotCreateKeyPair() {
		return errorBadRequest(ERROR_CANNOT_CREATE_KEY);
	}

	public static Response errorKeyNotFound() {
   		return errorBadRequest(ERROR_KEY_NOT_FOUND);
	}

	public static Response errorBadRequest() {
		return errorBadRequest(ERROR_BAD_REQUEST);
	}
	
	public static Response errorBadRequest(final String msg) {
		LOGGER.severe(msg);
		return Response.status(Response.Status.NOT_FOUND).entity(msg).build();
	}
	
	private static final Logger LOGGER = Logger.getLogger(Utils.class.getName());
	private static final String ERROR_CANNOT_CREATE_KEY = "ERROR: Cannot create key: Key is already available.";
	private static final String ERROR_KEY_NOT_FOUND = "ERROR: Expected key not found";
	private static final String ERROR_BAD_REQUEST = "ERROR: Bad request";
}
