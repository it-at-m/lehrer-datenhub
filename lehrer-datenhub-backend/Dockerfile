# For documentation see https://jboss-container-images.github.io/openjdk/
FROM registry.access.redhat.com/ubi9/openjdk-21-runtime:1.24-3.1785873419@sha256:718b05ae32e0b679d0200cd9d4144cbf12270ef980c0924d927fc05d931c1ebb

# Copy runnable jar to deployments
COPY target/*.jar /deployments/application.jar