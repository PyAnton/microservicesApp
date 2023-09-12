FROM openjdk:17
COPY target/test-service-0.0.1-SNAPSHOT.war test-service.war
ENTRYPOINT ["java","-jar","/test-service.war"]