FROM openjdk:17
COPY target/DeploymentDemoProject-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "DeploymentDemoProject-0.0.1-SNAPSHOT.jar"]
