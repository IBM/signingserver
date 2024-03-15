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

public class Config {

	public static Config getInstance() {
		return INSTANCE;
	}

	private final static Config INSTANCE = new Config();
	
	private final String hpcsAPIKey;
	private final String hpcsEndpoint;
	private final String hpcsInstanceId;
	private final int hpcsPort;
	
	private Config() {
		this.hpcsAPIKey = System.getenv("API_KEY");
		this.hpcsInstanceId = System.getenv("HPCS_INSTANCEID");
		this.hpcsPort = Integer.valueOf(System.getenv("HPCS_PORT"));
		this.hpcsEndpoint = System.getenv("HPCS_ENDPOINT");
		
		if (hpcsAPIKey == null || hpcsInstanceId==null || hpcsEndpoint==null) {
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

	@Override
	public String toString() {
		return "Config [hpcsAPIKey=(redacted), hpcsInstanceId=" + hpcsInstanceId + ", hpcsEndpoint="
				+ hpcsEndpoint + ", hpcsPort=" + hpcsPort + "]";
	}
}
