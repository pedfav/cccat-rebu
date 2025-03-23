#!/bin/bash

echo starting containers...
. set_env_variables.sh
docker network create --driver=bridge ${LOCAL_NETWORK}
docker compose -f postgres/docker-compose.yml up -d --remove-orphans
echo local env started up!