// Copyright contributors to the Signing Server project
package com.ibm.example.signingserver.api;

import com.ibm.example.signingserver.cryptoclient.KeyPair;

public class Response {
    private String pubKey;
    private String pubKeyPEM;
    private String signature;
    private String result;
    private String id;
    private KeyPair.Type type;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public KeyPair.Type getType() {
        return type;
    }
    public void setType(KeyPair.Type type) {
        this.type = type;
    }
    public String getPubKey() {
        return pubKey;
    }
    public void setPubKey(String pubKey) {
        this.pubKey = pubKey;
    }
    public String getPubKeyPEM() {
        return pubKeyPEM;
    }
    public void setPubKeyPEM(String pubKeyPEM) {
        this.pubKeyPEM = pubKeyPEM;
    }
    public String getSignature() {
        return signature;
    }
    public void setSignature(String signature) {
        this.signature = signature;
    }
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
}
