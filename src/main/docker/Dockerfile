FROM 219.232.47.3:18082/java-8-alpine
VOLUME /tmp
ADD microservice-movice-1.0.0.jar app.jar
#RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
