FROM docker.io/library/openjdk:11-slim-buster AS base
WORKDIR /app

FROM docker.io/library/maven:3.8.4-openjdk-11 AS build
WORKDIR /build

COPY pom.xml ./
RUN mvn dependency:go-offline

FROM build AS publish
COPY src ./src
RUN mvn -f pom.xml clean package -DskipTests

FROM base AS final
WORKDIR /app
COPY --from=publish /build/target/*.jar ./app.jar

ENTRYPOINT ["java", "-jar", "/app/app.jar"] 