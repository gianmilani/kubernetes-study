FROM gradle:8.8.0-jdk21-alpine AS build

ENV APP_HOME=/app

WORKDIR $APP_HOME

COPY settings.gradle.kts .
COPY build.gradle.kts .
COPY src/ $APP_HOME/src/

RUN gradle clean build --no-daemon

##
FROM eclipse-temurin:21-jre-alpine

ENV APP_HOME=/app

WORKDIR $APP_HOME

COPY --from=build $APP_HOME/build/libs/demo-kube-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8082

CMD ["java", "-jar", "app.jar"]
