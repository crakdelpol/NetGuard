FROM openjdk:17-jdk-slim-buster
COPY target/NetGuard-0.0.1-SNAPSHOT.jar NetGuard-0.0.1-SNAPSHOT.jar
ENTRYPOINT java -jar NetGuard-0.0.1-SNAPSHOT.jar