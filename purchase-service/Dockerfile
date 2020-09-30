# Build a JAR File
FROM maven:3.6.3-jdk-8-slim AS stage-jar-creation
WORKDIR /home/app
COPY . /home/app/
RUN mvn -f /home/app/pom.xml clean package

# Create an Image
FROM openjdk:8-jdk-alpine
EXPOSE 5000
COPY --from=stage-jar-creation   /home/app/target/java-azure-0.0.1-SNAPSHOT.jar    java-azure-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["sh", "-c", "java -jar /java-azure-0.0.1-SNAPSHOT.jar"]