FROM openjdk:8-jdk-alpine
MAINTAINER Akash Beura <akash.beura@mindtree.com>
COPY target/*.war app.war
ENTRYPOINT ["java", "-jar", "app.war"]
