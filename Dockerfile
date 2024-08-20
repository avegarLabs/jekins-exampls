FROM openjdk:17-jdk-alpine
COPY target/jekins-exampls.jar jekins-exampls.jar
ENTRYPOINT ["java", "-jar", "jekins-exampls.jar"]