FROM eclipse-temurin:17
WORKDIR /home
COPY ./target/C322-FinalBackend-1.0-SNAPSHOT.jar C322-FinalBackend.jar
ENTRYPOINT ["java", "-jar", "C322-FinalBackend.jar"]