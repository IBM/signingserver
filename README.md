# A signing server for quantum-safe cryptography with IBM Cloud Hyper Protect Crypto Services

## Overview

This example application shows how to build and run an quantum-safe signing server. The signing server provides REST APIs to create and use Dilithium signing keys for quantum-safe signing. In addition, the application also illustrates how to use less quantum resistant types of signatures using elliptic curve cryptography. The signing server will use [IBM Cloud Hyper Protect Crypto Services](https://www.ibm.com/products/hyper-protect-crypto) as a Cloud HSM to create and use the signing keys.

The signing server is implemented in Java on basis of Open Liberty. It uses the Enterprise PKCS #11 over gRPC (GREP11) API to create keys, sign data and verify signatures in a IBM Cloud Hyper Protect Crypto Services instance.

This example illustrates:

- How to create and use Dilithium keys for quantum-safe signatures
- How to create and use Elliptic Curve keys for signing data
- How to use the Enterprise PKCS #11 over gRPC (GREP11) API from Java code
- How to create an Apache Maven project to generate Java code for using the GREP11 API and to build the signing server web application

## Prerequisites

To run the signing server, you need to meet the following prerequisites:
- Create an IBM Cloud account
- Create and initialize a IBM Cloud Hyper Protect Crypto Services instance and note its instance id and its EP11 API endpoint address and port
- Create an API key for a id which provides the required access on your IBM Cloud Hyper Protect Crypto Services instance

To setup a development environment on your workstation, you need to meet the following prerequisites:
- Install JDK 11 or newer
- Install Apache Maven
- Install the gRPC compiler from [link](https://developers.google.com/protocol-buffers).
- Install git

## Build the signing server application

### Clone the signing server repository
Clone the signing server repository. In a terminal, run:

```
git clone https://github.com/IBM/signingserver
```

### Build the signing server application
To build the signing server application:
- Make sure the gRPC compiler `protoc` is included in your path, e.g. by running the following command:

```
export PATH="/path/bin:$PATH"
```

- Run the command following command in the signing server source folder:

```
mvn clean install
```

The Maven build comprises the following steps:
- It builds a submodule `source-generator`. This submodule contains a simple source code generator to generate EP11 and PKCS11 related constants.
- It runs this code generator to generate a class comprising said constants.
- It downloads the GREP11 proto file and invokes the gRPC compiler to compile this file.
- It compiles the source files including all the generated code.
- It creates the signing server web application file `webapp.war`

### Build the container image
Use e.g. the following command to build the signing server container image: 

```
podman build . -t signingserver
```

### Run the container image

Use the following command to run the signing server container. Specify the properties of your IBM Cloud Hyper Protect Crypto Services instance in form of environment variables:

```
podman run -it -p 9443:9443 -e API_KEY=<your api key> -e HPCS_PORT=<port, e.g. 443> -e HPCS_INSTANCEID=<instance id> -e HPCS_ENDPOINT=<EP11 API endpoint> signingserver
```

## Run the application in IBM Cloud Hyper Protect Virtual Server
Optionally, you can run the signing server in [IBM Cloud Hyper Protect Virtual Server](https://www.ibm.com/de-de/products/hyper-protect-virtual-servers) to protect the sensitive data that is in use by the signing server, such as the private keys, in Confidential Computing. 

## Use the application

The signing server provides a REST API through https port 9443. You can use your favorite REST or HTTP client to invoke the REST API or invoke the REST API from command line, as shown in the following examples:

#### Create a Dilithium key pair
```
curl -k --request POST \
  --url https://<ip>:9443/signing/api/v2/keys \
  --header 'Content-Type: application/json' \
  --data '{}'
```

This returns the id of the newly created key pair and the public key, e.g.
 
```
{
  "id": "8b3e7169-e4a1-44cc-acf4-c3c4875f4fa2",
  "pubKey": "MDMwDgYHKoZIzj0CAQYDK2VwAy..."
}
```

#### Create a ED25519 key pair

Provide query parameter `type=EDDSA_ED25519` or `type=EC`:
```
curl -k --request POST \
  --url https://<ip>:9443/signing/api/v2/keys?type=EC \
  --header 'Content-Type: application/json' \
  --data '{}'
```

This returns the id of the newly created key pair and the public key, e.g.
 
```
{
  "id": "9b3e7169-e4a1-44cc-acf4-c3c4875f4fa3",
  "pubKeyPEM": "...public-key-pem..."
}
```

#### Create a EC SECP256K1 key pair
```
curl -k --request POST \
  --url https://<ip>:9443/signing/api/v2/keys?type=ECDSA_SECP256K1 \
  --header 'Content-Type: application/json' \
  --data '{}'
```

This returns the id of the newly created key pair and the public key, e.g.
 
```
{
  "id": "9b3e7169-e4a1-44cc-acf4-c3c4875f4fa3",
  "pubKeyPEM": "...public-key-pem..."
}
```

#### Sign data

Specify the id of a previously generated key and base64-encoded data to be signed:

```
curl -k --request POST \
  --url https://<ip>:9443/signing/api/v2/sign \
  --header 'Content-Type: application/json' \
  --data '{
	"id": "8b3e7169-e4a1-44cc-acf4-c3c4875f4fa2",
	"data" : "SGFsbG8gZGFzIGlzdCBlaW4gVGVzdA=="
}'
```

This returns the base64-encoded signature in plain text, e.g.:

```
vSqKTh693H8FC3Qwt2PP/sUIIqndOtGEi4bcPIddbWAt/0eT2HWa5o9RMidS4/74e0XMpC5JW4IztCDsZRyWBg==
```

#### Verify signature

Specify the key id, the base-64 encoded data and the base64-encoded signature to be verified:

```
curl -i -k --request POST \
  --url https://<ip>:9443/signing/api/v2/verify \
  --header 'Content-Type: application/json' \
  --data '{
	 "id": "8b3e7169-e4a1-44cc-acf4-c3c4875f4fa2",
	 "data" : "SGFsbG8gZGFzIGlzdCBlaW4gVGVzdA==",
	 "signature" : "vSqKTh693H8FC3Qwt2PP/sUIIqndOtGEi4bcPIddbWAt/0eT2HWa5o9RMidS4/74e0XMpC5JW4IztCDsZRyWBg=="
}'
```

If the verification is successful this API returns response status code 200.

If the verification fails, the API returns response error code 400 and error message `Signature verification failed.`.
