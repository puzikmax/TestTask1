FROM openjdk

WORKDIR /app

COPY ./ /app/

CMD ["java", "-jar", "/app/TestTask-0.0.1-SNAPSHOT.jar"]