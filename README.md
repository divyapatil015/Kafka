# Kafka Practice Project with Spring Boot

This is a **practice project** that demonstrates the integration of **Apache Kafka** with a **Spring Boot** application. The project includes a basic Kafka **Producer** and **Consumer** setup, intended for learning and hands-on experimentation with message-based communication using Kafka.

## 🔧 Technologies Used

- Java
- Spring Boot
- Spring Kafka
- Apache Kafka
- Maven
- Postman (for testing)
- Swagger (API documentation)
- Spring Tool Suite (STS) / Eclipse
- MySQL (optional, if used for additional data persistence)

## 📌 Features

- Produce messages to a Kafka topic via REST API
- Consume messages from the Kafka topic
- Log or print received messages to the console
- Configurable topic name, bootstrap server, and other Kafka properties via `application.properties`

## 🚀 Getting Started

### Prerequisites

- Java 11+
- Apache Kafka and Zookeeper installed locally (or use Docker Desktop)
- Maven installed
- Set JAVA_HOME and add Maven/Kafka bin folders to your system PATH

### Running Kafka (on Windows)

If you have downloaded Kafka:

```cmd
:: Start Zookeeper
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

:: Open a new terminal and start Kafka
.\bin\windows\kafka-server-start.bat .\config\server.properties
src/
├── controller/
│   └── KafkaController.java
├── service/
│   ├── KafkaProducerService.java
│   └── KafkaConsumerService.java
└── config/
    └── KafkaConfig.java
