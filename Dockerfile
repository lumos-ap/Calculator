#base image : "from" imagename
FROM openjdk:8
#copying the jarfile in docker container/image
# COPY <SRC> <DEST>
COPY ./target/Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
#changing the working directiory
WORKDIR ./
#command to run jar file
CMD ["java", "-jar", "Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]
