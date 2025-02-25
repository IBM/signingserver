FROM ubuntu:24.04 as builder
RUN apt-get update && apt-get upgrade -y && apt-get install -y unzip curl default-jdk maven protobuf-compiler
WORKDIR /src/signingserver
COPY . .
RUN mvn clean package

FROM ubuntu:24.04
RUN apt-get update && apt-get upgrade -y && apt-get install -y default-jre wget unzip curl

COPY --from=builder /src/signingserver/runserver.sh /usr/bin/runserver.sh
RUN chown 1001:0 /usr/bin/runserver.sh && chmod 500 /usr/bin/runserver.sh 
RUN mkdir /wlp  && chown 1001:0 /wlp
RUN mkdir /data && chown 1001:0 /data
USER 1001:0
WORKDIR /wlp

RUN wget https://public.dhe.ibm.com/ibmdl/export/pub/software/openliberty/runtime/release/24.0.0.12/openliberty-webProfile10-24.0.0.12.zip
RUN unzip openliberty-webProfile10-24.0.0.12.zip -d /
RUN rm openliberty-webProfile10-24.0.0.12.zip
RUN /wlp/bin/server create default
RUN /wlp/bin/featureUtility installFeature jaxrs-2.1

COPY --from=builder /src/signingserver/webapp/target/webapp.war /wlp/usr/servers/default/dropins/signing.war
COPY --from=builder /src/signingserver/webapp/server.xml /wlp/usr/servers/default/server.xml

EXPOSE 9080 9443

WORKDIR /
ENTRYPOINT ["/usr/bin/bash", "-c"]
CMD ["/usr/bin/runserver.sh"]
