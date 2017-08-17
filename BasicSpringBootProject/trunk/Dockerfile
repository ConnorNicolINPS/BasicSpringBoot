# Base image 
FROM anapsix/alpine-java

# Copy the jar file into the container
COPY BasicSpringBootProject-1.0.0.1-SNAPSHOT.jar /home/BasicSpringBootProject-1.0.0.1-SNAPSHOT.jar

# port to expose
EXPOSE 8080

# the command to run (run the jar using java)
CMD ["java", "-jar", "/home/BasicSpringBootProject-1.0.0.1-SNAPSHOT.jar"]

