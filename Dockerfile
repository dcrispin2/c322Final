FROM eclipse-temurin:17
WORKDIR /home
COPY ./target/c322-finalbackend-1.0-SNAPSHOT.jar c322-finalfackend.jar
ENTRYPOINT ["java", "-jar", "c322-finalbackend.jar"]