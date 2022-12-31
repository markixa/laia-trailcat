FROM openjdk:11
ADD target/demo-trailcat.jar demo-trailcat.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "demo-trailcat.jar"]