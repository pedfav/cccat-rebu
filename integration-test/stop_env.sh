#!/bin/bash

echo stopping containers...
. set_test_env_variables.sh
docker compose -f ../local_env/app/docker-compose.yml down -v
docker compose -f ../local_env/postgres/docker-compose.yml down -v
docker network rm ${LOCAL_NETWORK}
echo local env stopped!