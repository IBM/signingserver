#!/usr/bin/bash
if [ -f /data/signingservice/dbca.pem ]; then
   echo "File exists. Nothing to do."
else
   echo "Importing certificate."
   echo $DB_CERT1$DB_CERT2 | base64 -d > /data/signingservice/dbca.pem
   keytool -import -alias dbca -file /data/signingservice/dbca.pem -keystore /wlp/usr/servers/default/resources/security/trust.p12 -storepass changeit -storetype PKCS12 -noprompt
fi
/wlp/bin/server run default
