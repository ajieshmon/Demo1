FROM openjdk:11
COPY target/springboot-example.jar app.jar
EXPOSE 8080
CMD ["java","-jar","app.jar"]
