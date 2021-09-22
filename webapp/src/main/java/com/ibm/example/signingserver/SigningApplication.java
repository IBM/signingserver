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
package com.ibm.example.signingserver;

import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("api/v1")
public class SigningApplication extends Application {
	public SigningApplication() {
		super();
		
		try {
			Config.getInstance().setHpcsAPIKey(System.getenv("API_KEY"));
			Config.getInstance().setHpcsPort(Integer.valueOf(System.getenv("HPCS_PORT")));
			Config.getInstance().setHpcsInstanceId(System.getenv("HPCS_INSTANCEID"));

			Config.getInstance().setHpcsEndpoint(System.getenv("HPCS_ENDPOINT"));
			Config.getInstance().setKeyStorageFolder("/data/signingservice/keys/");
			
			Config.getInstance().setDbPW(System.getenv("DB_PW"));
			Config.getInstance().setDbURL(System.getenv("DB_URL"));
			Config.getInstance().setDbUser(System.getenv("DB_USER"));
			Config.getInstance().setDbReplicaSet(System.getenv("DB_REPLICASET"));

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("SigningApplication started using "+Config.getInstance().toString());
	}

}
