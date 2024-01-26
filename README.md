# Application Server

This repository contains the Dockerized implementation of an application server. The Docker image can be accessed on Docker Hub at [anmolcse5/applicationserver](https://hub.docker.com/r/anmolcse5/applicationserver).

## Dockerfile

```Dockerfile
FROM openjdk

WORKDIR /app

COPY target/demo-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

CMD ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
```
## Usage

To run the application server using Docker, execute the following command in your terminal:

```bash
docker run -d --memory=1500m --cpus=2 -p 8080:8080 anmolcse5/applicationserver:v1
```
## Screenshots of different scenarios
Scenario when n = 1 exists, displaying all content of the file.
![1](https://github.com/anmolwadhwaxx/application-server/assets/94642300/d775685a-95e1-4e1d-903d-526da5c0f3d9)
Scenario when n = 30 exists, displaying all contents of the file.
![30](https://github.com/anmolwadhwaxx/application-server/assets/94642300/0a5dca14-8f39-4935-89dc-00a6861d737f)
Scenario when both n = 30 and m = 1 exist, displaying the content of line 1.
![30-1](https://github.com/anmolwadhwaxx/application-server/assets/94642300/21c601f8-73a3-465d-935f-b4f06cdcee42)
Scenario when both n = 30 and m = 2 exist, displaying the content of line 2.
![30-2](https://github.com/anmolwadhwaxx/application-server/assets/94642300/00869657-86b6-4ca0-98e5-0ea889decca6)
Scenario when n = 30 exists, but m = 3 doesn't exist, displaying a message indicating the line number is not valid.
![30-3](https://github.com/anmolwadhwaxx/application-server/assets/94642300/70950233-e501-4d1d-a3e8-c211b8a1abd6)
Scenario when n = 10 doesn't exist, displaying a message - not found.
![10](https://github.com/anmolwadhwaxx/application-server/assets/94642300/49ea8cf4-157d-4587-88d0-514c881a0020)




