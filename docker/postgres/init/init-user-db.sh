#!/bin/bash

create_db_user_pass() {
    psql -Upostgres -dpostgres -c "CREATE USER $2 WITH PASSWORD '$3'"
    psql -Upostgres -dpostgres -c "CREATE DATABASE $1 OWNER=$2"
}

create_db_user_pass cinema_db  cinema_user  cinema_pass
create_db_user_pass keycloak_db  keycloak_user  keycloak_pass