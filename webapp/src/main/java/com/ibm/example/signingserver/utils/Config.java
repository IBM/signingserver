// Copyright 	2021 IBM Corp. All Rights Reserved.

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

public class Config {

	public static Config getInstance() {
		return INSTANCE;
	}

	private final static Config INSTANCE = new Config();
	
	private final String hpcsAPIKey;
	private final String hpcsEndpoint;
	private final String hpcsInstanceId;
	private final int hpcsPort;
	private final String keyStorePath;
	private final String clientkey;
	private final String clientcert;
	private final String cacert;
	private final boolean clientAuth;
	
	private Config() {
		this.hpcsAPIKey = System.getenv("API_KEY");
		this.hpcsInstanceId = System.getenv("HPCS_INSTANCEID");
		this.hpcsEndpoint = System.getenv("HPCS_ENDPOINT");
		this.keyStorePath = System.getenv("KEYSTORE_PATH");
		this.clientkey =  System.getenv("CLIENT_KEY");
		this.clientcert =  System.getenv("CLIENT_CERT");
		this.cacert =  System.getenv("CA_CERT");
		try {
			this.hpcsPort = Integer.valueOf(System.getenv("HPCS_PORT"));
		} catch (NumberFormatException e) {
			throw new IllegalStateException("Invalid configuration: "+toString() + "  ("+System.getenv("HPCS_PORT")+")", e);
		}
		
		if (clientkey != null || clientcert != null || cacert != null) {
			if (clientkey == null || clientcert == null || cacert == null || hpcsAPIKey != null || hpcsInstanceId != null) {
				throw new IllegalStateException("Invalid configuration: "+toString());
			}
			this.clientAuth = true;
		} else {
			if (hpcsAPIKey == null || hpcsInstanceId==null) {
				throw new IllegalStateException("Invalid configuration: "+toString());
			}
			this.clientAuth = false;
		}
		
		if  (hpcsEndpoint==null || keyStorePath==null) {
			throw new IllegalStateException("Invalid configuration: "+toString());
		}
	}
	
	public String getHpcsAPIKey() {
		return hpcsAPIKey;
	}

	public String getHpcsEndpoint() {
		return hpcsEndpoint;
	}

	public String getHpcsInstanceId() {
		return hpcsInstanceId;
	}

	public int getHpcsPort() {
		return hpcsPort;
	}

	public String getKeyStorePath() {
		return keyStorePath;
	}
	
	public String getClientkey() {
		return clientkey;
	}

	public String getClientcert() {
		return clientcert;
	}

	public String getCacert() {
		return cacert;
	}

	public boolean isClientAuthEnabled() {
		return clientAuth;
	}

	@Override
	public String toString() {
		return "Config [hpcsAPIKey=" + (hpcsAPIKey == null ? "null" : "(redacted)") + ", hpcsEndpoint=" + hpcsEndpoint + ", hpcsInstanceId="
				+ hpcsInstanceId + ", hpcsPort=" + hpcsPort + ", keyStorePath=" + keyStorePath + ", clientkey="
				+ (clientkey == null ? "null" : "(redacted)") + ", clientcert=" + clientcert + ", cacert=" + cacert + ", isClientAuth=" + clientAuth
				+ "]";
	}
}
