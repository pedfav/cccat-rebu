echo setting up variables...

export POSTGRES_PORT=5432
export APP_PORT=8081
export LOCAL_NETWORK=local-env-network

export POSTGRES_URL=jdbc:postgresql://postgres-db:$POSTGRES_PORT