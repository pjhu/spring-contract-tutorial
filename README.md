# setup
- setup nexus
    ```
    docker-compose up -d
    ```
- login
    ```
    localhost:8081
    ```
# setup contract
- setup producer
    ```
    cd producer
    ./gradlew clean generateClientStubs
    ./gradlew publishStubsPublicationToMavenRepository
    ```
    
- setup consumer
    ```
    cd consumer
    ./gradlew bootRun
    ```
- request
    ```
    curl localhost:8082/api/v1/home
    ```
# run fat jar
    ```
    cd consumer
    ./gradlew bootJar
    java -jar build/libs/consumer-0.0.1-SNAPSHOT.jar
    ```

# publishing consumer to nexus
    ```
    cd consumer
    ./gradlew publishMavenPublicationToMavenRepository
    wget http://localhost:8001/.../consumer-0.0.1-SNAPSHOT.jar
    java -jar consumer-0.0.1-SNAPSHOT.jar
    ```

# config intellij
![](config1.jpeg)
![](config2.jpeg)