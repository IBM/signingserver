#!/usr/bin/bash
mkdir -p /data/signingservice/keys

echo $DB_CERT1 | base64 -d > /data/signingservice/dbca1.pem
keytool -import -alias dbca1 -file /data/signingservice/dbca1.pem -keystore /wlp/usr/servers/default/resources/security/trust.p12 -storepass changeit -storetype PKCS12 -noprompt
echo $DB_CERT2 | base64 -d > /data/signingservice/dbca2.pem
keytool -import -alias dbca2 -file /data/signingservice/dbca2.pem -keystore /wlp/usr/servers/default/resources/security/trust.p12 -storepass changeit -storetype PKCS12 -noprompt

/wlp/bin/server run default
