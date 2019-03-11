FROM openjdk:8-alpine

COPY target/uberjar/test-error.jar /test-error/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/test-error/app.jar"]
