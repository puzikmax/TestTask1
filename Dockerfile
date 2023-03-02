FROM openjdk

WORKDIR /app

COPY . .

CMD ["java", "-jar", "/app/TestTask-0.0.1-SNAPSHOT.jar"]