# Use an official OpenJDK 17 runtime as the base image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot application jar file to the container
COPY target/*.jar app.jar

# Expose the port the app runs on (Render automatically maps ports)
EXPOSE 8080

# Default command to run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
