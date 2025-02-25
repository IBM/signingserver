#!/usr/bin/bash
export KEYSTORE_PATH=/data/signingservice/keys
mkdir -p $KEYSTORE_PATH
/wlp/bin/server run default

if [ -z "$(ls -A /data/signingservice/keys)" ]; then
  echo "Creating default key pairs"
  curl --request POST --url http://localhost:9080/signing/api/v2/keys?type=ECDSA_SECP256K1 --header 'Content-Type: application/json' --data '{}'
  echo -e "\n"
  curl --request POST --url http://localhost:9080/signing/api/v2/keys?type=EDDSA_ED25519 --header 'Content-Type: application/json' --data '{}'
  echo -e "\n"
fi

tail -f -n +1 /wlp/usr/servers/default/logs/console.log
