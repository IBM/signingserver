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
package com.ibm.example.cryptoclient;

import com.google.protobuf.ByteString;

public class KeyPair {
	
	public enum Type {
		EC,
		Dilithium
	}
	
	private final ByteString pubKey;
	private final ByteString privKey;
	private final Type type;
	
	public KeyPair(final ByteString pubKey, final ByteString privKey, final Type type) {
		this.pubKey = pubKey;
		this.privKey = privKey;
		this.type = type;
	}
	
	public KeyPair(final KeyPair base) {
		this.pubKey = base.pubKey;
		this.privKey = base.privKey;
		this.type = base.type;
	}

	public ByteString getPubKey() {
		return pubKey;
	}
	
	public ByteString getPrivKey() {
		return privKey;
	}
	
	public Type getType() {
		return type;
	}
}
