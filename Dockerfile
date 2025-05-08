FROM eclipse-temurin:24-jre-alpine
ARG JAR_FILE=target/dunedle-server-*.jar
COPY ${JAR_FILE} dunedle-server-app.jar
ENTRYPOINT ["java", "-jar", "/dunedle-server-app.jar"]