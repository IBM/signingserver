// Copyright contributors to the Signing Server project
package com.ibm.example.signingserver;

import javax.ws.rs.core.Application;

import com.ibm.example.signingserver.utils.Config;

import java.util.logging.Logger;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("api/v2")
public class SigningApplication extends Application {
    private static final Logger LOGGER = Logger.getLogger(SigningApplication.class.getName());

    public SigningApplication() {
        super();

        LOGGER.info("SigningApplication started using "+Config.getInstanceUnVerified().toString());
    }

}
