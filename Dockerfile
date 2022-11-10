#cmd : docker build -t onboarding-task-service .
FROM eclipse-temurin:8-jdk-alpine
EXPOSE 9094
VOLUME /tmp
COPY  target/*.jar onboarding-task-service.jar
ENTRYPOINT ["java","-jar","/onboarding-task-service.jar"]