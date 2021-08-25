FROM openjdk:11-jre-slim
ENV JAVA_TOOL_OPTIONS -agentlib:jdwp=transport=dt_socket,address=*:8000,server=y,suspend=n
COPY target/docker.demo-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 9000
EXPOSE 8000
ENTRYPOINT ["java", "-jar","/demo.jar","${JAVA_TOOL_OPTIONS}"]
