#!/bin/sh
mvn clean package && docker build -t com.mycompany/Aula4Pratica1 .
docker rm -f Aula4Pratica1 || true && docker run -d -p 9080:9080 -p 9443:9443 --name Aula4Pratica1 com.mycompany/Aula4Pratica1