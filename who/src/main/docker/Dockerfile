FROM openjdk:8

EXPOSE 9000

VOLUME /tmp
RUN mkdir /logs
VOLUME /logs

COPY *.jar /who-service.jar

ENTRYPOINT ["java","-DLOG_PATH=/logs","-Djava.security.egd=file:/dev/./urandom","-d64","-server","-jar","who-service.jar"]
