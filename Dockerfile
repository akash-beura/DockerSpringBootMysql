FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:8-jdk-alpine
MAINTAINER Akash Beura <akash.beura@mindtree.com>
EXPOSE 8080
ADD --from=build /home/app/target/DSBP.war DSBP.war
ENTRYPOINT ["java", "-jar", "DSBP.war"]
