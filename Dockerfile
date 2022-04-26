FROM openjdk:17
COPY ./target/food-bear-0.0.1-SNAPSHOT.jar /usr/src/foodbear/
WORKDIR /usr/src/foodbear/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "food-bear-0.0.1-SNAPSHOT.jar"]
