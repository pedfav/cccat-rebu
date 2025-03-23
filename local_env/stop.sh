#!/bin/bash

echo stopping containers...
. set_env_variables.sh
docker compose -f postgres/docker-compose.yml down -v
docker network rm ${LOCAL_NETWORK}
echo local env stopped!