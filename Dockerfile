FROM amazoncorretto:21
EXPOSE 8080
ADD ./target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
