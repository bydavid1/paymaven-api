# Stage 1: Build the application
FROM maven:3.8.3-openjdk-17-slim AS builder

WORKDIR /app

# Copy the project files to the container
COPY . .

# Build the project with Maven
RUN mvn clean install -DskipTests

# Stage 2: Create the final image
FROM openjdk:17-jdk-alpine

WORKDIR /app

# Copy the JAR file from the builder stage
COPY --from=builder /app/target/paymaven-0.0.1-SNAPSHOT.jar myapp.jar

# Run the application
CMD ["java", "-jar", "myapp.jar"]
