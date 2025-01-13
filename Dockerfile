FROM openjdk:17-jdk-slim
WORKDIR /app

# Copy the Spring Boot application jar file to the container
COPY target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
