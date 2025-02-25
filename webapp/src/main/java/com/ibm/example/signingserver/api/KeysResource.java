// Copyright contributors to the Signing Server project
package com.ibm.example.signingserver.api;

import static java.nio.charset.StandardCharsets.UTF_8;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;


import com.ibm.example.signingserver.utils.KeyStore;
import com.ibm.example.signingserver.utils.KeyUtils;
import com.ibm.example.signingserver.cryptoclient.CryptoClient;
import com.ibm.example.signingserver.cryptoclient.KeyPair;
import com.ibm.example.signingserver.utils.Errors;

@Path("keys")
public class KeysResource {
    private static final Logger LOGGER = Logger.getLogger(KeysResource.class.getName());
    private static final String TYPE = "type";

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response createKeyPair(@Context UriInfo info) throws Exception {
        final String type = info.getQueryParameters().getFirst(TYPE);
        final KeyPair.Type keyType;
        if (type == null) {
            keyType = KeyPair.Type.Dilithium;
        }
        else if ("EC".equals(type)) {
            keyType = KeyPair.Type.EDDSA_ED25519;
        }
        else {
            try {
                keyType = KeyPair.Type.valueOf(type);
            } catch (Exception e) {
                return Errors.keyTypeMissing();
            }
        }
        try {
            final KeyPair keypair = CryptoClient.getInstance().createKeyPair(keyType);
            final String id = KeyStore.storeKeyPair(keypair);
            return createResponse(id, keypair);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "createKeyPair error", e);
            return Errors.cannotCreateKey();
        }
    }


    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getKeyInfo(@PathParam("id") String id) throws Exception {
        try {
            final KeyPair keypair = KeyStore.getKeyPair(id);
            if (keypair == null) {
                return Errors.keyNotFound();
            }
            return createResponse(id, keypair);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "getKeyInfo error", e);
            return Errors.keyNotFound();
        }
    }

    private Response createResponse(final String id, final KeyPair keypair) throws NoSuchAlgorithmException, InvalidKeySpecException, IOException {
        final com.ibm.example.signingserver.api.Response resp = new com.ibm.example.signingserver.api.Response();
        resp.setId(id);
        resp.setType(keypair.getType());
        resp.setPubKey(new String(Base64.getEncoder().encode(keypair.getPubKey().toByteArray()), UTF_8.name()));
        if (KeyPair.Type.ECDSA_SECP256K1.equals(keypair.getType())) {
            resp.setPubKeyPEM(KeyUtils.getECPublicKeyPEM(keypair.getPubKey().getKeyBlobs(0).toByteArray()));
        }
        else if (KeyPair.Type.EDDSA_ED25519.equals(keypair.getType())) {
            resp.setPubKeyPEM(KeyUtils.getED25519PublicKeyPEM(keypair.getPubKey().getKeyBlobs(0).toByteArray()));
        }
        LOGGER.log(Level.INFO, "Key pair created", new Object[] {resp.getType(), resp.getId(), resp.getPubKeyPEM()});
        return Response.ok(resp, MediaType.APPLICATION_JSON).build();
    }

}
