// Copyright contributors to the Signing Server project
package com.ibm.example.signingserver.utils;

import javax.ws.rs.core.Response;

public class Errors {
    public static Response cannotCreateKey() {
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("ERROR: Cannot create key.").build();
    }

    public static Response cryptoOperationFailed() {
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("ERROR: Cryptographic operation failed.").build();
    }

    public static Response keyNotFound() {
        return Response.status(Response.Status.NOT_FOUND).entity("ERROR: Expected key not found.").build();
    }

    public static Response dataInvalid() {
        return Response.status(Response.Status.BAD_REQUEST).entity("ERROR: Invalid data provided. Cannot decode data.").build();
    }

    public static Response verificationFailed() {
        return Response.status(Response.Status.BAD_REQUEST).entity("Signature verification failed.").build();
    }

    public static Response keyTypeMissing() {
        return Response.status(Response.Status.BAD_REQUEST).entity("ERROR: The key type is missing or invalid.").build();
    }

    public static Response badRequest() {
        return Response.status(Response.Status.BAD_REQUEST).build();
    }
}
