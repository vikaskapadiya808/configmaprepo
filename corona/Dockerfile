FROM ubuntu:22.04

RUN apt update -y
RUN apt install -y openjdk-17-jdk

RUN mkdir -p /u01/middleware/

WORKDIR /u01/middleware/

COPY target/corona-1.0.0-SNAPSHOT.jar .
COPY startup.sh .

RUN chmod u+x startup.sh

CMD ["./startup.sh"]
