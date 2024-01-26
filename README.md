# Application Server

This repository contains the Dockerized implementation of an application server. The Docker image can be accessed on Docker Hub at [anmolcse5/applicationserver](https://hub.docker.com/r/anmolcse5/applicationserver).

## Dockerfile

```Dockerfile
FROM openjdk

WORKDIR /app

COPY target/demo-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

CMD ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]

## Usage

To run the application server using Docker, execute the following command in your terminal:

```bash
docker run -d --memory=1500m --cpus=2 -p 8080:8080 anmolcse5/applicationserver:v1

