FROM openjdk:8

RUN apt-get update && apt-get install -y apt-utils iputils-ping curl less

EXPOSE 8000

VOLUME /tmp
RUN mkdir /logs
VOLUME /logs

COPY *.jar /what-service.jar

ENTRYPOINT ["java","-DLOG_PATH=/logs","-Djava.security.egd=file:/dev/./urandom","-d64","-server","-jar","what-service.jar"]
