FROM maven as build
WORKDIR /builds/app
COPY ./ /builds
CMD mvn package

FROM openjdk:17
WORKDIR /app
COPY . .
CMD ["java", "-jar", "/app/TestTask-0.0.1-SNAPSHOT.jar"]