
FROM openjdk:8
COPY ./target/DevopsCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "DevopsCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]
