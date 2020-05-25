FROM openjdk:8-jdk-alpine
MAINTAINER Akash Beura <akash.beura@mindtree.com>
EXPOSE 8080
ADD target/DSBP.war DSBP.war
ENTRYPOINT ["java", "-jar", "DSBP.war"]
