FROM openjdk:8

EXPOSE 8080

VOLUME /tmp
RUN mkdir /logs
VOLUME /logs

COPY *.jar /hello.jar

ENTRYPOINT ["java","-DLOG_PATH=/logs","-Djava.security.egd=file:/dev/./urandom","-d64","-server","-jar","hello.jar"]
