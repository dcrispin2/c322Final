FROM eclipse-temurin:17
WORKDIR /home
COPY ./target/c322Final-1.0-SNAPSHOT.jar c322Final
ENTRYPOINT ["java", "-jar", "c322Final.jar"]