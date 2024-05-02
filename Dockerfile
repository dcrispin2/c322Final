FROM eclipse-temurin:17
WORKDIR /home
COPY ./target/C322finalproject-1.0-SNAPSHOT.jar c322finalproject
ENTRYPOINT ["java", "-jar", "c322finalproject.jar"]