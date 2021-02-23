FROM openjdk:14-jdk-alpine

RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} application.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "/application.jar"]