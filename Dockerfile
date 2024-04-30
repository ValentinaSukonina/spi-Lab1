FROM eclipse-temurin:22-jre-alpine
WORKDIR /app
COPY ./service/target/service-1.0-SNAPSHOT.jar /app/
COPY ./provider/target/provider-1.0-SNAPSHOT.jar /app/
COPY ./consumer/target/consumer-1.0-SNAPSHOT.jar /app/
ENTRYPOINT ["java", "--module-path", "/app", "--module"]
CMD ["org.example.consumer/org.example.consumer.Main"]