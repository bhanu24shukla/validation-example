FROM openjdk:17-jre-slim
EXPOSE 8080
ADD target/springboot-validation-example-image.jar springboot-validation-example-image.jar
ENTRYPOINT ["java", "-jar", "/springboot-validation-example-image.jar"]