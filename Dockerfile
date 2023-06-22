FROM amazoncorretto:17
EXPOSE 8080
ADD target/IAS-0.0.1-SNAPSHOT.jar inventory_information_application.jar
ENTRYPOINT ["java","-jar","/inventory_information_application.jar"]
