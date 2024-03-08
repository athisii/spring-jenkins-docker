FROM amazoncorretto:21.0.2-alpine3.19
EXPOSE 8081
COPY build/libs/spring-jenkins-docker-0.1.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]