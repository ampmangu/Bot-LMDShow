FROM gradle:7.4.0-jdk-alpine AS TEMP_BUILD_IMAGE
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build -x test || return 0

FROM openjdk:11-jre-slim-buster
MAINTAINER Mangu
ENV ARTIFACT_NAME=bot-lmdshow-0.0.1-SNAPSHOT.jar
ENV APP_HOME=/app
WORKDIR $APP_HOME
COPY --from=TEMP_BUILD_IMAGE /home/gradle/src/build/libs/bot-lmdshow-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
ENTRYPOINT exec java -jar ${ARTIFACT_NAME}