// Copyright contributors to the Signing Server project
package com.ibm.example.signingserver.api;

import com.ibm.example.signingserver.cryptoclient.KeyPair;

public class Request {

    private String data;
    private String signature;
    private String id;
    private String pubKey;
    private KeyPair.Type type;

    public String getSignature() {
        return signature;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPubKey() {
        return pubKey;
    }

    public void setPubKey(String pubKey) {
        this.pubKey = pubKey;
    }

    public KeyPair.Type getType() {
        return type;
    }

    public void setType(KeyPair.Type type) {
        this.type = type;
    }

}
