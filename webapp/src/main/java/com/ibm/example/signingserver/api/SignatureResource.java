// Copyright contributors to the Signing Server project
package com.ibm.example.signingserver.api;

import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.protobuf.ByteString;
import com.ibm.example.signingserver.utils.KeyStore;
import com.ibm.example.signingserver.cryptoclient.CryptoClient;
import com.ibm.example.signingserver.cryptoclient.KeyPair;
import com.ibm.example.signingserver.utils.Errors;

@Path("sign")
public class SignatureResource {
    private static final Logger LOGGER = Logger.getLogger(SignatureResource.class.getName());
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response sign(final Request request) throws Exception {
        try {
            final ByteString data = ByteString.copyFrom(Base64.getDecoder().decode(request.getData()));
            final KeyPair keypair = KeyStore.getKeyPair(request.getId());
            try {
                final ByteString signature = CryptoClient.getInstance().sign(keypair.getPrivKey(), data,
                        keypair.getType());
                return Response.ok(Base64.getEncoder().encode(signature.toByteArray())).build();
            } catch (Exception e) {
                return Errors.cryptoOperationFailed();
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "sign error", e.getMessage());
            return Errors.badRequest();
        }
    }

}
