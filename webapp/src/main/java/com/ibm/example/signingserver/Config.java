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

public class Config {
	
	public String getHpcsEndpoint() {
		return hpcsEndpoint;
	}

	public void setHpcsEndpoint(String hpcsEndpoint) {
		this.hpcsEndpoint = hpcsEndpoint;
	}

	public int getHpcsPort() {
		return hpcsport;
	}

	public void setHpcsPort(int hpcsport) {
		this.hpcsport= hpcsport;
	}

	public String getHpcsAPIKey() {
		return hpcsAPIKey;
	}

	public void setHpcsAPIKey(String hpcsAPIKey) {
		this.hpcsAPIKey = hpcsAPIKey;
	}

	public String getHpcsInstanceId() {
		return hpcsInstanceId;
	}

	public void setHpcsInstanceId(String hpcsInstanceId) {
		this.hpcsInstanceId = hpcsInstanceId;
	}

	public String getTaTLSCertificate() {
		return taTLSCertificate;
	}

	public void setTaTLSCertificate(String taTLSCertificate) {
		this.taTLSCertificate = taTLSCertificate;
	}

	public String getTaCA() {
		return taCA;
	}

	public void setTaCA(String taCA) {
		this.taCA = taCA;
	}

	public String getKeyStorageFolder() {
		return keyStorageFolder;
	}

	public void setKeyStorageFolder(String keyStorageFolder) {
		this.keyStorageFolder = keyStorageFolder;
	}

	public String getDbURL() {
		return dbURL;
	}

	public void setDbURL(String dbURL) {
		this.dbURL = dbURL;
	}

	public String getDbPW() {
		return dbPW;
	}

	public void setDbPW(String dbPW) {
		this.dbPW = dbPW;
	}

	public String getDbUser() {
		return dbUser;
	}

	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}

	public String getDbReplicaSet() {
		return dbReplicaSet;
	}

	public void setDbReplicaSet(String dbReplicaSet) {
		this.dbReplicaSet = dbReplicaSet;
	}

	public static Config getInstance() {
		return INSTANCE;
	}

	private final static Config INSTANCE = new Config();
	
	private String hpcsEndpoint;
	@Override
	public String toString() {
		return "Config [hpcsEndpoint=" + hpcsEndpoint + ", hpcsport=" + hpcsport + ", hpcsAPIKey=" + hpcsAPIKey
				+ ", hpcsInstanceId=" + hpcsInstanceId + ", taTLSCertificate=" + taTLSCertificate + ", taCA=" + taCA
				+ ", keyStorageFolder=" + keyStorageFolder + ", dbURL=" + dbURL + ", dbPW=" + dbPW + ", dbUser="
				+ dbUser + ", dbReplicaSet=" + dbReplicaSet + "]";
	}

	private int hpcsport;
	private String hpcsAPIKey;
	private String hpcsInstanceId;
	private String taTLSCertificate;
	private String taCA;
	
	private String keyStorageFolder;
	
	private String dbURL;
	private String dbPW;
	private String dbUser;
	private String dbReplicaSet;

	private Config() {
	}
}
