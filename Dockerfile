FROM ubuntu:latest AS build

RUN apt-get update
RUN apt-get install -y openjdk-17-jdk
COPY . .

RUN apt-get install maven -y
RUN mvn clean install -DskipTests

FROM openjdk:17-jdk-slim
EXPOSE 8080

COPY --from=build /target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]