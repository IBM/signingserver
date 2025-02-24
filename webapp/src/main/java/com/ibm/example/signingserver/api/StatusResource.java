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

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ibm.example.signingserver.cryptoclient.CryptoClient;
import com.ibm.example.signingserver.utils.Config;


@Path("status")
public class StatusResource {
	private static final Logger LOGGER = Logger.getLogger(StatusResource.class.getName());

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response getStatus() throws Exception {
		boolean ok = false;
		try {
			final CryptoClient client = CryptoClient.getInstance();
			ok = client.checkMechanisms(false);
			if (!ok) {
				LOGGER.warning("could not validate mechnaism list");
			}
		}
		catch (Exception e) {
			LOGGER.log(Level.SEVERE, "getStatus checkMechanism failed", e.getMessage());
		}
		
		boolean ok2 = false;
		try {
			final File keystore = new File(Config.getInstance().getKeyStorePath());
			ok2 = keystore.isDirectory() && keystore.canWrite();
			if (!ok2) {
				LOGGER.warning("could not validate keystore directory");
			}
		}
  	    catch (Exception e) {
  	    	LOGGER.log(Level.SEVERE, "getStatus keystore directory check failed", e.getMessage());
		}
			
		ok = ok && ok2;
		
		if (ok) {
			return Response.ok("OK").build();
		}
		else {
			return Response.status(500, "ERROR").build();
		}
	}
}
