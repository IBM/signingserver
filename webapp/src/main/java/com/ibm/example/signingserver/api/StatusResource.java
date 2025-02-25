// Copyright contributors to the Signing Server project
package com.ibm.example.signingserver.api;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ibm.example.signingserver.cryptoclient.CryptoClient;
import com.ibm.example.signingserver.utils.Config;


@Path("status")
public class StatusResource {
    private static final Logger LOGGER = Logger.getLogger(StatusResource.class.getName());

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getStatus() throws Exception {
        boolean ok = false;
        try {
            final CryptoClient client = CryptoClient.getInstance();
            ok = client.checkMechanisms(false);
            if (!ok) {
                LOGGER.warning("could not validate mechanism list");
            }
        }
        catch (Exception e) {
            LOGGER.log(Level.SEVERE, "getStatus checkMechanism failed", e.getMessage());
        }

        boolean ok2 = false;
        try {
            final File keystore = new File(Config.getInstance().getKeyStorePath());
            ok2 = keystore.isDirectory() && keystore.canWrite();
            if (!ok2) {
                LOGGER.warning("could not validate keystore directory");
            }
        }
        catch (Exception e) {
            LOGGER.log(Level.SEVERE, "getStatus keystore directory check failed", e.getMessage());
        }

        ok = ok && ok2;

        if (ok) {
            return Response.ok("OK").build();
        }
        else {
            return Response.status(500, "ERROR").build();
        }
    }
}
