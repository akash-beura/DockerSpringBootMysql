From openjdk:8
MAINTAINER Akash Beura <akash.beura@mindtree.com>
copy /target/person.jar person.jar
CMD ["java","-jar","person.jar"]