FROM maven:3.3.3-jdk-8
ONBUILD RUN mvn package docker:build
FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD dockerized-spring-app-1.0.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]