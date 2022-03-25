# Docker Sample

> A simple app to demonstrate the Docker workflow

Required dependencies:
- Java 17
- Docker

## Build jar

```
 ./gradlew clean build
```

## Build Docker image

```
 docker build -t docker-example .
```

## Run containers

```
docker run -d --name pet-shop-1 -p 8081:8080 -e APP_NAME="pet-shop-1" docker-example
docker run -d --name pet-shop-2 -p 8082:8080 -e APP_NAME="pet-shop-2" docker-example
```