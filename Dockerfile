
FROM openjdk:22-jdk

WORKDIR /app

COPY target/jenkins-instance-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app/app.jar"]