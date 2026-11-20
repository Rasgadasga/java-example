FROM eclipse-temurin:25-jre

COPY target/java-example-1.0.jar app.jar

CMD ["java", "-jar", "app.jar"]