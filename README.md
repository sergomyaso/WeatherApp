<h1 align="center"> Weather average </h1> <br>

<p align="center">
  Get average from weather in academic town by date on any number of days
</p>

## Table of Contents

- [Introduction](#introduction)
- [Requirements](#requirements)
- [Quick Start](#quick-start)
- [Working](#working)


## Introduction

This simple web application on java for chatting is made using the spring framework

## Requirements

The application can be run locally or in a docker container, the requirements for each setup are listed below.

## Quick Start

### Local

* [Java 11 SDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
* [Gradle 7.1.1 and later](https://docs.gradle.org/7.1.1/release-notes.html)
* [Docker](https://www.docker.com/get-docker) (for creating databases)

### Docker Compose

* [Docker](https://www.docker.com/get-docker)

### Run Local

Run db in docker

```bash
$ ./tools/create_empty_postgres.sh
```

Run application

```bash
$ gradle bootRun
```

Application will run by default on port `8080`

Configure the port by changing `server.port` in __application.properties__

### Run in Docker Compose

```bash
$ ./tools/run_service.sh
```

Application will run by default on port `8080`
Configure the port by changing `ports` in __docker-compose.yaml__

## Working

### Endpoints
__/weather/average__

### Request example
To endpoint __/weather/average__

```json
{
    "date":"11.06.2021",
    "countDays":3
}
```
### Response example
```json
{
  "id": "dbbf3555-db96-49db-ae1d-8f3d20957480",
  "dateFrom": "2021-06-11",
  "dateTo": "2021-06-14",
  "average": 13.844254104211277
}

```



