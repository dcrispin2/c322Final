FROM eclipse-temurin:17
WORKDIR /home
COPY ./target/c322final-1.0-SNAPSHOT.jar c322final
ENTRYPOINT ["java", "-jar", "c322final.jar"]