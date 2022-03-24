FROM openjdk:17-alpine

WORKDIR /app
COPY ./build/libs .

ENTRYPOINT ["sh", "-c", "java -jar docker-sample-1.0.0.jar"]