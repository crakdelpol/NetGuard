# Net guard

Simple project to hande authorization

Default port 8080

/home is permit by all 

other pages are under authorization

mvn clean package to build jar

### Build image

docker build --tag=auth-server:latest .

### Run docker compose

sudo docker-compose -f docker-compose.yml up


