#!/usr/bin/bash
export KEYSTORE_PATH=/data/signingservice/keys
mkdir -p $KEYSTORE_PATH
/wlp/bin/server run default
