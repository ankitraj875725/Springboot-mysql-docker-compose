# Springboot-mysql-docker-compose

========================
Docker Compose Setup
========================

# Download docker compose
$ sudo curl -L "https://github.com/docker/compose/releases/download/1.24.0/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose

# Give permissions
$ sudo chmod +x /usr/local/bin/docker-compose
	
# How to check docker compose is installed or not
$ docker-compose --version

Execute Spring Boot App with MySQL DB using Docker Compose
===============================================================

# clone git repo
git clone https://github.com/ankitraj875725/Springboot-mysql-docker-compose.git

# package our application
mvn clean package

# Create Docker Image for Spring Boot Application
sudo docker build -t spring-boot-mysql-app .

# Create Containers using Docker Compose in detached mode
sudo docker-compose up -d

**To delete container**
$ docker-compose down

**To stop container**
$ docker-compose stop

**To start container**
$ docker-compose start

**To known more about container**
$ docker-compose ps

# Tag Docker Image
$ sudo docker tag <image-name> <tag-name>

Ex : $ sudo docker tag spring-boot-mysql-app ankitraj87/docker-compose

# Login into Docker Hub Account
$ sudo docker login

# Push Docker Image to Docker Hub
$ sudo docker push ankitraj87/docker-compose

