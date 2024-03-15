FROM ubuntu as builder
RUN apt-get update && apt-get upgrade -y && apt-get install -y default-jdk maven protobuf-compiler

WORKDIR /src/signingserver
COPY . .
RUN mvn package

FROM ubuntu:22.04
RUN apt-get update && apt-get upgrade -y && apt-get install -y default-jre wget unzip

RUN wget https://public.dhe.ibm.com/ibmdl/export/pub/software/openliberty/runtime/release/24.0.0.2/openliberty-webProfile10-24.0.0.2.zip
RUN unzip openliberty-webProfile10-24.0.0.2.zip
RUN rm openliberty-webProfile10-24.0.0.2.zip
RUN /wlp/bin/server create default
RUN /wlp/bin/featureUtility installFeature grpcClient-1.0

COPY --from=builder /src/signingserver/webapp/target/webapp.war /wlp/usr/servers/default/dropins/signing.war
COPY --from=builder /src/signingserver/webapp/server.xml /wlp/usr/servers/default/server.xml
COPY --from=builder /src/signingserver/runsigningserver.sh /usr/bin/runsigningserver.sh
RUN chmod +x /usr/bin/runsigningserver.sh

EXPOSE 9443

WORKDIR /
ENTRYPOINT ["/usr/bin/bash", "-c"]
CMD ["/usr/bin/runsigningserver.sh"]
