#!/bin/bash

echo starting env tests...
. set_test_env_variables.sh

echo build app...
mvn clean install -DskipTests -f ../pom.xml

echo starting containers...
docker network create --driver=bridge ${LOCAL_NETWORK}
docker compose -f ../local_env/postgres/docker-compose.yml up -d --remove-orphans
docker compose -f ../local_env/app/docker-compose.yml up -d --remove-orphans
echo tests env started up!