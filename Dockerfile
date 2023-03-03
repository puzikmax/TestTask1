FROM maven as builder
WORKDIR /builds/app
COPY ./ /builds
CMD mvn package

FROM openjdk:17
WORKDIR /app
COPY --from=builder /builds/target/TestTask-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-jar", "/app/TestTask-0.0.1-SNAPSHOT.jar"]