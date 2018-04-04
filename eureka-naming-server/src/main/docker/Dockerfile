FROM openjdk:8

EXPOSE 8761

VOLUME /tmp
RUN mkdir /logs
VOLUME /logs

COPY *.jar /eureka-naming-server.jar

ENTRYPOINT ["java","-DLOG_PATH=/logs","-Djava.security.egd=file:/dev/./urandom","-d64","-server","-jar","eureka-naming-server.jar"]
