FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/KafkaDemo-0.0.1-SNAPSHOT.jar
EXPOSE 8085
WORKDIR /opt/app
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]