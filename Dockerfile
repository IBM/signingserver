FROM ubuntu as builder
RUN apt-get update && apt-get upgrade -y && apt-get install -y default-jdk maven protobuf-compiler

WORKDIR /src/signingserver
COPY . .
RUN mvn package

FROM ubuntu
RUN apt-get update && apt-get upgrade -y && apt-get install -y default-jre wget unzip

RUN wget https://public.dhe.ibm.com/ibmdl/export/pub/software/openliberty/runtime/release/2021-06-29_1900/openliberty-webProfile8-21.0.0.7.zip
RUN unzip openliberty-webProfile8-21.0.0.7.zip
RUN rm openliberty-webProfile8-21.0.0.7.zip
RUN /wlp/bin/server create default
RUN /wlp/bin/securityUtility createSSLCertificate --server=default --password=changeit --validity=730
RUN /wlp/bin/featureUtility installFeature grpcClient-1.0

RUN mkdir -p /data/signingservice/keys

COPY --from=builder /src/signingserver/webapp/target/signing.war /wlp/usr/servers/default/dropins/signing.war
COPY --from=builder /src/signingserver/webapp/server.xml /wlp/usr/servers/default/server.xml
COPY --from=builder /src/signingserver/runsigningserver.sh /data/signingservice/runsigningserver.sh
RUN chmod +x /data/signingservice/runsigningserver.sh

EXPOSE 9443

WORKDIR /
ENTRYPOINT ["/usr/bin/bash", "-c"]
CMD ["/data/signingservice/runsigningserver.sh"]
