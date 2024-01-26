# application-server





# Docker - File

FROM openjdk

WORKDIR /app

COPY target/demo-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

CMD ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]

##use this command to pull and run container image: docker run -d --memory=1500m --cpus=2 -p 8080:8080 anmolcse5/applicationserver:v1
