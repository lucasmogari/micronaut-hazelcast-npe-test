FROM openjdk:14-alpine
COPY target/hazelcast-test-*.jar hazelcast-test.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "hazelcast-test.jar"]
