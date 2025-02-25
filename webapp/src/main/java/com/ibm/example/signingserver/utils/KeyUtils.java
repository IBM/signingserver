// Copyright contributors to the Signing Server project
package com.ibm.example.signingserver.utils;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EdECPoint;
import java.security.spec.EdECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.NamedParameterSpec;

import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.jce.ECNamedCurveTable;
import org.bouncycastle.jce.ECPointUtil;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemWriter;

public class KeyUtils {
    private static final String PUBLIC_KEY = "PUBLIC KEY";
    private static final String ED25519 = "Ed25519";
    private static final String ECDSA = "ECDSA";
    private static final String SECP256K1 = "secp256k1";

    private static KeyFactory ECDSAKeyFactory;
    private static KeyFactory EDDSAKeyFactory;
    private static ECNamedCurveSpec ECDSANamedCurveSpec;

    public static String getECPublicKeyPEM(final byte[] pubKey)
            throws NoSuchAlgorithmException, InvalidKeySpecException, IOException
    {
        try (ASN1InputStream input = new ASN1InputStream(pubKey)) {
            final ASN1Sequence sequence = ASN1Sequence.getInstance(input.readObject());
            final ECNamedCurveSpec params = getECNamedCurveSpec();
            final ECPoint point = ECPointUtil.decodePoint(params.getCurve(),
                    ((DERBitString) sequence.getObjectAt(1)).getBytes());
            final ECPublicKeySpec pubKeySpec = new ECPublicKeySpec(point, params);
            return getPublicKeyPEM(getECDSAKeyFactory(), pubKeySpec);
        }
    }

    public static String getED25519PublicKeyPEM(final byte[] pubKey)
            throws NoSuchAlgorithmException, InvalidKeySpecException, IOException
    {
        try (ASN1InputStream input = new ASN1InputStream(pubKey)) {
            final ASN1Sequence sequence = ASN1Sequence.getInstance(input.readObject());
            final byte[] pk = ((DERBitString) sequence.getObjectAt(1)).getBytes();
            boolean xOdd = false;
            final int lastbyteInt = pk[pk.length - 1];
            if ((lastbyteInt & 255) >> 7 == 1) {
                xOdd = true;
            }
            pk[pk.length - 1] &= 127;
            reverse(pk);
            final EdECPoint point = new EdECPoint(xOdd, new BigInteger(1, pk));
            final EdECPublicKeySpec keySpec = new EdECPublicKeySpec(NamedParameterSpec.ED25519, point);
            return getPublicKeyPEM(getEDDSAKeyFactory(), keySpec);
        }
    }

    private static String getPublicKeyPEM(final KeyFactory keyFactory, final KeySpec pubKeySpec) throws IOException, InvalidKeySpecException {
        final PublicKey pk = keyFactory.generatePublic(pubKeySpec);
        final StringWriter stringWriter = new StringWriter();
        final PemWriter writer = new PemWriter(stringWriter);
        writer.writeObject(new PemObject(PUBLIC_KEY, pk.getEncoded()));
        writer.close();
        return stringWriter.toString();
    }

    private static void reverse(final byte[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            final byte tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
    }

    private static ECNamedCurveSpec getECNamedCurveSpec() {
        if (ECDSANamedCurveSpec == null) {
            final ECNamedCurveParameterSpec spec = ECNamedCurveTable.getParameterSpec(SECP256K1);
            ECDSANamedCurveSpec = new ECNamedCurveSpec(SECP256K1, spec.getCurve(), spec.getG(), spec.getN());
        }
        return ECDSANamedCurveSpec;
    }

    private static KeyFactory getECDSAKeyFactory() throws NoSuchAlgorithmException {
        if (ECDSAKeyFactory == null) {
            ECDSAKeyFactory = KeyFactory.getInstance(ECDSA, new BouncyCastleProvider());
        }
        return ECDSAKeyFactory;
    }

    private static KeyFactory getEDDSAKeyFactory() throws NoSuchAlgorithmException {
        if (EDDSAKeyFactory == null) {
            EDDSAKeyFactory = KeyFactory.getInstance(ED25519);
        }
        return EDDSAKeyFactory;
    }

}
