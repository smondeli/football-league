# Base Image
FROM openjdk:8-jdk-alpine

# Copy application jar and config files
COPY ../target/football-league-1.0.jar football-league.jar
COPY ../src/main/resources/appconfig.yaml appconfig.yaml

# Open ports
EXPOSE 8080

# Run application
ENTRYPOINT ["java", "-jar", "football-league.jar", "server"]
CMD ["appconfig.yaml"]