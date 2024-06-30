FROM ubuntu:latest AS build

RUN apt get update
RUN apt get install -y openjdk-17-jdk -y
COPY src/main/java/com/igormontezumadev/topcars .

RUN apt-get install maven -y
RUN mvn clean install

FROM openjdk:17-jdk-slim
EXPOSE 8080

COPY --from=build /target/top-cars-0.0.1.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]