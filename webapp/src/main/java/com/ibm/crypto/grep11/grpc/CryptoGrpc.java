package com.ibm.crypto.grep11.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.0)",
    comments = "Source: server.proto")
public final class CryptoGrpc {

  private CryptoGrpc() {}

  public static final String SERVICE_NAME = "grep11.Crypto";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.GenerateRandomRequest,
      com.ibm.crypto.grep11.grpc.GenerateRandomResponse> getGenerateRandomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateRandom",
      requestType = com.ibm.crypto.grep11.grpc.GenerateRandomRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.GenerateRandomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.GenerateRandomRequest,
      com.ibm.crypto.grep11.grpc.GenerateRandomResponse> getGenerateRandomMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.GenerateRandomRequest, com.ibm.crypto.grep11.grpc.GenerateRandomResponse> getGenerateRandomMethod;
    if ((getGenerateRandomMethod = CryptoGrpc.getGenerateRandomMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getGenerateRandomMethod = CryptoGrpc.getGenerateRandomMethod) == null) {
          CryptoGrpc.getGenerateRandomMethod = getGenerateRandomMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.GenerateRandomRequest, com.ibm.crypto.grep11.grpc.GenerateRandomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateRandom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.GenerateRandomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.GenerateRandomResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("GenerateRandom"))
              .build();
        }
      }
    }
    return getGenerateRandomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DigestInitRequest,
      com.ibm.crypto.grep11.grpc.DigestInitResponse> getDigestInitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DigestInit",
      requestType = com.ibm.crypto.grep11.grpc.DigestInitRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.DigestInitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DigestInitRequest,
      com.ibm.crypto.grep11.grpc.DigestInitResponse> getDigestInitMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DigestInitRequest, com.ibm.crypto.grep11.grpc.DigestInitResponse> getDigestInitMethod;
    if ((getDigestInitMethod = CryptoGrpc.getDigestInitMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getDigestInitMethod = CryptoGrpc.getDigestInitMethod) == null) {
          CryptoGrpc.getDigestInitMethod = getDigestInitMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.DigestInitRequest, com.ibm.crypto.grep11.grpc.DigestInitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DigestInit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.DigestInitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.DigestInitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("DigestInit"))
              .build();
        }
      }
    }
    return getDigestInitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DigestRequest,
      com.ibm.crypto.grep11.grpc.DigestResponse> getDigestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Digest",
      requestType = com.ibm.crypto.grep11.grpc.DigestRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.DigestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DigestRequest,
      com.ibm.crypto.grep11.grpc.DigestResponse> getDigestMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DigestRequest, com.ibm.crypto.grep11.grpc.DigestResponse> getDigestMethod;
    if ((getDigestMethod = CryptoGrpc.getDigestMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getDigestMethod = CryptoGrpc.getDigestMethod) == null) {
          CryptoGrpc.getDigestMethod = getDigestMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.DigestRequest, com.ibm.crypto.grep11.grpc.DigestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Digest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.DigestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.DigestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("Digest"))
              .build();
        }
      }
    }
    return getDigestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DigestUpdateRequest,
      com.ibm.crypto.grep11.grpc.DigestUpdateResponse> getDigestUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DigestUpdate",
      requestType = com.ibm.crypto.grep11.grpc.DigestUpdateRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.DigestUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DigestUpdateRequest,
      com.ibm.crypto.grep11.grpc.DigestUpdateResponse> getDigestUpdateMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DigestUpdateRequest, com.ibm.crypto.grep11.grpc.DigestUpdateResponse> getDigestUpdateMethod;
    if ((getDigestUpdateMethod = CryptoGrpc.getDigestUpdateMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getDigestUpdateMethod = CryptoGrpc.getDigestUpdateMethod) == null) {
          CryptoGrpc.getDigestUpdateMethod = getDigestUpdateMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.DigestUpdateRequest, com.ibm.crypto.grep11.grpc.DigestUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DigestUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.DigestUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.DigestUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("DigestUpdate"))
              .build();
        }
      }
    }
    return getDigestUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DigestKeyRequest,
      com.ibm.crypto.grep11.grpc.DigestKeyResponse> getDigestKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DigestKey",
      requestType = com.ibm.crypto.grep11.grpc.DigestKeyRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.DigestKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DigestKeyRequest,
      com.ibm.crypto.grep11.grpc.DigestKeyResponse> getDigestKeyMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DigestKeyRequest, com.ibm.crypto.grep11.grpc.DigestKeyResponse> getDigestKeyMethod;
    if ((getDigestKeyMethod = CryptoGrpc.getDigestKeyMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getDigestKeyMethod = CryptoGrpc.getDigestKeyMethod) == null) {
          CryptoGrpc.getDigestKeyMethod = getDigestKeyMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.DigestKeyRequest, com.ibm.crypto.grep11.grpc.DigestKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DigestKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.DigestKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.DigestKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("DigestKey"))
              .build();
        }
      }
    }
    return getDigestKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DigestFinalRequest,
      com.ibm.crypto.grep11.grpc.DigestFinalResponse> getDigestFinalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DigestFinal",
      requestType = com.ibm.crypto.grep11.grpc.DigestFinalRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.DigestFinalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DigestFinalRequest,
      com.ibm.crypto.grep11.grpc.DigestFinalResponse> getDigestFinalMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DigestFinalRequest, com.ibm.crypto.grep11.grpc.DigestFinalResponse> getDigestFinalMethod;
    if ((getDigestFinalMethod = CryptoGrpc.getDigestFinalMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getDigestFinalMethod = CryptoGrpc.getDigestFinalMethod) == null) {
          CryptoGrpc.getDigestFinalMethod = getDigestFinalMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.DigestFinalRequest, com.ibm.crypto.grep11.grpc.DigestFinalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DigestFinal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.DigestFinalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.DigestFinalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("DigestFinal"))
              .build();
        }
      }
    }
    return getDigestFinalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DigestSingleRequest,
      com.ibm.crypto.grep11.grpc.DigestSingleResponse> getDigestSingleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DigestSingle",
      requestType = com.ibm.crypto.grep11.grpc.DigestSingleRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.DigestSingleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DigestSingleRequest,
      com.ibm.crypto.grep11.grpc.DigestSingleResponse> getDigestSingleMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DigestSingleRequest, com.ibm.crypto.grep11.grpc.DigestSingleResponse> getDigestSingleMethod;
    if ((getDigestSingleMethod = CryptoGrpc.getDigestSingleMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getDigestSingleMethod = CryptoGrpc.getDigestSingleMethod) == null) {
          CryptoGrpc.getDigestSingleMethod = getDigestSingleMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.DigestSingleRequest, com.ibm.crypto.grep11.grpc.DigestSingleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DigestSingle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.DigestSingleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.DigestSingleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("DigestSingle"))
              .build();
        }
      }
    }
    return getDigestSingleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.EncryptInitRequest,
      com.ibm.crypto.grep11.grpc.EncryptInitResponse> getEncryptInitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EncryptInit",
      requestType = com.ibm.crypto.grep11.grpc.EncryptInitRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.EncryptInitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.EncryptInitRequest,
      com.ibm.crypto.grep11.grpc.EncryptInitResponse> getEncryptInitMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.EncryptInitRequest, com.ibm.crypto.grep11.grpc.EncryptInitResponse> getEncryptInitMethod;
    if ((getEncryptInitMethod = CryptoGrpc.getEncryptInitMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getEncryptInitMethod = CryptoGrpc.getEncryptInitMethod) == null) {
          CryptoGrpc.getEncryptInitMethod = getEncryptInitMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.EncryptInitRequest, com.ibm.crypto.grep11.grpc.EncryptInitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EncryptInit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.EncryptInitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.EncryptInitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("EncryptInit"))
              .build();
        }
      }
    }
    return getEncryptInitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DecryptInitRequest,
      com.ibm.crypto.grep11.grpc.DecryptInitResponse> getDecryptInitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DecryptInit",
      requestType = com.ibm.crypto.grep11.grpc.DecryptInitRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.DecryptInitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DecryptInitRequest,
      com.ibm.crypto.grep11.grpc.DecryptInitResponse> getDecryptInitMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DecryptInitRequest, com.ibm.crypto.grep11.grpc.DecryptInitResponse> getDecryptInitMethod;
    if ((getDecryptInitMethod = CryptoGrpc.getDecryptInitMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getDecryptInitMethod = CryptoGrpc.getDecryptInitMethod) == null) {
          CryptoGrpc.getDecryptInitMethod = getDecryptInitMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.DecryptInitRequest, com.ibm.crypto.grep11.grpc.DecryptInitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DecryptInit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.DecryptInitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.DecryptInitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("DecryptInit"))
              .build();
        }
      }
    }
    return getDecryptInitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.EncryptUpdateRequest,
      com.ibm.crypto.grep11.grpc.EncryptUpdateResponse> getEncryptUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EncryptUpdate",
      requestType = com.ibm.crypto.grep11.grpc.EncryptUpdateRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.EncryptUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.EncryptUpdateRequest,
      com.ibm.crypto.grep11.grpc.EncryptUpdateResponse> getEncryptUpdateMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.EncryptUpdateRequest, com.ibm.crypto.grep11.grpc.EncryptUpdateResponse> getEncryptUpdateMethod;
    if ((getEncryptUpdateMethod = CryptoGrpc.getEncryptUpdateMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getEncryptUpdateMethod = CryptoGrpc.getEncryptUpdateMethod) == null) {
          CryptoGrpc.getEncryptUpdateMethod = getEncryptUpdateMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.EncryptUpdateRequest, com.ibm.crypto.grep11.grpc.EncryptUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EncryptUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.EncryptUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.EncryptUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("EncryptUpdate"))
              .build();
        }
      }
    }
    return getEncryptUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DecryptUpdateRequest,
      com.ibm.crypto.grep11.grpc.DecryptUpdateResponse> getDecryptUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DecryptUpdate",
      requestType = com.ibm.crypto.grep11.grpc.DecryptUpdateRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.DecryptUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DecryptUpdateRequest,
      com.ibm.crypto.grep11.grpc.DecryptUpdateResponse> getDecryptUpdateMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DecryptUpdateRequest, com.ibm.crypto.grep11.grpc.DecryptUpdateResponse> getDecryptUpdateMethod;
    if ((getDecryptUpdateMethod = CryptoGrpc.getDecryptUpdateMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getDecryptUpdateMethod = CryptoGrpc.getDecryptUpdateMethod) == null) {
          CryptoGrpc.getDecryptUpdateMethod = getDecryptUpdateMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.DecryptUpdateRequest, com.ibm.crypto.grep11.grpc.DecryptUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DecryptUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.DecryptUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.DecryptUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("DecryptUpdate"))
              .build();
        }
      }
    }
    return getDecryptUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.EncryptRequest,
      com.ibm.crypto.grep11.grpc.EncryptResponse> getEncryptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Encrypt",
      requestType = com.ibm.crypto.grep11.grpc.EncryptRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.EncryptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.EncryptRequest,
      com.ibm.crypto.grep11.grpc.EncryptResponse> getEncryptMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.EncryptRequest, com.ibm.crypto.grep11.grpc.EncryptResponse> getEncryptMethod;
    if ((getEncryptMethod = CryptoGrpc.getEncryptMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getEncryptMethod = CryptoGrpc.getEncryptMethod) == null) {
          CryptoGrpc.getEncryptMethod = getEncryptMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.EncryptRequest, com.ibm.crypto.grep11.grpc.EncryptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Encrypt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.EncryptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.EncryptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("Encrypt"))
              .build();
        }
      }
    }
    return getEncryptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DecryptRequest,
      com.ibm.crypto.grep11.grpc.DecryptResponse> getDecryptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Decrypt",
      requestType = com.ibm.crypto.grep11.grpc.DecryptRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.DecryptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DecryptRequest,
      com.ibm.crypto.grep11.grpc.DecryptResponse> getDecryptMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DecryptRequest, com.ibm.crypto.grep11.grpc.DecryptResponse> getDecryptMethod;
    if ((getDecryptMethod = CryptoGrpc.getDecryptMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getDecryptMethod = CryptoGrpc.getDecryptMethod) == null) {
          CryptoGrpc.getDecryptMethod = getDecryptMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.DecryptRequest, com.ibm.crypto.grep11.grpc.DecryptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Decrypt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.DecryptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.DecryptResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("Decrypt"))
              .build();
        }
      }
    }
    return getDecryptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.EncryptFinalRequest,
      com.ibm.crypto.grep11.grpc.EncryptFinalResponse> getEncryptFinalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EncryptFinal",
      requestType = com.ibm.crypto.grep11.grpc.EncryptFinalRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.EncryptFinalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.EncryptFinalRequest,
      com.ibm.crypto.grep11.grpc.EncryptFinalResponse> getEncryptFinalMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.EncryptFinalRequest, com.ibm.crypto.grep11.grpc.EncryptFinalResponse> getEncryptFinalMethod;
    if ((getEncryptFinalMethod = CryptoGrpc.getEncryptFinalMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getEncryptFinalMethod = CryptoGrpc.getEncryptFinalMethod) == null) {
          CryptoGrpc.getEncryptFinalMethod = getEncryptFinalMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.EncryptFinalRequest, com.ibm.crypto.grep11.grpc.EncryptFinalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EncryptFinal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.EncryptFinalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.EncryptFinalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("EncryptFinal"))
              .build();
        }
      }
    }
    return getEncryptFinalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DecryptFinalRequest,
      com.ibm.crypto.grep11.grpc.DecryptFinalResponse> getDecryptFinalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DecryptFinal",
      requestType = com.ibm.crypto.grep11.grpc.DecryptFinalRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.DecryptFinalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DecryptFinalRequest,
      com.ibm.crypto.grep11.grpc.DecryptFinalResponse> getDecryptFinalMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DecryptFinalRequest, com.ibm.crypto.grep11.grpc.DecryptFinalResponse> getDecryptFinalMethod;
    if ((getDecryptFinalMethod = CryptoGrpc.getDecryptFinalMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getDecryptFinalMethod = CryptoGrpc.getDecryptFinalMethod) == null) {
          CryptoGrpc.getDecryptFinalMethod = getDecryptFinalMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.DecryptFinalRequest, com.ibm.crypto.grep11.grpc.DecryptFinalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DecryptFinal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.DecryptFinalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.DecryptFinalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("DecryptFinal"))
              .build();
        }
      }
    }
    return getDecryptFinalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.EncryptSingleRequest,
      com.ibm.crypto.grep11.grpc.EncryptSingleResponse> getEncryptSingleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EncryptSingle",
      requestType = com.ibm.crypto.grep11.grpc.EncryptSingleRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.EncryptSingleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.EncryptSingleRequest,
      com.ibm.crypto.grep11.grpc.EncryptSingleResponse> getEncryptSingleMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.EncryptSingleRequest, com.ibm.crypto.grep11.grpc.EncryptSingleResponse> getEncryptSingleMethod;
    if ((getEncryptSingleMethod = CryptoGrpc.getEncryptSingleMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getEncryptSingleMethod = CryptoGrpc.getEncryptSingleMethod) == null) {
          CryptoGrpc.getEncryptSingleMethod = getEncryptSingleMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.EncryptSingleRequest, com.ibm.crypto.grep11.grpc.EncryptSingleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EncryptSingle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.EncryptSingleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.EncryptSingleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("EncryptSingle"))
              .build();
        }
      }
    }
    return getEncryptSingleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DecryptSingleRequest,
      com.ibm.crypto.grep11.grpc.DecryptSingleResponse> getDecryptSingleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DecryptSingle",
      requestType = com.ibm.crypto.grep11.grpc.DecryptSingleRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.DecryptSingleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DecryptSingleRequest,
      com.ibm.crypto.grep11.grpc.DecryptSingleResponse> getDecryptSingleMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DecryptSingleRequest, com.ibm.crypto.grep11.grpc.DecryptSingleResponse> getDecryptSingleMethod;
    if ((getDecryptSingleMethod = CryptoGrpc.getDecryptSingleMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getDecryptSingleMethod = CryptoGrpc.getDecryptSingleMethod) == null) {
          CryptoGrpc.getDecryptSingleMethod = getDecryptSingleMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.DecryptSingleRequest, com.ibm.crypto.grep11.grpc.DecryptSingleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DecryptSingle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.DecryptSingleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.DecryptSingleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("DecryptSingle"))
              .build();
        }
      }
    }
    return getDecryptSingleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.SignInitRequest,
      com.ibm.crypto.grep11.grpc.SignInitResponse> getSignInitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignInit",
      requestType = com.ibm.crypto.grep11.grpc.SignInitRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.SignInitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.SignInitRequest,
      com.ibm.crypto.grep11.grpc.SignInitResponse> getSignInitMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.SignInitRequest, com.ibm.crypto.grep11.grpc.SignInitResponse> getSignInitMethod;
    if ((getSignInitMethod = CryptoGrpc.getSignInitMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getSignInitMethod = CryptoGrpc.getSignInitMethod) == null) {
          CryptoGrpc.getSignInitMethod = getSignInitMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.SignInitRequest, com.ibm.crypto.grep11.grpc.SignInitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignInit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.SignInitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.SignInitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("SignInit"))
              .build();
        }
      }
    }
    return getSignInitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.VerifyInitRequest,
      com.ibm.crypto.grep11.grpc.VerifyInitResponse> getVerifyInitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyInit",
      requestType = com.ibm.crypto.grep11.grpc.VerifyInitRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.VerifyInitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.VerifyInitRequest,
      com.ibm.crypto.grep11.grpc.VerifyInitResponse> getVerifyInitMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.VerifyInitRequest, com.ibm.crypto.grep11.grpc.VerifyInitResponse> getVerifyInitMethod;
    if ((getVerifyInitMethod = CryptoGrpc.getVerifyInitMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getVerifyInitMethod = CryptoGrpc.getVerifyInitMethod) == null) {
          CryptoGrpc.getVerifyInitMethod = getVerifyInitMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.VerifyInitRequest, com.ibm.crypto.grep11.grpc.VerifyInitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifyInit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.VerifyInitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.VerifyInitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("VerifyInit"))
              .build();
        }
      }
    }
    return getVerifyInitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.SignUpdateRequest,
      com.ibm.crypto.grep11.grpc.SignUpdateResponse> getSignUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignUpdate",
      requestType = com.ibm.crypto.grep11.grpc.SignUpdateRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.SignUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.SignUpdateRequest,
      com.ibm.crypto.grep11.grpc.SignUpdateResponse> getSignUpdateMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.SignUpdateRequest, com.ibm.crypto.grep11.grpc.SignUpdateResponse> getSignUpdateMethod;
    if ((getSignUpdateMethod = CryptoGrpc.getSignUpdateMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getSignUpdateMethod = CryptoGrpc.getSignUpdateMethod) == null) {
          CryptoGrpc.getSignUpdateMethod = getSignUpdateMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.SignUpdateRequest, com.ibm.crypto.grep11.grpc.SignUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.SignUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.SignUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("SignUpdate"))
              .build();
        }
      }
    }
    return getSignUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.VerifyUpdateRequest,
      com.ibm.crypto.grep11.grpc.VerifyUpdateResponse> getVerifyUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyUpdate",
      requestType = com.ibm.crypto.grep11.grpc.VerifyUpdateRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.VerifyUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.VerifyUpdateRequest,
      com.ibm.crypto.grep11.grpc.VerifyUpdateResponse> getVerifyUpdateMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.VerifyUpdateRequest, com.ibm.crypto.grep11.grpc.VerifyUpdateResponse> getVerifyUpdateMethod;
    if ((getVerifyUpdateMethod = CryptoGrpc.getVerifyUpdateMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getVerifyUpdateMethod = CryptoGrpc.getVerifyUpdateMethod) == null) {
          CryptoGrpc.getVerifyUpdateMethod = getVerifyUpdateMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.VerifyUpdateRequest, com.ibm.crypto.grep11.grpc.VerifyUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifyUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.VerifyUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.VerifyUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("VerifyUpdate"))
              .build();
        }
      }
    }
    return getVerifyUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.SignFinalRequest,
      com.ibm.crypto.grep11.grpc.SignFinalResponse> getSignFinalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignFinal",
      requestType = com.ibm.crypto.grep11.grpc.SignFinalRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.SignFinalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.SignFinalRequest,
      com.ibm.crypto.grep11.grpc.SignFinalResponse> getSignFinalMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.SignFinalRequest, com.ibm.crypto.grep11.grpc.SignFinalResponse> getSignFinalMethod;
    if ((getSignFinalMethod = CryptoGrpc.getSignFinalMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getSignFinalMethod = CryptoGrpc.getSignFinalMethod) == null) {
          CryptoGrpc.getSignFinalMethod = getSignFinalMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.SignFinalRequest, com.ibm.crypto.grep11.grpc.SignFinalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignFinal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.SignFinalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.SignFinalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("SignFinal"))
              .build();
        }
      }
    }
    return getSignFinalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.VerifyFinalRequest,
      com.ibm.crypto.grep11.grpc.VerifyFinalResponse> getVerifyFinalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyFinal",
      requestType = com.ibm.crypto.grep11.grpc.VerifyFinalRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.VerifyFinalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.VerifyFinalRequest,
      com.ibm.crypto.grep11.grpc.VerifyFinalResponse> getVerifyFinalMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.VerifyFinalRequest, com.ibm.crypto.grep11.grpc.VerifyFinalResponse> getVerifyFinalMethod;
    if ((getVerifyFinalMethod = CryptoGrpc.getVerifyFinalMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getVerifyFinalMethod = CryptoGrpc.getVerifyFinalMethod) == null) {
          CryptoGrpc.getVerifyFinalMethod = getVerifyFinalMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.VerifyFinalRequest, com.ibm.crypto.grep11.grpc.VerifyFinalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifyFinal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.VerifyFinalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.VerifyFinalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("VerifyFinal"))
              .build();
        }
      }
    }
    return getVerifyFinalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.SignRequest,
      com.ibm.crypto.grep11.grpc.SignResponse> getSignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sign",
      requestType = com.ibm.crypto.grep11.grpc.SignRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.SignResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.SignRequest,
      com.ibm.crypto.grep11.grpc.SignResponse> getSignMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.SignRequest, com.ibm.crypto.grep11.grpc.SignResponse> getSignMethod;
    if ((getSignMethod = CryptoGrpc.getSignMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getSignMethod = CryptoGrpc.getSignMethod) == null) {
          CryptoGrpc.getSignMethod = getSignMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.SignRequest, com.ibm.crypto.grep11.grpc.SignResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.SignRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.SignResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("Sign"))
              .build();
        }
      }
    }
    return getSignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.VerifyRequest,
      com.ibm.crypto.grep11.grpc.VerifyResponse> getVerifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Verify",
      requestType = com.ibm.crypto.grep11.grpc.VerifyRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.VerifyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.VerifyRequest,
      com.ibm.crypto.grep11.grpc.VerifyResponse> getVerifyMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.VerifyRequest, com.ibm.crypto.grep11.grpc.VerifyResponse> getVerifyMethod;
    if ((getVerifyMethod = CryptoGrpc.getVerifyMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getVerifyMethod = CryptoGrpc.getVerifyMethod) == null) {
          CryptoGrpc.getVerifyMethod = getVerifyMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.VerifyRequest, com.ibm.crypto.grep11.grpc.VerifyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Verify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.VerifyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.VerifyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("Verify"))
              .build();
        }
      }
    }
    return getVerifyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.SignSingleRequest,
      com.ibm.crypto.grep11.grpc.SignSingleResponse> getSignSingleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignSingle",
      requestType = com.ibm.crypto.grep11.grpc.SignSingleRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.SignSingleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.SignSingleRequest,
      com.ibm.crypto.grep11.grpc.SignSingleResponse> getSignSingleMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.SignSingleRequest, com.ibm.crypto.grep11.grpc.SignSingleResponse> getSignSingleMethod;
    if ((getSignSingleMethod = CryptoGrpc.getSignSingleMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getSignSingleMethod = CryptoGrpc.getSignSingleMethod) == null) {
          CryptoGrpc.getSignSingleMethod = getSignSingleMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.SignSingleRequest, com.ibm.crypto.grep11.grpc.SignSingleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignSingle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.SignSingleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.SignSingleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("SignSingle"))
              .build();
        }
      }
    }
    return getSignSingleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.VerifySingleRequest,
      com.ibm.crypto.grep11.grpc.VerifySingleResponse> getVerifySingleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifySingle",
      requestType = com.ibm.crypto.grep11.grpc.VerifySingleRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.VerifySingleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.VerifySingleRequest,
      com.ibm.crypto.grep11.grpc.VerifySingleResponse> getVerifySingleMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.VerifySingleRequest, com.ibm.crypto.grep11.grpc.VerifySingleResponse> getVerifySingleMethod;
    if ((getVerifySingleMethod = CryptoGrpc.getVerifySingleMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getVerifySingleMethod = CryptoGrpc.getVerifySingleMethod) == null) {
          CryptoGrpc.getVerifySingleMethod = getVerifySingleMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.VerifySingleRequest, com.ibm.crypto.grep11.grpc.VerifySingleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifySingle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.VerifySingleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.VerifySingleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("VerifySingle"))
              .build();
        }
      }
    }
    return getVerifySingleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.GenerateKeyRequest,
      com.ibm.crypto.grep11.grpc.GenerateKeyResponse> getGenerateKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateKey",
      requestType = com.ibm.crypto.grep11.grpc.GenerateKeyRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.GenerateKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.GenerateKeyRequest,
      com.ibm.crypto.grep11.grpc.GenerateKeyResponse> getGenerateKeyMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.GenerateKeyRequest, com.ibm.crypto.grep11.grpc.GenerateKeyResponse> getGenerateKeyMethod;
    if ((getGenerateKeyMethod = CryptoGrpc.getGenerateKeyMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getGenerateKeyMethod = CryptoGrpc.getGenerateKeyMethod) == null) {
          CryptoGrpc.getGenerateKeyMethod = getGenerateKeyMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.GenerateKeyRequest, com.ibm.crypto.grep11.grpc.GenerateKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.GenerateKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.GenerateKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("GenerateKey"))
              .build();
        }
      }
    }
    return getGenerateKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.GenerateKeyPairRequest,
      com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse> getGenerateKeyPairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateKeyPair",
      requestType = com.ibm.crypto.grep11.grpc.GenerateKeyPairRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.GenerateKeyPairRequest,
      com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse> getGenerateKeyPairMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.GenerateKeyPairRequest, com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse> getGenerateKeyPairMethod;
    if ((getGenerateKeyPairMethod = CryptoGrpc.getGenerateKeyPairMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getGenerateKeyPairMethod = CryptoGrpc.getGenerateKeyPairMethod) == null) {
          CryptoGrpc.getGenerateKeyPairMethod = getGenerateKeyPairMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.GenerateKeyPairRequest, com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateKeyPair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.GenerateKeyPairRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("GenerateKeyPair"))
              .build();
        }
      }
    }
    return getGenerateKeyPairMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.WrapKeyRequest,
      com.ibm.crypto.grep11.grpc.WrapKeyResponse> getWrapKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WrapKey",
      requestType = com.ibm.crypto.grep11.grpc.WrapKeyRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.WrapKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.WrapKeyRequest,
      com.ibm.crypto.grep11.grpc.WrapKeyResponse> getWrapKeyMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.WrapKeyRequest, com.ibm.crypto.grep11.grpc.WrapKeyResponse> getWrapKeyMethod;
    if ((getWrapKeyMethod = CryptoGrpc.getWrapKeyMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getWrapKeyMethod = CryptoGrpc.getWrapKeyMethod) == null) {
          CryptoGrpc.getWrapKeyMethod = getWrapKeyMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.WrapKeyRequest, com.ibm.crypto.grep11.grpc.WrapKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WrapKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.WrapKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.WrapKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("WrapKey"))
              .build();
        }
      }
    }
    return getWrapKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.UnwrapKeyRequest,
      com.ibm.crypto.grep11.grpc.UnwrapKeyResponse> getUnwrapKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnwrapKey",
      requestType = com.ibm.crypto.grep11.grpc.UnwrapKeyRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.UnwrapKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.UnwrapKeyRequest,
      com.ibm.crypto.grep11.grpc.UnwrapKeyResponse> getUnwrapKeyMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.UnwrapKeyRequest, com.ibm.crypto.grep11.grpc.UnwrapKeyResponse> getUnwrapKeyMethod;
    if ((getUnwrapKeyMethod = CryptoGrpc.getUnwrapKeyMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getUnwrapKeyMethod = CryptoGrpc.getUnwrapKeyMethod) == null) {
          CryptoGrpc.getUnwrapKeyMethod = getUnwrapKeyMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.UnwrapKeyRequest, com.ibm.crypto.grep11.grpc.UnwrapKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnwrapKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.UnwrapKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.UnwrapKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("UnwrapKey"))
              .build();
        }
      }
    }
    return getUnwrapKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DeriveKeyRequest,
      com.ibm.crypto.grep11.grpc.DeriveKeyResponse> getDeriveKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeriveKey",
      requestType = com.ibm.crypto.grep11.grpc.DeriveKeyRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.DeriveKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DeriveKeyRequest,
      com.ibm.crypto.grep11.grpc.DeriveKeyResponse> getDeriveKeyMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.DeriveKeyRequest, com.ibm.crypto.grep11.grpc.DeriveKeyResponse> getDeriveKeyMethod;
    if ((getDeriveKeyMethod = CryptoGrpc.getDeriveKeyMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getDeriveKeyMethod = CryptoGrpc.getDeriveKeyMethod) == null) {
          CryptoGrpc.getDeriveKeyMethod = getDeriveKeyMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.DeriveKeyRequest, com.ibm.crypto.grep11.grpc.DeriveKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeriveKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.DeriveKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.DeriveKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("DeriveKey"))
              .build();
        }
      }
    }
    return getDeriveKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.GetMechanismListRequest,
      com.ibm.crypto.grep11.grpc.GetMechanismListResponse> getGetMechanismListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMechanismList",
      requestType = com.ibm.crypto.grep11.grpc.GetMechanismListRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.GetMechanismListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.GetMechanismListRequest,
      com.ibm.crypto.grep11.grpc.GetMechanismListResponse> getGetMechanismListMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.GetMechanismListRequest, com.ibm.crypto.grep11.grpc.GetMechanismListResponse> getGetMechanismListMethod;
    if ((getGetMechanismListMethod = CryptoGrpc.getGetMechanismListMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getGetMechanismListMethod = CryptoGrpc.getGetMechanismListMethod) == null) {
          CryptoGrpc.getGetMechanismListMethod = getGetMechanismListMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.GetMechanismListRequest, com.ibm.crypto.grep11.grpc.GetMechanismListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMechanismList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.GetMechanismListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.GetMechanismListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("GetMechanismList"))
              .build();
        }
      }
    }
    return getGetMechanismListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.GetMechanismInfoRequest,
      com.ibm.crypto.grep11.grpc.GetMechanismInfoResponse> getGetMechanismInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMechanismInfo",
      requestType = com.ibm.crypto.grep11.grpc.GetMechanismInfoRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.GetMechanismInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.GetMechanismInfoRequest,
      com.ibm.crypto.grep11.grpc.GetMechanismInfoResponse> getGetMechanismInfoMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.GetMechanismInfoRequest, com.ibm.crypto.grep11.grpc.GetMechanismInfoResponse> getGetMechanismInfoMethod;
    if ((getGetMechanismInfoMethod = CryptoGrpc.getGetMechanismInfoMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getGetMechanismInfoMethod = CryptoGrpc.getGetMechanismInfoMethod) == null) {
          CryptoGrpc.getGetMechanismInfoMethod = getGetMechanismInfoMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.GetMechanismInfoRequest, com.ibm.crypto.grep11.grpc.GetMechanismInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMechanismInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.GetMechanismInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.GetMechanismInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("GetMechanismInfo"))
              .build();
        }
      }
    }
    return getGetMechanismInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.GetAttributeValueRequest,
      com.ibm.crypto.grep11.grpc.GetAttributeValueResponse> getGetAttributeValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAttributeValue",
      requestType = com.ibm.crypto.grep11.grpc.GetAttributeValueRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.GetAttributeValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.GetAttributeValueRequest,
      com.ibm.crypto.grep11.grpc.GetAttributeValueResponse> getGetAttributeValueMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.GetAttributeValueRequest, com.ibm.crypto.grep11.grpc.GetAttributeValueResponse> getGetAttributeValueMethod;
    if ((getGetAttributeValueMethod = CryptoGrpc.getGetAttributeValueMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getGetAttributeValueMethod = CryptoGrpc.getGetAttributeValueMethod) == null) {
          CryptoGrpc.getGetAttributeValueMethod = getGetAttributeValueMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.GetAttributeValueRequest, com.ibm.crypto.grep11.grpc.GetAttributeValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAttributeValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.GetAttributeValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.GetAttributeValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("GetAttributeValue"))
              .build();
        }
      }
    }
    return getGetAttributeValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.SetAttributeValueRequest,
      com.ibm.crypto.grep11.grpc.SetAttributeValueResponse> getSetAttributeValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAttributeValue",
      requestType = com.ibm.crypto.grep11.grpc.SetAttributeValueRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.SetAttributeValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.SetAttributeValueRequest,
      com.ibm.crypto.grep11.grpc.SetAttributeValueResponse> getSetAttributeValueMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.SetAttributeValueRequest, com.ibm.crypto.grep11.grpc.SetAttributeValueResponse> getSetAttributeValueMethod;
    if ((getSetAttributeValueMethod = CryptoGrpc.getSetAttributeValueMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getSetAttributeValueMethod = CryptoGrpc.getSetAttributeValueMethod) == null) {
          CryptoGrpc.getSetAttributeValueMethod = getSetAttributeValueMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.SetAttributeValueRequest, com.ibm.crypto.grep11.grpc.SetAttributeValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAttributeValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.SetAttributeValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.SetAttributeValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("SetAttributeValue"))
              .build();
        }
      }
    }
    return getSetAttributeValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.RewrapKeyBlobRequest,
      com.ibm.crypto.grep11.grpc.RewrapKeyBlobResponse> getRewrapKeyBlobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RewrapKeyBlob",
      requestType = com.ibm.crypto.grep11.grpc.RewrapKeyBlobRequest.class,
      responseType = com.ibm.crypto.grep11.grpc.RewrapKeyBlobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.RewrapKeyBlobRequest,
      com.ibm.crypto.grep11.grpc.RewrapKeyBlobResponse> getRewrapKeyBlobMethod() {
    io.grpc.MethodDescriptor<com.ibm.crypto.grep11.grpc.RewrapKeyBlobRequest, com.ibm.crypto.grep11.grpc.RewrapKeyBlobResponse> getRewrapKeyBlobMethod;
    if ((getRewrapKeyBlobMethod = CryptoGrpc.getRewrapKeyBlobMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getRewrapKeyBlobMethod = CryptoGrpc.getRewrapKeyBlobMethod) == null) {
          CryptoGrpc.getRewrapKeyBlobMethod = getRewrapKeyBlobMethod =
              io.grpc.MethodDescriptor.<com.ibm.crypto.grep11.grpc.RewrapKeyBlobRequest, com.ibm.crypto.grep11.grpc.RewrapKeyBlobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RewrapKeyBlob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.RewrapKeyBlobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ibm.crypto.grep11.grpc.RewrapKeyBlobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("RewrapKeyBlob"))
              .build();
        }
      }
    }
    return getRewrapKeyBlobMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CryptoStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CryptoStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CryptoStub>() {
        @java.lang.Override
        public CryptoStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CryptoStub(channel, callOptions);
        }
      };
    return CryptoStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CryptoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CryptoBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CryptoBlockingStub>() {
        @java.lang.Override
        public CryptoBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CryptoBlockingStub(channel, callOptions);
        }
      };
    return CryptoBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CryptoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CryptoFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CryptoFutureStub>() {
        @java.lang.Override
        public CryptoFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CryptoFutureStub(channel, callOptions);
        }
      };
    return CryptoFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * See https://www.ibm.com/downloads/cas/WXRDPRAN for further documentation
   * </pre>
   */
  public static abstract class CryptoImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * CK_RV m_GenerateRandom (
     *     CK_BYTE_PTR rnd, CK_ULONG rndlen,
     *     target_t target) ;
     * </pre>
     */
    public void generateRandom(com.ibm.crypto.grep11.grpc.GenerateRandomRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.GenerateRandomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateRandomMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_DigestInit (
     *     unsigned char *state, size_t *statelen,
     *     const CK_MECHANISM_PTR mech,
     *     target_t target) ;
     * </pre>
     */
    public void digestInit(com.ibm.crypto.grep11.grpc.DigestInitRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DigestInitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDigestInitMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_Digest (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     CK_BYTE_PTR digest, CK_ULONG_PTR digestlen,
     *     target_t target) ;
     * </pre>
     */
    public void digest(com.ibm.crypto.grep11.grpc.DigestRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DigestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDigestMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_DigestUpdate (
     *     unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     target_t target) ;
     * </pre>
     */
    public void digestUpdate(com.ibm.crypto.grep11.grpc.DigestUpdateRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DigestUpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDigestUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_DigestKey (
     *     unsigned char *state, size_t statelen,
     *     const unsigned char *key, size_t keylen,
     *     target_t target) ;
     * </pre>
     */
    public void digestKey(com.ibm.crypto.grep11.grpc.DigestKeyRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DigestKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDigestKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_DigestFinal (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR digest, CK_ULONG_PTR digestlen,
     *     target_t target) ;
     * </pre>
     */
    public void digestFinal(com.ibm.crypto.grep11.grpc.DigestFinalRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DigestFinalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDigestFinalMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_DigestSingle (
     *     CK_MECHANISM_PTR mech,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     CK_BYTE_PTR digest, CK_ULONG_PTR digestlen,
     *     target_t target) ;
     * </pre>
     */
    public void digestSingle(com.ibm.crypto.grep11.grpc.DigestSingleRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DigestSingleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDigestSingleMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_EncryptInit (
     *     unsigned char *state, size_t *statelen,
     *     CK_MECHANISM_PTR mech,
     *     const unsigned char *key, size_t keylen,
     *     target_t target) ;
     * </pre>
     */
    public void encryptInit(com.ibm.crypto.grep11.grpc.EncryptInitRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.EncryptInitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEncryptInitMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_DecryptInit (
     *     unsigned char *state, size_t *statelen,
     *     CK_MECHANISM_PTR mech,
     *     const unsigned char *key, size_t keylen,
     *     target_t target) ;
     * </pre>
     */
    public void decryptInit(com.ibm.crypto.grep11.grpc.DecryptInitRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DecryptInitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDecryptInitMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_EncryptUpdate (
     *     unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR plain, CK_ULONG plainlen,
     *     CK_BYTE_PTR ciphered, CK_ULONG_PTR cipheredlen,
     *     target_t target) ;
     * </pre>
     */
    public void encryptUpdate(com.ibm.crypto.grep11.grpc.EncryptUpdateRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.EncryptUpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEncryptUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_DecryptUpdate (
     *     unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR ciphered, CK_ULONG cipheredlen,
     *     CK_BYTE_PTR plain, CK_ULONG_PTR plainlen,
     *     target_t target) ;
     * </pre>
     */
    public void decryptUpdate(com.ibm.crypto.grep11.grpc.DecryptUpdateRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DecryptUpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDecryptUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_Encrypt (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR plain, CK_ULONG plainlen,
     *     CK_BYTE_PTR ciphered, CK_ULONG_PTR cipheredlen,
     *     target_t target) ;
     * </pre>
     */
    public void encrypt(com.ibm.crypto.grep11.grpc.EncryptRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.EncryptResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEncryptMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_Decrypt (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR ciphered, CK_ULONG cipheredlen,
     *     CK_BYTE_PTR plain, CK_ULONG_PTR plainlen,
     *     target_t target) ;
     * </pre>
     */
    public void decrypt(com.ibm.crypto.grep11.grpc.DecryptRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DecryptResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDecryptMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_EncryptFinal (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR ciphered, CK_ULONG_PTR cipheredlen,
     *     target_t target) ;
     * </pre>
     */
    public void encryptFinal(com.ibm.crypto.grep11.grpc.EncryptFinalRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.EncryptFinalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEncryptFinalMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_DecryptFinal (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR plain, CK_ULONG_PTR plainlen,
     *     target_t target) ;
     * </pre>
     */
    public void decryptFinal(com.ibm.crypto.grep11.grpc.DecryptFinalRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DecryptFinalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDecryptFinalMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_EncryptSingle (
     *     const unsigned char *key, size_t keylen,
     *     CK_MECHANISM_PTR mech,
     *     CK_BYTE_PTR plain, CK_ULONG plainlen,
     *     CK_BYTE_PTR ciphered, CK_ULONG_PTR cipheredlen,
     *     target_t target) ;
     * </pre>
     */
    public void encryptSingle(com.ibm.crypto.grep11.grpc.EncryptSingleRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.EncryptSingleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEncryptSingleMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_DecryptSingle (
     *     const unsigned char *key, size_t keylen,
     *     CK_MECHANISM_PTR mech,
     *     CK_BYTE_PTR ciphered, CK_ULONG cipheredlen,
     *     CK_BYTE_PTR plain, CK_ULONG_PTR plainlen,
     *     target_t target) ;
     * </pre>
     */
    public void decryptSingle(com.ibm.crypto.grep11.grpc.DecryptSingleRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DecryptSingleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDecryptSingleMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_SignInit (
     *     unsigned char *state, size_t *statelen,
     *     CK_MECHANISM_PTR mech,
     *     const unsigned char *privKey, size_t privKeylen,
     *     target_t target) ;
     * </pre>
     */
    public void signInit(com.ibm.crypto.grep11.grpc.SignInitRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.SignInitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignInitMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_VerifyInit (
     *     unsigned char *state, size_t *statelen,
     *     CK_MECHANISM_PTR mech,
     *     const unsigned char *pubKey, size_t pubKeylen,
     *     target_t target) ;
     * </pre>
     */
    public void verifyInit(com.ibm.crypto.grep11.grpc.VerifyInitRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.VerifyInitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyInitMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_SignUpdate (
     *     unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     target_t target) ;
     * </pre>
     */
    public void signUpdate(com.ibm.crypto.grep11.grpc.SignUpdateRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.SignUpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_VerifyUpdate (
     *     unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     target_t target) ;
     * </pre>
     */
    public void verifyUpdate(com.ibm.crypto.grep11.grpc.VerifyUpdateRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.VerifyUpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_SignFinal (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR signature, CK_ULONG_PTR signaturelen,
     *     target_t target) ;
     * </pre>
     */
    public void signFinal(com.ibm.crypto.grep11.grpc.SignFinalRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.SignFinalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignFinalMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_VerifyFinal (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR signature, CK_ULONG signaturelen,
     *     target_t target) ;
     * </pre>
     */
    public void verifyFinal(com.ibm.crypto.grep11.grpc.VerifyFinalRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.VerifyFinalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyFinalMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_Sign (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     CK_BYTE_PTR signature, CK_ULONG_PTR signaturelen,
     *     target_t target) ;
     * </pre>
     */
    public void sign(com.ibm.crypto.grep11.grpc.SignRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.SignResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_Verify (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     CK_BYTE_PTR signature, CK_ULONG signaturelen,
     *     target_t target) ;
     * </pre>
     */
    public void verify(com.ibm.crypto.grep11.grpc.VerifyRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.VerifyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_SignSingle (
     *     const unsigned char *privKey, size_t privKeylen,
     *     CK_MECHANISM_PTR mech,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     CK_BYTE_PTR signature, CK_ULONG_PTR signaturelen,
     *     target_t target) ;
     * </pre>
     */
    public void signSingle(com.ibm.crypto.grep11.grpc.SignSingleRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.SignSingleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignSingleMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_VerifySingle (
     *     const unsigned char *pubKey, size_t pubKeylen,
     *     CK_MECHANISM_PTR mech,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     CK_BYTE_PTR signature, CK_ULONG signaturelen,
     *     target_t target) ;
     * </pre>
     */
    public void verifySingle(com.ibm.crypto.grep11.grpc.VerifySingleRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.VerifySingleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifySingleMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_GenerateKey (
     *     CK_MECHANISM_PTR mech,
     *     CK_ATTRIBUTE_PTR templateBytes, CK_ULONG templateByteslen,
     *     const unsigned char *pin, size_t pinlen,
     *     unsigned char *keyBytes, size_t *keyByteslen,
     *     unsigned char *checkSum, size_t *checkSumlen,
     *     target_t target) ;
     * </pre>
     */
    public void generateKey(com.ibm.crypto.grep11.grpc.GenerateKeyRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.GenerateKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_GenerateKeyPair (
     *     CK_MECHANISM_PTR mech,
     *     CK_ATTRIBUTE_PTR pubKeyTemplateBytes, CK_ULONG pubKeyTemplateByteslen,
     *     CK_ATTRIBUTE_PTR privKeyTemplateBytes, CK_ULONG privKeyTemplateByteslen,
     *     const unsigned char *pin, size_t pinlen,
     *     unsigned char *privKeyBytes, size_t *privKeyByteslen,
     *     unsigned char *pubKeyBytes, size_t *pubKeyByteslen,
     *     target_t target) ;
     * </pre>
     */
    public void generateKeyPair(com.ibm.crypto.grep11.grpc.GenerateKeyPairRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateKeyPairMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_WrapKey (
     *     const unsigned char *key, size_t keylen,
     *     const unsigned char *keK, size_t keKlen,
     *     const unsigned char *macKey, size_t macKeylen,
     *     const CK_MECHANISM_PTR mech,
     *     CK_BYTE_PTR wrapped, CK_ULONG_PTR wrappedlen,
     *     target_t target) ;
     * </pre>
     */
    public void wrapKey(com.ibm.crypto.grep11.grpc.WrapKeyRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.WrapKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWrapKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_UnwrapKey (
     *     const CK_BYTE_PTR wrapped, CK_ULONG wrappedlen,
     *     const unsigned char *keK, size_t keKlen,
     *     const unsigned char *macKey, size_t macKeylen,
     *     const unsigned char *pin, size_t pinlen,
     *     const CK_MECHANISM_PTR mech,
     *     const CK_ATTRIBUTE_PTR templateBytes, CK_ULONG templateByteslen,
     *     unsigned char *unwrappedBytes, size_t *unwrappedByteslen,
     *     CK_BYTE_PTR checkSum, CK_ULONG *checkSumlen,
     *     target_t target) ;
     * </pre>
     */
    public void unwrapKey(com.ibm.crypto.grep11.grpc.UnwrapKeyRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.UnwrapKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnwrapKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_DeriveKey (
     *     CK_MECHANISM_PTR mech,
     *     CK_ATTRIBUTE_PTR templateBytes, CK_ULONG templateByteslen,
     *     const unsigned char *baseKey, size_t baseKeylen,
     *     const unsigned char *data, size_t datalen,
     *     const unsigned char *pin, size_t pinlen,
     *     unsigned char *newKeyBytes, size_t *newKeyByteslen,
     *     unsigned char *checkSum, size_t *checkSumlen,
     *     target_t target) ;
     * </pre>
     */
    public void deriveKey(com.ibm.crypto.grep11.grpc.DeriveKeyRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DeriveKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeriveKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_GetMechanismList (
     *     CK_SLOT_ID slot,
     *     CK_MECHANISM_TYPE_PTR mechs, CK_ULONG_PTR mechslen,
     *     target_t target) ;
     * </pre>
     */
    public void getMechanismList(com.ibm.crypto.grep11.grpc.GetMechanismListRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.GetMechanismListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMechanismListMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_GetMechanismInfo (
     *     CK_SLOT_ID slot,
     *     CK_MECHANISM_TYPE mech,
     *     CK_MECHANISM_INFO_PTR mechInfo,
     *     target_t target) ;
     * </pre>
     */
    public void getMechanismInfo(com.ibm.crypto.grep11.grpc.GetMechanismInfoRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.GetMechanismInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMechanismInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_GetAttributeValue (
     *     const unsigned char *object, size_t objectlen,
     *     CK_ATTRIBUTE_PTR attributesBytes, CK_ULONG attributesByteslen,
     *     target_t target) ;
     * </pre>
     */
    public void getAttributeValue(com.ibm.crypto.grep11.grpc.GetAttributeValueRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.GetAttributeValueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAttributeValueMethod(), responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_SetAttributeValue (
     *     unsigned char *object, size_t objectlen,
     *     CK_ATTRIBUTE_PTR attributesBytes, CK_ULONG attributesByteslen,
     *     target_t target) ;
     * </pre>
     */
    public void setAttributeValue(com.ibm.crypto.grep11.grpc.SetAttributeValueRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.SetAttributeValueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAttributeValueMethod(), responseObserver);
    }

    /**
     */
    public void rewrapKeyBlob(com.ibm.crypto.grep11.grpc.RewrapKeyBlobRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.RewrapKeyBlobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRewrapKeyBlobMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGenerateRandomMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.GenerateRandomRequest,
                com.ibm.crypto.grep11.grpc.GenerateRandomResponse>(
                  this, METHODID_GENERATE_RANDOM)))
          .addMethod(
            getDigestInitMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.DigestInitRequest,
                com.ibm.crypto.grep11.grpc.DigestInitResponse>(
                  this, METHODID_DIGEST_INIT)))
          .addMethod(
            getDigestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.DigestRequest,
                com.ibm.crypto.grep11.grpc.DigestResponse>(
                  this, METHODID_DIGEST)))
          .addMethod(
            getDigestUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.DigestUpdateRequest,
                com.ibm.crypto.grep11.grpc.DigestUpdateResponse>(
                  this, METHODID_DIGEST_UPDATE)))
          .addMethod(
            getDigestKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.DigestKeyRequest,
                com.ibm.crypto.grep11.grpc.DigestKeyResponse>(
                  this, METHODID_DIGEST_KEY)))
          .addMethod(
            getDigestFinalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.DigestFinalRequest,
                com.ibm.crypto.grep11.grpc.DigestFinalResponse>(
                  this, METHODID_DIGEST_FINAL)))
          .addMethod(
            getDigestSingleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.DigestSingleRequest,
                com.ibm.crypto.grep11.grpc.DigestSingleResponse>(
                  this, METHODID_DIGEST_SINGLE)))
          .addMethod(
            getEncryptInitMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.EncryptInitRequest,
                com.ibm.crypto.grep11.grpc.EncryptInitResponse>(
                  this, METHODID_ENCRYPT_INIT)))
          .addMethod(
            getDecryptInitMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.DecryptInitRequest,
                com.ibm.crypto.grep11.grpc.DecryptInitResponse>(
                  this, METHODID_DECRYPT_INIT)))
          .addMethod(
            getEncryptUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.EncryptUpdateRequest,
                com.ibm.crypto.grep11.grpc.EncryptUpdateResponse>(
                  this, METHODID_ENCRYPT_UPDATE)))
          .addMethod(
            getDecryptUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.DecryptUpdateRequest,
                com.ibm.crypto.grep11.grpc.DecryptUpdateResponse>(
                  this, METHODID_DECRYPT_UPDATE)))
          .addMethod(
            getEncryptMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.EncryptRequest,
                com.ibm.crypto.grep11.grpc.EncryptResponse>(
                  this, METHODID_ENCRYPT)))
          .addMethod(
            getDecryptMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.DecryptRequest,
                com.ibm.crypto.grep11.grpc.DecryptResponse>(
                  this, METHODID_DECRYPT)))
          .addMethod(
            getEncryptFinalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.EncryptFinalRequest,
                com.ibm.crypto.grep11.grpc.EncryptFinalResponse>(
                  this, METHODID_ENCRYPT_FINAL)))
          .addMethod(
            getDecryptFinalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.DecryptFinalRequest,
                com.ibm.crypto.grep11.grpc.DecryptFinalResponse>(
                  this, METHODID_DECRYPT_FINAL)))
          .addMethod(
            getEncryptSingleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.EncryptSingleRequest,
                com.ibm.crypto.grep11.grpc.EncryptSingleResponse>(
                  this, METHODID_ENCRYPT_SINGLE)))
          .addMethod(
            getDecryptSingleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.DecryptSingleRequest,
                com.ibm.crypto.grep11.grpc.DecryptSingleResponse>(
                  this, METHODID_DECRYPT_SINGLE)))
          .addMethod(
            getSignInitMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.SignInitRequest,
                com.ibm.crypto.grep11.grpc.SignInitResponse>(
                  this, METHODID_SIGN_INIT)))
          .addMethod(
            getVerifyInitMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.VerifyInitRequest,
                com.ibm.crypto.grep11.grpc.VerifyInitResponse>(
                  this, METHODID_VERIFY_INIT)))
          .addMethod(
            getSignUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.SignUpdateRequest,
                com.ibm.crypto.grep11.grpc.SignUpdateResponse>(
                  this, METHODID_SIGN_UPDATE)))
          .addMethod(
            getVerifyUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.VerifyUpdateRequest,
                com.ibm.crypto.grep11.grpc.VerifyUpdateResponse>(
                  this, METHODID_VERIFY_UPDATE)))
          .addMethod(
            getSignFinalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.SignFinalRequest,
                com.ibm.crypto.grep11.grpc.SignFinalResponse>(
                  this, METHODID_SIGN_FINAL)))
          .addMethod(
            getVerifyFinalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.VerifyFinalRequest,
                com.ibm.crypto.grep11.grpc.VerifyFinalResponse>(
                  this, METHODID_VERIFY_FINAL)))
          .addMethod(
            getSignMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.SignRequest,
                com.ibm.crypto.grep11.grpc.SignResponse>(
                  this, METHODID_SIGN)))
          .addMethod(
            getVerifyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.VerifyRequest,
                com.ibm.crypto.grep11.grpc.VerifyResponse>(
                  this, METHODID_VERIFY)))
          .addMethod(
            getSignSingleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.SignSingleRequest,
                com.ibm.crypto.grep11.grpc.SignSingleResponse>(
                  this, METHODID_SIGN_SINGLE)))
          .addMethod(
            getVerifySingleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.VerifySingleRequest,
                com.ibm.crypto.grep11.grpc.VerifySingleResponse>(
                  this, METHODID_VERIFY_SINGLE)))
          .addMethod(
            getGenerateKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.GenerateKeyRequest,
                com.ibm.crypto.grep11.grpc.GenerateKeyResponse>(
                  this, METHODID_GENERATE_KEY)))
          .addMethod(
            getGenerateKeyPairMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.GenerateKeyPairRequest,
                com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse>(
                  this, METHODID_GENERATE_KEY_PAIR)))
          .addMethod(
            getWrapKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.WrapKeyRequest,
                com.ibm.crypto.grep11.grpc.WrapKeyResponse>(
                  this, METHODID_WRAP_KEY)))
          .addMethod(
            getUnwrapKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.UnwrapKeyRequest,
                com.ibm.crypto.grep11.grpc.UnwrapKeyResponse>(
                  this, METHODID_UNWRAP_KEY)))
          .addMethod(
            getDeriveKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.DeriveKeyRequest,
                com.ibm.crypto.grep11.grpc.DeriveKeyResponse>(
                  this, METHODID_DERIVE_KEY)))
          .addMethod(
            getGetMechanismListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.GetMechanismListRequest,
                com.ibm.crypto.grep11.grpc.GetMechanismListResponse>(
                  this, METHODID_GET_MECHANISM_LIST)))
          .addMethod(
            getGetMechanismInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.GetMechanismInfoRequest,
                com.ibm.crypto.grep11.grpc.GetMechanismInfoResponse>(
                  this, METHODID_GET_MECHANISM_INFO)))
          .addMethod(
            getGetAttributeValueMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.GetAttributeValueRequest,
                com.ibm.crypto.grep11.grpc.GetAttributeValueResponse>(
                  this, METHODID_GET_ATTRIBUTE_VALUE)))
          .addMethod(
            getSetAttributeValueMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.SetAttributeValueRequest,
                com.ibm.crypto.grep11.grpc.SetAttributeValueResponse>(
                  this, METHODID_SET_ATTRIBUTE_VALUE)))
          .addMethod(
            getRewrapKeyBlobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ibm.crypto.grep11.grpc.RewrapKeyBlobRequest,
                com.ibm.crypto.grep11.grpc.RewrapKeyBlobResponse>(
                  this, METHODID_REWRAP_KEY_BLOB)))
          .build();
    }
  }

  /**
   * <pre>
   * See https://www.ibm.com/downloads/cas/WXRDPRAN for further documentation
   * </pre>
   */
  public static final class CryptoStub extends io.grpc.stub.AbstractAsyncStub<CryptoStub> {
    private CryptoStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CryptoStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CryptoStub(channel, callOptions);
    }

    /**
     * <pre>
     * CK_RV m_GenerateRandom (
     *     CK_BYTE_PTR rnd, CK_ULONG rndlen,
     *     target_t target) ;
     * </pre>
     */
    public void generateRandom(com.ibm.crypto.grep11.grpc.GenerateRandomRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.GenerateRandomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateRandomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_DigestInit (
     *     unsigned char *state, size_t *statelen,
     *     const CK_MECHANISM_PTR mech,
     *     target_t target) ;
     * </pre>
     */
    public void digestInit(com.ibm.crypto.grep11.grpc.DigestInitRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DigestInitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDigestInitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_Digest (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     CK_BYTE_PTR digest, CK_ULONG_PTR digestlen,
     *     target_t target) ;
     * </pre>
     */
    public void digest(com.ibm.crypto.grep11.grpc.DigestRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DigestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDigestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_DigestUpdate (
     *     unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     target_t target) ;
     * </pre>
     */
    public void digestUpdate(com.ibm.crypto.grep11.grpc.DigestUpdateRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DigestUpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDigestUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_DigestKey (
     *     unsigned char *state, size_t statelen,
     *     const unsigned char *key, size_t keylen,
     *     target_t target) ;
     * </pre>
     */
    public void digestKey(com.ibm.crypto.grep11.grpc.DigestKeyRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DigestKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDigestKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_DigestFinal (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR digest, CK_ULONG_PTR digestlen,
     *     target_t target) ;
     * </pre>
     */
    public void digestFinal(com.ibm.crypto.grep11.grpc.DigestFinalRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DigestFinalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDigestFinalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_DigestSingle (
     *     CK_MECHANISM_PTR mech,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     CK_BYTE_PTR digest, CK_ULONG_PTR digestlen,
     *     target_t target) ;
     * </pre>
     */
    public void digestSingle(com.ibm.crypto.grep11.grpc.DigestSingleRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DigestSingleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDigestSingleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_EncryptInit (
     *     unsigned char *state, size_t *statelen,
     *     CK_MECHANISM_PTR mech,
     *     const unsigned char *key, size_t keylen,
     *     target_t target) ;
     * </pre>
     */
    public void encryptInit(com.ibm.crypto.grep11.grpc.EncryptInitRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.EncryptInitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEncryptInitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_DecryptInit (
     *     unsigned char *state, size_t *statelen,
     *     CK_MECHANISM_PTR mech,
     *     const unsigned char *key, size_t keylen,
     *     target_t target) ;
     * </pre>
     */
    public void decryptInit(com.ibm.crypto.grep11.grpc.DecryptInitRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DecryptInitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDecryptInitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_EncryptUpdate (
     *     unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR plain, CK_ULONG plainlen,
     *     CK_BYTE_PTR ciphered, CK_ULONG_PTR cipheredlen,
     *     target_t target) ;
     * </pre>
     */
    public void encryptUpdate(com.ibm.crypto.grep11.grpc.EncryptUpdateRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.EncryptUpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEncryptUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_DecryptUpdate (
     *     unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR ciphered, CK_ULONG cipheredlen,
     *     CK_BYTE_PTR plain, CK_ULONG_PTR plainlen,
     *     target_t target) ;
     * </pre>
     */
    public void decryptUpdate(com.ibm.crypto.grep11.grpc.DecryptUpdateRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DecryptUpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDecryptUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_Encrypt (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR plain, CK_ULONG plainlen,
     *     CK_BYTE_PTR ciphered, CK_ULONG_PTR cipheredlen,
     *     target_t target) ;
     * </pre>
     */
    public void encrypt(com.ibm.crypto.grep11.grpc.EncryptRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.EncryptResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEncryptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_Decrypt (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR ciphered, CK_ULONG cipheredlen,
     *     CK_BYTE_PTR plain, CK_ULONG_PTR plainlen,
     *     target_t target) ;
     * </pre>
     */
    public void decrypt(com.ibm.crypto.grep11.grpc.DecryptRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DecryptResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDecryptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_EncryptFinal (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR ciphered, CK_ULONG_PTR cipheredlen,
     *     target_t target) ;
     * </pre>
     */
    public void encryptFinal(com.ibm.crypto.grep11.grpc.EncryptFinalRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.EncryptFinalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEncryptFinalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_DecryptFinal (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR plain, CK_ULONG_PTR plainlen,
     *     target_t target) ;
     * </pre>
     */
    public void decryptFinal(com.ibm.crypto.grep11.grpc.DecryptFinalRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DecryptFinalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDecryptFinalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_EncryptSingle (
     *     const unsigned char *key, size_t keylen,
     *     CK_MECHANISM_PTR mech,
     *     CK_BYTE_PTR plain, CK_ULONG plainlen,
     *     CK_BYTE_PTR ciphered, CK_ULONG_PTR cipheredlen,
     *     target_t target) ;
     * </pre>
     */
    public void encryptSingle(com.ibm.crypto.grep11.grpc.EncryptSingleRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.EncryptSingleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEncryptSingleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_DecryptSingle (
     *     const unsigned char *key, size_t keylen,
     *     CK_MECHANISM_PTR mech,
     *     CK_BYTE_PTR ciphered, CK_ULONG cipheredlen,
     *     CK_BYTE_PTR plain, CK_ULONG_PTR plainlen,
     *     target_t target) ;
     * </pre>
     */
    public void decryptSingle(com.ibm.crypto.grep11.grpc.DecryptSingleRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DecryptSingleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDecryptSingleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_SignInit (
     *     unsigned char *state, size_t *statelen,
     *     CK_MECHANISM_PTR mech,
     *     const unsigned char *privKey, size_t privKeylen,
     *     target_t target) ;
     * </pre>
     */
    public void signInit(com.ibm.crypto.grep11.grpc.SignInitRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.SignInitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignInitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_VerifyInit (
     *     unsigned char *state, size_t *statelen,
     *     CK_MECHANISM_PTR mech,
     *     const unsigned char *pubKey, size_t pubKeylen,
     *     target_t target) ;
     * </pre>
     */
    public void verifyInit(com.ibm.crypto.grep11.grpc.VerifyInitRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.VerifyInitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyInitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_SignUpdate (
     *     unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     target_t target) ;
     * </pre>
     */
    public void signUpdate(com.ibm.crypto.grep11.grpc.SignUpdateRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.SignUpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_VerifyUpdate (
     *     unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     target_t target) ;
     * </pre>
     */
    public void verifyUpdate(com.ibm.crypto.grep11.grpc.VerifyUpdateRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.VerifyUpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_SignFinal (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR signature, CK_ULONG_PTR signaturelen,
     *     target_t target) ;
     * </pre>
     */
    public void signFinal(com.ibm.crypto.grep11.grpc.SignFinalRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.SignFinalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignFinalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_VerifyFinal (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR signature, CK_ULONG signaturelen,
     *     target_t target) ;
     * </pre>
     */
    public void verifyFinal(com.ibm.crypto.grep11.grpc.VerifyFinalRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.VerifyFinalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyFinalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_Sign (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     CK_BYTE_PTR signature, CK_ULONG_PTR signaturelen,
     *     target_t target) ;
     * </pre>
     */
    public void sign(com.ibm.crypto.grep11.grpc.SignRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.SignResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_Verify (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     CK_BYTE_PTR signature, CK_ULONG signaturelen,
     *     target_t target) ;
     * </pre>
     */
    public void verify(com.ibm.crypto.grep11.grpc.VerifyRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.VerifyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_SignSingle (
     *     const unsigned char *privKey, size_t privKeylen,
     *     CK_MECHANISM_PTR mech,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     CK_BYTE_PTR signature, CK_ULONG_PTR signaturelen,
     *     target_t target) ;
     * </pre>
     */
    public void signSingle(com.ibm.crypto.grep11.grpc.SignSingleRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.SignSingleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignSingleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_VerifySingle (
     *     const unsigned char *pubKey, size_t pubKeylen,
     *     CK_MECHANISM_PTR mech,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     CK_BYTE_PTR signature, CK_ULONG signaturelen,
     *     target_t target) ;
     * </pre>
     */
    public void verifySingle(com.ibm.crypto.grep11.grpc.VerifySingleRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.VerifySingleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifySingleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_GenerateKey (
     *     CK_MECHANISM_PTR mech,
     *     CK_ATTRIBUTE_PTR templateBytes, CK_ULONG templateByteslen,
     *     const unsigned char *pin, size_t pinlen,
     *     unsigned char *keyBytes, size_t *keyByteslen,
     *     unsigned char *checkSum, size_t *checkSumlen,
     *     target_t target) ;
     * </pre>
     */
    public void generateKey(com.ibm.crypto.grep11.grpc.GenerateKeyRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.GenerateKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_GenerateKeyPair (
     *     CK_MECHANISM_PTR mech,
     *     CK_ATTRIBUTE_PTR pubKeyTemplateBytes, CK_ULONG pubKeyTemplateByteslen,
     *     CK_ATTRIBUTE_PTR privKeyTemplateBytes, CK_ULONG privKeyTemplateByteslen,
     *     const unsigned char *pin, size_t pinlen,
     *     unsigned char *privKeyBytes, size_t *privKeyByteslen,
     *     unsigned char *pubKeyBytes, size_t *pubKeyByteslen,
     *     target_t target) ;
     * </pre>
     */
    public void generateKeyPair(com.ibm.crypto.grep11.grpc.GenerateKeyPairRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateKeyPairMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_WrapKey (
     *     const unsigned char *key, size_t keylen,
     *     const unsigned char *keK, size_t keKlen,
     *     const unsigned char *macKey, size_t macKeylen,
     *     const CK_MECHANISM_PTR mech,
     *     CK_BYTE_PTR wrapped, CK_ULONG_PTR wrappedlen,
     *     target_t target) ;
     * </pre>
     */
    public void wrapKey(com.ibm.crypto.grep11.grpc.WrapKeyRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.WrapKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWrapKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_UnwrapKey (
     *     const CK_BYTE_PTR wrapped, CK_ULONG wrappedlen,
     *     const unsigned char *keK, size_t keKlen,
     *     const unsigned char *macKey, size_t macKeylen,
     *     const unsigned char *pin, size_t pinlen,
     *     const CK_MECHANISM_PTR mech,
     *     const CK_ATTRIBUTE_PTR templateBytes, CK_ULONG templateByteslen,
     *     unsigned char *unwrappedBytes, size_t *unwrappedByteslen,
     *     CK_BYTE_PTR checkSum, CK_ULONG *checkSumlen,
     *     target_t target) ;
     * </pre>
     */
    public void unwrapKey(com.ibm.crypto.grep11.grpc.UnwrapKeyRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.UnwrapKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnwrapKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_DeriveKey (
     *     CK_MECHANISM_PTR mech,
     *     CK_ATTRIBUTE_PTR templateBytes, CK_ULONG templateByteslen,
     *     const unsigned char *baseKey, size_t baseKeylen,
     *     const unsigned char *data, size_t datalen,
     *     const unsigned char *pin, size_t pinlen,
     *     unsigned char *newKeyBytes, size_t *newKeyByteslen,
     *     unsigned char *checkSum, size_t *checkSumlen,
     *     target_t target) ;
     * </pre>
     */
    public void deriveKey(com.ibm.crypto.grep11.grpc.DeriveKeyRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DeriveKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeriveKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_GetMechanismList (
     *     CK_SLOT_ID slot,
     *     CK_MECHANISM_TYPE_PTR mechs, CK_ULONG_PTR mechslen,
     *     target_t target) ;
     * </pre>
     */
    public void getMechanismList(com.ibm.crypto.grep11.grpc.GetMechanismListRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.GetMechanismListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMechanismListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_GetMechanismInfo (
     *     CK_SLOT_ID slot,
     *     CK_MECHANISM_TYPE mech,
     *     CK_MECHANISM_INFO_PTR mechInfo,
     *     target_t target) ;
     * </pre>
     */
    public void getMechanismInfo(com.ibm.crypto.grep11.grpc.GetMechanismInfoRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.GetMechanismInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMechanismInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_GetAttributeValue (
     *     const unsigned char *object, size_t objectlen,
     *     CK_ATTRIBUTE_PTR attributesBytes, CK_ULONG attributesByteslen,
     *     target_t target) ;
     * </pre>
     */
    public void getAttributeValue(com.ibm.crypto.grep11.grpc.GetAttributeValueRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.GetAttributeValueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAttributeValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CK_RV m_SetAttributeValue (
     *     unsigned char *object, size_t objectlen,
     *     CK_ATTRIBUTE_PTR attributesBytes, CK_ULONG attributesByteslen,
     *     target_t target) ;
     * </pre>
     */
    public void setAttributeValue(com.ibm.crypto.grep11.grpc.SetAttributeValueRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.SetAttributeValueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAttributeValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rewrapKeyBlob(com.ibm.crypto.grep11.grpc.RewrapKeyBlobRequest request,
        io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.RewrapKeyBlobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRewrapKeyBlobMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * See https://www.ibm.com/downloads/cas/WXRDPRAN for further documentation
   * </pre>
   */
  public static final class CryptoBlockingStub extends io.grpc.stub.AbstractBlockingStub<CryptoBlockingStub> {
    private CryptoBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CryptoBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CryptoBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CK_RV m_GenerateRandom (
     *     CK_BYTE_PTR rnd, CK_ULONG rndlen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.GenerateRandomResponse generateRandom(com.ibm.crypto.grep11.grpc.GenerateRandomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateRandomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_DigestInit (
     *     unsigned char *state, size_t *statelen,
     *     const CK_MECHANISM_PTR mech,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.DigestInitResponse digestInit(com.ibm.crypto.grep11.grpc.DigestInitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDigestInitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_Digest (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     CK_BYTE_PTR digest, CK_ULONG_PTR digestlen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.DigestResponse digest(com.ibm.crypto.grep11.grpc.DigestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDigestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_DigestUpdate (
     *     unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.DigestUpdateResponse digestUpdate(com.ibm.crypto.grep11.grpc.DigestUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDigestUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_DigestKey (
     *     unsigned char *state, size_t statelen,
     *     const unsigned char *key, size_t keylen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.DigestKeyResponse digestKey(com.ibm.crypto.grep11.grpc.DigestKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDigestKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_DigestFinal (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR digest, CK_ULONG_PTR digestlen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.DigestFinalResponse digestFinal(com.ibm.crypto.grep11.grpc.DigestFinalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDigestFinalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_DigestSingle (
     *     CK_MECHANISM_PTR mech,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     CK_BYTE_PTR digest, CK_ULONG_PTR digestlen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.DigestSingleResponse digestSingle(com.ibm.crypto.grep11.grpc.DigestSingleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDigestSingleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_EncryptInit (
     *     unsigned char *state, size_t *statelen,
     *     CK_MECHANISM_PTR mech,
     *     const unsigned char *key, size_t keylen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.EncryptInitResponse encryptInit(com.ibm.crypto.grep11.grpc.EncryptInitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEncryptInitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_DecryptInit (
     *     unsigned char *state, size_t *statelen,
     *     CK_MECHANISM_PTR mech,
     *     const unsigned char *key, size_t keylen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.DecryptInitResponse decryptInit(com.ibm.crypto.grep11.grpc.DecryptInitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDecryptInitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_EncryptUpdate (
     *     unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR plain, CK_ULONG plainlen,
     *     CK_BYTE_PTR ciphered, CK_ULONG_PTR cipheredlen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.EncryptUpdateResponse encryptUpdate(com.ibm.crypto.grep11.grpc.EncryptUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEncryptUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_DecryptUpdate (
     *     unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR ciphered, CK_ULONG cipheredlen,
     *     CK_BYTE_PTR plain, CK_ULONG_PTR plainlen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.DecryptUpdateResponse decryptUpdate(com.ibm.crypto.grep11.grpc.DecryptUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDecryptUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_Encrypt (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR plain, CK_ULONG plainlen,
     *     CK_BYTE_PTR ciphered, CK_ULONG_PTR cipheredlen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.EncryptResponse encrypt(com.ibm.crypto.grep11.grpc.EncryptRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEncryptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_Decrypt (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR ciphered, CK_ULONG cipheredlen,
     *     CK_BYTE_PTR plain, CK_ULONG_PTR plainlen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.DecryptResponse decrypt(com.ibm.crypto.grep11.grpc.DecryptRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDecryptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_EncryptFinal (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR ciphered, CK_ULONG_PTR cipheredlen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.EncryptFinalResponse encryptFinal(com.ibm.crypto.grep11.grpc.EncryptFinalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEncryptFinalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_DecryptFinal (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR plain, CK_ULONG_PTR plainlen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.DecryptFinalResponse decryptFinal(com.ibm.crypto.grep11.grpc.DecryptFinalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDecryptFinalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_EncryptSingle (
     *     const unsigned char *key, size_t keylen,
     *     CK_MECHANISM_PTR mech,
     *     CK_BYTE_PTR plain, CK_ULONG plainlen,
     *     CK_BYTE_PTR ciphered, CK_ULONG_PTR cipheredlen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.EncryptSingleResponse encryptSingle(com.ibm.crypto.grep11.grpc.EncryptSingleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEncryptSingleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_DecryptSingle (
     *     const unsigned char *key, size_t keylen,
     *     CK_MECHANISM_PTR mech,
     *     CK_BYTE_PTR ciphered, CK_ULONG cipheredlen,
     *     CK_BYTE_PTR plain, CK_ULONG_PTR plainlen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.DecryptSingleResponse decryptSingle(com.ibm.crypto.grep11.grpc.DecryptSingleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDecryptSingleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_SignInit (
     *     unsigned char *state, size_t *statelen,
     *     CK_MECHANISM_PTR mech,
     *     const unsigned char *privKey, size_t privKeylen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.SignInitResponse signInit(com.ibm.crypto.grep11.grpc.SignInitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignInitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_VerifyInit (
     *     unsigned char *state, size_t *statelen,
     *     CK_MECHANISM_PTR mech,
     *     const unsigned char *pubKey, size_t pubKeylen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.VerifyInitResponse verifyInit(com.ibm.crypto.grep11.grpc.VerifyInitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyInitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_SignUpdate (
     *     unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.SignUpdateResponse signUpdate(com.ibm.crypto.grep11.grpc.SignUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_VerifyUpdate (
     *     unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.VerifyUpdateResponse verifyUpdate(com.ibm.crypto.grep11.grpc.VerifyUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_SignFinal (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR signature, CK_ULONG_PTR signaturelen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.SignFinalResponse signFinal(com.ibm.crypto.grep11.grpc.SignFinalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignFinalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_VerifyFinal (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR signature, CK_ULONG signaturelen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.VerifyFinalResponse verifyFinal(com.ibm.crypto.grep11.grpc.VerifyFinalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyFinalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_Sign (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     CK_BYTE_PTR signature, CK_ULONG_PTR signaturelen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.SignResponse sign(com.ibm.crypto.grep11.grpc.SignRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_Verify (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     CK_BYTE_PTR signature, CK_ULONG signaturelen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.VerifyResponse verify(com.ibm.crypto.grep11.grpc.VerifyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_SignSingle (
     *     const unsigned char *privKey, size_t privKeylen,
     *     CK_MECHANISM_PTR mech,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     CK_BYTE_PTR signature, CK_ULONG_PTR signaturelen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.SignSingleResponse signSingle(com.ibm.crypto.grep11.grpc.SignSingleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignSingleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_VerifySingle (
     *     const unsigned char *pubKey, size_t pubKeylen,
     *     CK_MECHANISM_PTR mech,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     CK_BYTE_PTR signature, CK_ULONG signaturelen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.VerifySingleResponse verifySingle(com.ibm.crypto.grep11.grpc.VerifySingleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifySingleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_GenerateKey (
     *     CK_MECHANISM_PTR mech,
     *     CK_ATTRIBUTE_PTR templateBytes, CK_ULONG templateByteslen,
     *     const unsigned char *pin, size_t pinlen,
     *     unsigned char *keyBytes, size_t *keyByteslen,
     *     unsigned char *checkSum, size_t *checkSumlen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.GenerateKeyResponse generateKey(com.ibm.crypto.grep11.grpc.GenerateKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_GenerateKeyPair (
     *     CK_MECHANISM_PTR mech,
     *     CK_ATTRIBUTE_PTR pubKeyTemplateBytes, CK_ULONG pubKeyTemplateByteslen,
     *     CK_ATTRIBUTE_PTR privKeyTemplateBytes, CK_ULONG privKeyTemplateByteslen,
     *     const unsigned char *pin, size_t pinlen,
     *     unsigned char *privKeyBytes, size_t *privKeyByteslen,
     *     unsigned char *pubKeyBytes, size_t *pubKeyByteslen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse generateKeyPair(com.ibm.crypto.grep11.grpc.GenerateKeyPairRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateKeyPairMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_WrapKey (
     *     const unsigned char *key, size_t keylen,
     *     const unsigned char *keK, size_t keKlen,
     *     const unsigned char *macKey, size_t macKeylen,
     *     const CK_MECHANISM_PTR mech,
     *     CK_BYTE_PTR wrapped, CK_ULONG_PTR wrappedlen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.WrapKeyResponse wrapKey(com.ibm.crypto.grep11.grpc.WrapKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWrapKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_UnwrapKey (
     *     const CK_BYTE_PTR wrapped, CK_ULONG wrappedlen,
     *     const unsigned char *keK, size_t keKlen,
     *     const unsigned char *macKey, size_t macKeylen,
     *     const unsigned char *pin, size_t pinlen,
     *     const CK_MECHANISM_PTR mech,
     *     const CK_ATTRIBUTE_PTR templateBytes, CK_ULONG templateByteslen,
     *     unsigned char *unwrappedBytes, size_t *unwrappedByteslen,
     *     CK_BYTE_PTR checkSum, CK_ULONG *checkSumlen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.UnwrapKeyResponse unwrapKey(com.ibm.crypto.grep11.grpc.UnwrapKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnwrapKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_DeriveKey (
     *     CK_MECHANISM_PTR mech,
     *     CK_ATTRIBUTE_PTR templateBytes, CK_ULONG templateByteslen,
     *     const unsigned char *baseKey, size_t baseKeylen,
     *     const unsigned char *data, size_t datalen,
     *     const unsigned char *pin, size_t pinlen,
     *     unsigned char *newKeyBytes, size_t *newKeyByteslen,
     *     unsigned char *checkSum, size_t *checkSumlen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.DeriveKeyResponse deriveKey(com.ibm.crypto.grep11.grpc.DeriveKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeriveKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_GetMechanismList (
     *     CK_SLOT_ID slot,
     *     CK_MECHANISM_TYPE_PTR mechs, CK_ULONG_PTR mechslen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.GetMechanismListResponse getMechanismList(com.ibm.crypto.grep11.grpc.GetMechanismListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMechanismListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_GetMechanismInfo (
     *     CK_SLOT_ID slot,
     *     CK_MECHANISM_TYPE mech,
     *     CK_MECHANISM_INFO_PTR mechInfo,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.GetMechanismInfoResponse getMechanismInfo(com.ibm.crypto.grep11.grpc.GetMechanismInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMechanismInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_GetAttributeValue (
     *     const unsigned char *object, size_t objectlen,
     *     CK_ATTRIBUTE_PTR attributesBytes, CK_ULONG attributesByteslen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.GetAttributeValueResponse getAttributeValue(com.ibm.crypto.grep11.grpc.GetAttributeValueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAttributeValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CK_RV m_SetAttributeValue (
     *     unsigned char *object, size_t objectlen,
     *     CK_ATTRIBUTE_PTR attributesBytes, CK_ULONG attributesByteslen,
     *     target_t target) ;
     * </pre>
     */
    public com.ibm.crypto.grep11.grpc.SetAttributeValueResponse setAttributeValue(com.ibm.crypto.grep11.grpc.SetAttributeValueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAttributeValueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ibm.crypto.grep11.grpc.RewrapKeyBlobResponse rewrapKeyBlob(com.ibm.crypto.grep11.grpc.RewrapKeyBlobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRewrapKeyBlobMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * See https://www.ibm.com/downloads/cas/WXRDPRAN for further documentation
   * </pre>
   */
  public static final class CryptoFutureStub extends io.grpc.stub.AbstractFutureStub<CryptoFutureStub> {
    private CryptoFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CryptoFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CryptoFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CK_RV m_GenerateRandom (
     *     CK_BYTE_PTR rnd, CK_ULONG rndlen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.GenerateRandomResponse> generateRandom(
        com.ibm.crypto.grep11.grpc.GenerateRandomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateRandomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_DigestInit (
     *     unsigned char *state, size_t *statelen,
     *     const CK_MECHANISM_PTR mech,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.DigestInitResponse> digestInit(
        com.ibm.crypto.grep11.grpc.DigestInitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDigestInitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_Digest (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     CK_BYTE_PTR digest, CK_ULONG_PTR digestlen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.DigestResponse> digest(
        com.ibm.crypto.grep11.grpc.DigestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDigestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_DigestUpdate (
     *     unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.DigestUpdateResponse> digestUpdate(
        com.ibm.crypto.grep11.grpc.DigestUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDigestUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_DigestKey (
     *     unsigned char *state, size_t statelen,
     *     const unsigned char *key, size_t keylen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.DigestKeyResponse> digestKey(
        com.ibm.crypto.grep11.grpc.DigestKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDigestKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_DigestFinal (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR digest, CK_ULONG_PTR digestlen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.DigestFinalResponse> digestFinal(
        com.ibm.crypto.grep11.grpc.DigestFinalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDigestFinalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_DigestSingle (
     *     CK_MECHANISM_PTR mech,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     CK_BYTE_PTR digest, CK_ULONG_PTR digestlen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.DigestSingleResponse> digestSingle(
        com.ibm.crypto.grep11.grpc.DigestSingleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDigestSingleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_EncryptInit (
     *     unsigned char *state, size_t *statelen,
     *     CK_MECHANISM_PTR mech,
     *     const unsigned char *key, size_t keylen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.EncryptInitResponse> encryptInit(
        com.ibm.crypto.grep11.grpc.EncryptInitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEncryptInitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_DecryptInit (
     *     unsigned char *state, size_t *statelen,
     *     CK_MECHANISM_PTR mech,
     *     const unsigned char *key, size_t keylen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.DecryptInitResponse> decryptInit(
        com.ibm.crypto.grep11.grpc.DecryptInitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDecryptInitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_EncryptUpdate (
     *     unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR plain, CK_ULONG plainlen,
     *     CK_BYTE_PTR ciphered, CK_ULONG_PTR cipheredlen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.EncryptUpdateResponse> encryptUpdate(
        com.ibm.crypto.grep11.grpc.EncryptUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEncryptUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_DecryptUpdate (
     *     unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR ciphered, CK_ULONG cipheredlen,
     *     CK_BYTE_PTR plain, CK_ULONG_PTR plainlen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.DecryptUpdateResponse> decryptUpdate(
        com.ibm.crypto.grep11.grpc.DecryptUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDecryptUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_Encrypt (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR plain, CK_ULONG plainlen,
     *     CK_BYTE_PTR ciphered, CK_ULONG_PTR cipheredlen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.EncryptResponse> encrypt(
        com.ibm.crypto.grep11.grpc.EncryptRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEncryptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_Decrypt (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR ciphered, CK_ULONG cipheredlen,
     *     CK_BYTE_PTR plain, CK_ULONG_PTR plainlen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.DecryptResponse> decrypt(
        com.ibm.crypto.grep11.grpc.DecryptRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDecryptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_EncryptFinal (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR ciphered, CK_ULONG_PTR cipheredlen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.EncryptFinalResponse> encryptFinal(
        com.ibm.crypto.grep11.grpc.EncryptFinalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEncryptFinalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_DecryptFinal (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR plain, CK_ULONG_PTR plainlen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.DecryptFinalResponse> decryptFinal(
        com.ibm.crypto.grep11.grpc.DecryptFinalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDecryptFinalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_EncryptSingle (
     *     const unsigned char *key, size_t keylen,
     *     CK_MECHANISM_PTR mech,
     *     CK_BYTE_PTR plain, CK_ULONG plainlen,
     *     CK_BYTE_PTR ciphered, CK_ULONG_PTR cipheredlen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.EncryptSingleResponse> encryptSingle(
        com.ibm.crypto.grep11.grpc.EncryptSingleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEncryptSingleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_DecryptSingle (
     *     const unsigned char *key, size_t keylen,
     *     CK_MECHANISM_PTR mech,
     *     CK_BYTE_PTR ciphered, CK_ULONG cipheredlen,
     *     CK_BYTE_PTR plain, CK_ULONG_PTR plainlen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.DecryptSingleResponse> decryptSingle(
        com.ibm.crypto.grep11.grpc.DecryptSingleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDecryptSingleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_SignInit (
     *     unsigned char *state, size_t *statelen,
     *     CK_MECHANISM_PTR mech,
     *     const unsigned char *privKey, size_t privKeylen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.SignInitResponse> signInit(
        com.ibm.crypto.grep11.grpc.SignInitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignInitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_VerifyInit (
     *     unsigned char *state, size_t *statelen,
     *     CK_MECHANISM_PTR mech,
     *     const unsigned char *pubKey, size_t pubKeylen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.VerifyInitResponse> verifyInit(
        com.ibm.crypto.grep11.grpc.VerifyInitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyInitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_SignUpdate (
     *     unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.SignUpdateResponse> signUpdate(
        com.ibm.crypto.grep11.grpc.SignUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_VerifyUpdate (
     *     unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.VerifyUpdateResponse> verifyUpdate(
        com.ibm.crypto.grep11.grpc.VerifyUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_SignFinal (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR signature, CK_ULONG_PTR signaturelen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.SignFinalResponse> signFinal(
        com.ibm.crypto.grep11.grpc.SignFinalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignFinalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_VerifyFinal (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR signature, CK_ULONG signaturelen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.VerifyFinalResponse> verifyFinal(
        com.ibm.crypto.grep11.grpc.VerifyFinalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyFinalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_Sign (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     CK_BYTE_PTR signature, CK_ULONG_PTR signaturelen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.SignResponse> sign(
        com.ibm.crypto.grep11.grpc.SignRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_Verify (
     *     const unsigned char *state, size_t statelen,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     CK_BYTE_PTR signature, CK_ULONG signaturelen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.VerifyResponse> verify(
        com.ibm.crypto.grep11.grpc.VerifyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_SignSingle (
     *     const unsigned char *privKey, size_t privKeylen,
     *     CK_MECHANISM_PTR mech,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     CK_BYTE_PTR signature, CK_ULONG_PTR signaturelen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.SignSingleResponse> signSingle(
        com.ibm.crypto.grep11.grpc.SignSingleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignSingleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_VerifySingle (
     *     const unsigned char *pubKey, size_t pubKeylen,
     *     CK_MECHANISM_PTR mech,
     *     CK_BYTE_PTR data, CK_ULONG datalen,
     *     CK_BYTE_PTR signature, CK_ULONG signaturelen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.VerifySingleResponse> verifySingle(
        com.ibm.crypto.grep11.grpc.VerifySingleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifySingleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_GenerateKey (
     *     CK_MECHANISM_PTR mech,
     *     CK_ATTRIBUTE_PTR templateBytes, CK_ULONG templateByteslen,
     *     const unsigned char *pin, size_t pinlen,
     *     unsigned char *keyBytes, size_t *keyByteslen,
     *     unsigned char *checkSum, size_t *checkSumlen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.GenerateKeyResponse> generateKey(
        com.ibm.crypto.grep11.grpc.GenerateKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_GenerateKeyPair (
     *     CK_MECHANISM_PTR mech,
     *     CK_ATTRIBUTE_PTR pubKeyTemplateBytes, CK_ULONG pubKeyTemplateByteslen,
     *     CK_ATTRIBUTE_PTR privKeyTemplateBytes, CK_ULONG privKeyTemplateByteslen,
     *     const unsigned char *pin, size_t pinlen,
     *     unsigned char *privKeyBytes, size_t *privKeyByteslen,
     *     unsigned char *pubKeyBytes, size_t *pubKeyByteslen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse> generateKeyPair(
        com.ibm.crypto.grep11.grpc.GenerateKeyPairRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateKeyPairMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_WrapKey (
     *     const unsigned char *key, size_t keylen,
     *     const unsigned char *keK, size_t keKlen,
     *     const unsigned char *macKey, size_t macKeylen,
     *     const CK_MECHANISM_PTR mech,
     *     CK_BYTE_PTR wrapped, CK_ULONG_PTR wrappedlen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.WrapKeyResponse> wrapKey(
        com.ibm.crypto.grep11.grpc.WrapKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWrapKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_UnwrapKey (
     *     const CK_BYTE_PTR wrapped, CK_ULONG wrappedlen,
     *     const unsigned char *keK, size_t keKlen,
     *     const unsigned char *macKey, size_t macKeylen,
     *     const unsigned char *pin, size_t pinlen,
     *     const CK_MECHANISM_PTR mech,
     *     const CK_ATTRIBUTE_PTR templateBytes, CK_ULONG templateByteslen,
     *     unsigned char *unwrappedBytes, size_t *unwrappedByteslen,
     *     CK_BYTE_PTR checkSum, CK_ULONG *checkSumlen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.UnwrapKeyResponse> unwrapKey(
        com.ibm.crypto.grep11.grpc.UnwrapKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnwrapKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_DeriveKey (
     *     CK_MECHANISM_PTR mech,
     *     CK_ATTRIBUTE_PTR templateBytes, CK_ULONG templateByteslen,
     *     const unsigned char *baseKey, size_t baseKeylen,
     *     const unsigned char *data, size_t datalen,
     *     const unsigned char *pin, size_t pinlen,
     *     unsigned char *newKeyBytes, size_t *newKeyByteslen,
     *     unsigned char *checkSum, size_t *checkSumlen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.DeriveKeyResponse> deriveKey(
        com.ibm.crypto.grep11.grpc.DeriveKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeriveKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_GetMechanismList (
     *     CK_SLOT_ID slot,
     *     CK_MECHANISM_TYPE_PTR mechs, CK_ULONG_PTR mechslen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.GetMechanismListResponse> getMechanismList(
        com.ibm.crypto.grep11.grpc.GetMechanismListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMechanismListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_GetMechanismInfo (
     *     CK_SLOT_ID slot,
     *     CK_MECHANISM_TYPE mech,
     *     CK_MECHANISM_INFO_PTR mechInfo,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.GetMechanismInfoResponse> getMechanismInfo(
        com.ibm.crypto.grep11.grpc.GetMechanismInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMechanismInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_GetAttributeValue (
     *     const unsigned char *object, size_t objectlen,
     *     CK_ATTRIBUTE_PTR attributesBytes, CK_ULONG attributesByteslen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.GetAttributeValueResponse> getAttributeValue(
        com.ibm.crypto.grep11.grpc.GetAttributeValueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAttributeValueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CK_RV m_SetAttributeValue (
     *     unsigned char *object, size_t objectlen,
     *     CK_ATTRIBUTE_PTR attributesBytes, CK_ULONG attributesByteslen,
     *     target_t target) ;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.SetAttributeValueResponse> setAttributeValue(
        com.ibm.crypto.grep11.grpc.SetAttributeValueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAttributeValueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ibm.crypto.grep11.grpc.RewrapKeyBlobResponse> rewrapKeyBlob(
        com.ibm.crypto.grep11.grpc.RewrapKeyBlobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRewrapKeyBlobMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENERATE_RANDOM = 0;
  private static final int METHODID_DIGEST_INIT = 1;
  private static final int METHODID_DIGEST = 2;
  private static final int METHODID_DIGEST_UPDATE = 3;
  private static final int METHODID_DIGEST_KEY = 4;
  private static final int METHODID_DIGEST_FINAL = 5;
  private static final int METHODID_DIGEST_SINGLE = 6;
  private static final int METHODID_ENCRYPT_INIT = 7;
  private static final int METHODID_DECRYPT_INIT = 8;
  private static final int METHODID_ENCRYPT_UPDATE = 9;
  private static final int METHODID_DECRYPT_UPDATE = 10;
  private static final int METHODID_ENCRYPT = 11;
  private static final int METHODID_DECRYPT = 12;
  private static final int METHODID_ENCRYPT_FINAL = 13;
  private static final int METHODID_DECRYPT_FINAL = 14;
  private static final int METHODID_ENCRYPT_SINGLE = 15;
  private static final int METHODID_DECRYPT_SINGLE = 16;
  private static final int METHODID_SIGN_INIT = 17;
  private static final int METHODID_VERIFY_INIT = 18;
  private static final int METHODID_SIGN_UPDATE = 19;
  private static final int METHODID_VERIFY_UPDATE = 20;
  private static final int METHODID_SIGN_FINAL = 21;
  private static final int METHODID_VERIFY_FINAL = 22;
  private static final int METHODID_SIGN = 23;
  private static final int METHODID_VERIFY = 24;
  private static final int METHODID_SIGN_SINGLE = 25;
  private static final int METHODID_VERIFY_SINGLE = 26;
  private static final int METHODID_GENERATE_KEY = 27;
  private static final int METHODID_GENERATE_KEY_PAIR = 28;
  private static final int METHODID_WRAP_KEY = 29;
  private static final int METHODID_UNWRAP_KEY = 30;
  private static final int METHODID_DERIVE_KEY = 31;
  private static final int METHODID_GET_MECHANISM_LIST = 32;
  private static final int METHODID_GET_MECHANISM_INFO = 33;
  private static final int METHODID_GET_ATTRIBUTE_VALUE = 34;
  private static final int METHODID_SET_ATTRIBUTE_VALUE = 35;
  private static final int METHODID_REWRAP_KEY_BLOB = 36;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CryptoImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CryptoImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GENERATE_RANDOM:
          serviceImpl.generateRandom((com.ibm.crypto.grep11.grpc.GenerateRandomRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.GenerateRandomResponse>) responseObserver);
          break;
        case METHODID_DIGEST_INIT:
          serviceImpl.digestInit((com.ibm.crypto.grep11.grpc.DigestInitRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DigestInitResponse>) responseObserver);
          break;
        case METHODID_DIGEST:
          serviceImpl.digest((com.ibm.crypto.grep11.grpc.DigestRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DigestResponse>) responseObserver);
          break;
        case METHODID_DIGEST_UPDATE:
          serviceImpl.digestUpdate((com.ibm.crypto.grep11.grpc.DigestUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DigestUpdateResponse>) responseObserver);
          break;
        case METHODID_DIGEST_KEY:
          serviceImpl.digestKey((com.ibm.crypto.grep11.grpc.DigestKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DigestKeyResponse>) responseObserver);
          break;
        case METHODID_DIGEST_FINAL:
          serviceImpl.digestFinal((com.ibm.crypto.grep11.grpc.DigestFinalRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DigestFinalResponse>) responseObserver);
          break;
        case METHODID_DIGEST_SINGLE:
          serviceImpl.digestSingle((com.ibm.crypto.grep11.grpc.DigestSingleRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DigestSingleResponse>) responseObserver);
          break;
        case METHODID_ENCRYPT_INIT:
          serviceImpl.encryptInit((com.ibm.crypto.grep11.grpc.EncryptInitRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.EncryptInitResponse>) responseObserver);
          break;
        case METHODID_DECRYPT_INIT:
          serviceImpl.decryptInit((com.ibm.crypto.grep11.grpc.DecryptInitRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DecryptInitResponse>) responseObserver);
          break;
        case METHODID_ENCRYPT_UPDATE:
          serviceImpl.encryptUpdate((com.ibm.crypto.grep11.grpc.EncryptUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.EncryptUpdateResponse>) responseObserver);
          break;
        case METHODID_DECRYPT_UPDATE:
          serviceImpl.decryptUpdate((com.ibm.crypto.grep11.grpc.DecryptUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DecryptUpdateResponse>) responseObserver);
          break;
        case METHODID_ENCRYPT:
          serviceImpl.encrypt((com.ibm.crypto.grep11.grpc.EncryptRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.EncryptResponse>) responseObserver);
          break;
        case METHODID_DECRYPT:
          serviceImpl.decrypt((com.ibm.crypto.grep11.grpc.DecryptRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DecryptResponse>) responseObserver);
          break;
        case METHODID_ENCRYPT_FINAL:
          serviceImpl.encryptFinal((com.ibm.crypto.grep11.grpc.EncryptFinalRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.EncryptFinalResponse>) responseObserver);
          break;
        case METHODID_DECRYPT_FINAL:
          serviceImpl.decryptFinal((com.ibm.crypto.grep11.grpc.DecryptFinalRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DecryptFinalResponse>) responseObserver);
          break;
        case METHODID_ENCRYPT_SINGLE:
          serviceImpl.encryptSingle((com.ibm.crypto.grep11.grpc.EncryptSingleRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.EncryptSingleResponse>) responseObserver);
          break;
        case METHODID_DECRYPT_SINGLE:
          serviceImpl.decryptSingle((com.ibm.crypto.grep11.grpc.DecryptSingleRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DecryptSingleResponse>) responseObserver);
          break;
        case METHODID_SIGN_INIT:
          serviceImpl.signInit((com.ibm.crypto.grep11.grpc.SignInitRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.SignInitResponse>) responseObserver);
          break;
        case METHODID_VERIFY_INIT:
          serviceImpl.verifyInit((com.ibm.crypto.grep11.grpc.VerifyInitRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.VerifyInitResponse>) responseObserver);
          break;
        case METHODID_SIGN_UPDATE:
          serviceImpl.signUpdate((com.ibm.crypto.grep11.grpc.SignUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.SignUpdateResponse>) responseObserver);
          break;
        case METHODID_VERIFY_UPDATE:
          serviceImpl.verifyUpdate((com.ibm.crypto.grep11.grpc.VerifyUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.VerifyUpdateResponse>) responseObserver);
          break;
        case METHODID_SIGN_FINAL:
          serviceImpl.signFinal((com.ibm.crypto.grep11.grpc.SignFinalRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.SignFinalResponse>) responseObserver);
          break;
        case METHODID_VERIFY_FINAL:
          serviceImpl.verifyFinal((com.ibm.crypto.grep11.grpc.VerifyFinalRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.VerifyFinalResponse>) responseObserver);
          break;
        case METHODID_SIGN:
          serviceImpl.sign((com.ibm.crypto.grep11.grpc.SignRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.SignResponse>) responseObserver);
          break;
        case METHODID_VERIFY:
          serviceImpl.verify((com.ibm.crypto.grep11.grpc.VerifyRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.VerifyResponse>) responseObserver);
          break;
        case METHODID_SIGN_SINGLE:
          serviceImpl.signSingle((com.ibm.crypto.grep11.grpc.SignSingleRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.SignSingleResponse>) responseObserver);
          break;
        case METHODID_VERIFY_SINGLE:
          serviceImpl.verifySingle((com.ibm.crypto.grep11.grpc.VerifySingleRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.VerifySingleResponse>) responseObserver);
          break;
        case METHODID_GENERATE_KEY:
          serviceImpl.generateKey((com.ibm.crypto.grep11.grpc.GenerateKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.GenerateKeyResponse>) responseObserver);
          break;
        case METHODID_GENERATE_KEY_PAIR:
          serviceImpl.generateKeyPair((com.ibm.crypto.grep11.grpc.GenerateKeyPairRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse>) responseObserver);
          break;
        case METHODID_WRAP_KEY:
          serviceImpl.wrapKey((com.ibm.crypto.grep11.grpc.WrapKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.WrapKeyResponse>) responseObserver);
          break;
        case METHODID_UNWRAP_KEY:
          serviceImpl.unwrapKey((com.ibm.crypto.grep11.grpc.UnwrapKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.UnwrapKeyResponse>) responseObserver);
          break;
        case METHODID_DERIVE_KEY:
          serviceImpl.deriveKey((com.ibm.crypto.grep11.grpc.DeriveKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.DeriveKeyResponse>) responseObserver);
          break;
        case METHODID_GET_MECHANISM_LIST:
          serviceImpl.getMechanismList((com.ibm.crypto.grep11.grpc.GetMechanismListRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.GetMechanismListResponse>) responseObserver);
          break;
        case METHODID_GET_MECHANISM_INFO:
          serviceImpl.getMechanismInfo((com.ibm.crypto.grep11.grpc.GetMechanismInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.GetMechanismInfoResponse>) responseObserver);
          break;
        case METHODID_GET_ATTRIBUTE_VALUE:
          serviceImpl.getAttributeValue((com.ibm.crypto.grep11.grpc.GetAttributeValueRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.GetAttributeValueResponse>) responseObserver);
          break;
        case METHODID_SET_ATTRIBUTE_VALUE:
          serviceImpl.setAttributeValue((com.ibm.crypto.grep11.grpc.SetAttributeValueRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.SetAttributeValueResponse>) responseObserver);
          break;
        case METHODID_REWRAP_KEY_BLOB:
          serviceImpl.rewrapKeyBlob((com.ibm.crypto.grep11.grpc.RewrapKeyBlobRequest) request,
              (io.grpc.stub.StreamObserver<com.ibm.crypto.grep11.grpc.RewrapKeyBlobResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CryptoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CryptoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ibm.crypto.grep11.grpc.Server.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Crypto");
    }
  }

  private static final class CryptoFileDescriptorSupplier
      extends CryptoBaseDescriptorSupplier {
    CryptoFileDescriptorSupplier() {}
  }

  private static final class CryptoMethodDescriptorSupplier
      extends CryptoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CryptoMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CryptoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CryptoFileDescriptorSupplier())
              .addMethod(getGenerateRandomMethod())
              .addMethod(getDigestInitMethod())
              .addMethod(getDigestMethod())
              .addMethod(getDigestUpdateMethod())
              .addMethod(getDigestKeyMethod())
              .addMethod(getDigestFinalMethod())
              .addMethod(getDigestSingleMethod())
              .addMethod(getEncryptInitMethod())
              .addMethod(getDecryptInitMethod())
              .addMethod(getEncryptUpdateMethod())
              .addMethod(getDecryptUpdateMethod())
              .addMethod(getEncryptMethod())
              .addMethod(getDecryptMethod())
              .addMethod(getEncryptFinalMethod())
              .addMethod(getDecryptFinalMethod())
              .addMethod(getEncryptSingleMethod())
              .addMethod(getDecryptSingleMethod())
              .addMethod(getSignInitMethod())
              .addMethod(getVerifyInitMethod())
              .addMethod(getSignUpdateMethod())
              .addMethod(getVerifyUpdateMethod())
              .addMethod(getSignFinalMethod())
              .addMethod(getVerifyFinalMethod())
              .addMethod(getSignMethod())
              .addMethod(getVerifyMethod())
              .addMethod(getSignSingleMethod())
              .addMethod(getVerifySingleMethod())
              .addMethod(getGenerateKeyMethod())
              .addMethod(getGenerateKeyPairMethod())
              .addMethod(getWrapKeyMethod())
              .addMethod(getUnwrapKeyMethod())
              .addMethod(getDeriveKeyMethod())
              .addMethod(getGetMechanismListMethod())
              .addMethod(getGetMechanismInfoMethod())
              .addMethod(getGetAttributeValueMethod())
              .addMethod(getSetAttributeValueMethod())
              .addMethod(getRewrapKeyBlobMethod())
              .build();
        }
      }
    }
    return result;
  }
}
