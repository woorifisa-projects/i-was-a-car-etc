FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
CMD ["./gradlew", "clean", "build"]
COPY build/libs/*.jar /app/app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
