# kafka_microservices

## Prerequisites
- [Docker](https://www.docker.com/)
- [Java 21](https://adoptium.net/)

## How to run
- Start kafka docker instance using `docker compose up command`
- Start kafka-publisher project using `.\gradlew bootRun` command inside kafka-publisher root folder
- Start kafka-listener project using `.\gradlew bootRun` command inside kafka-listener root folder

## How to publish messages
- Do a POST request to following http://localhost:8080/publish endpoint.
- Message body:
`{
  "message": "Hello World!"
}`