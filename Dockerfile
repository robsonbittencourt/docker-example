FROM openjdk:17-alpine

RUN apk update && \
    apk upgrade && \
    apk add curl

WORKDIR /app
COPY ./build/libs .

ENTRYPOINT ["sh", "-c", "java -jar docker-sample-1.0.0.jar"]