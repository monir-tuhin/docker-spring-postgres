FROM khipu/openjdk17-alpine
WORKDIR /app
COPY jar/docker-spring--postgres-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]