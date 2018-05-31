# Kafka Request-Reply POC

### How to Run (Windows):

1. (From Kafka directory) Start ZooKeeper: `bin\windows\zookeeper-server-start.bat config\zookeeper.properties`
2. Start Kafka: `bin\windows\kafka-server-start.bat config\server.properties`
3. Create request topic: `bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic request-topic`
4. Create request-reply topic: `bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic requestreply-topic`
5. (From code directory) Start app: `mvn spring-boot:run`
6. Using curl or another client (in this case we are using httpie) send JSON with 1 field, your name: `http POST localhost:8080/greeting name=bob`

### Downloads:
1. Download httpie (curl-like client): `sudo apt-get install httpie`
2. Download maven: `sudo apt-get install maven`

### Sample Request-Response:

Request: `http POST localhost:8080/greeting name=bob`

Response:
 ```
HTTP/1.1 200
Content-Type: application/json;charset=UTF-8
Date: Tue, 29 May 2018 16:17:02 GMT
Transfer-Encoding: chunked

{
    "greeting": "Ciao, bob",
    "name": "bob"
}
```
