FROM openjdk:17-jre-slim
WORKDIR /app
COPY target/springboot-validation-example-image.jar /app
CMD ["java", "-jar", "springboot-validation-example-image.jar"]