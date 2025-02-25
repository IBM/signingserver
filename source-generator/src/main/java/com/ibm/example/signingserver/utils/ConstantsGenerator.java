// Copyright contributors to the Signing Server project
package com.ibm.example.signingserver.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

import javax.net.ssl.HttpsURLConnection;

public class ConstantsGenerator {
    private static final Set<String> names = new HashSet<>();

    public static void main(String[] args) throws Exception {
        final File file = new File(args[0]);
        if (!file.exists()) {
            file.createNewFile();
        }
        final FileWriter fw = new FileWriter(file);
        final PrintWriter pw = new PrintWriter(fw);
        pw.println("// generated code");
        pw.println("package com.ibm.example.signingserver.cryptoclient;");
        pw.println("\npublic class Constants {");

        processHeadersFile("https://raw.githubusercontent.com/IBM-Cloud/hpcs-grep11/master/pkcs11t.h", pw);
        processHeadersFile("https://raw.githubusercontent.com/IBM-Cloud/hpcs-grep11/master/ep11.h", pw);
        pw.println("}");
        pw.close();
    }

    private static void processHeadersFile(final String filename, final PrintWriter pw) throws MalformedURLException, IOException {
        URL link = new URL(filename);
        HttpsURLConnection con = (HttpsURLConnection)link.openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
        while(true){
            String line = reader.readLine();
            if (line == null) break;
            if (line.startsWith("#define ")) {
                line = line.substring(8).trim();
                if (!line.startsWith("_")) {
                    final int pos = line.indexOf(" ");
                    if (pos > 0) {
                        final String name = line.substring(0,pos).trim();
                        if (name.startsWith("CK") && !name.startsWith("CK_") && names.add(name)) {
                            String value = line.substring(pos).trim();
                            int rem = value.indexOf("/");
                            if (rem>0) {
                                value = value.substring(0, rem).trim();
                            }
                            if (value.endsWith("UL")) {
                                value = value.substring(0, value.length()-2).trim();
                            }
                            if (value.endsWith("UL)")) {
                                value = value.substring(0, value.length()-3) + ")".trim();
                            }
                            if (!value.endsWith(")") && !value.endsWith("S")) {
                                value = value + "L";
                            }
                            pw.println("    public static final long " + name + " = " + value + ";");
                        }
                    }
                }
            }
        }
        reader.close();
    }
}
