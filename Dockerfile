FROM openjdk:8
ADD target/demo.jar demo.jar
EXPOSE 9000
ENTRYPOINT ["java","-jar", "demo.jar"]