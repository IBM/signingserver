// Copyright contributors to the Signing Server project
package com.ibm.example.signingserver.cryptoclient;

import com.ibm.crypto.grep11.grpc.KeyBlob;

public class KeyPair {

    public enum Type {
        Dilithium,
        ECDSA_SECP256K1,
        EDDSA_ED25519
    }

    private final KeyBlob pubKey;
    private final KeyBlob privKey;
    private final Type type;

    public KeyPair(final KeyBlob pubKey, final KeyBlob privKey, final Type type) {
        this.pubKey = pubKey;
        this.privKey = privKey;
        this.type = type;
    }

    public KeyPair(final KeyPair base) {
        this.pubKey = base.pubKey;
        this.privKey = base.privKey;
        this.type = base.type;
    }

    public KeyBlob getPubKey() {
        return pubKey;
    }

    public KeyBlob getPrivKey() {
        return privKey;
    }

    public Type getType() {
        return type;
    }
}
