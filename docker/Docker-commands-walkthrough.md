# Docker Notes and Commands

## Pull an image (e.g., MySQL)

To pull a Docker image from the Docker Hub repository, use the `docker pull` command. This command downloads the specified image to your local machine.

```bash
docker pull mysql
docker pull ram1uj/easy-recipes

```

### Run the image

To run a Docker container from an image, use the `docker run` command. This command creates a new container from the specified image and starts it.

```bash
# Run a MySQL container
docker run -p 3309:3306 -e MYSQL_ROOT_PASSWORD=password --name mysql-container -d mysql

# Run the easy-recipes container
docker run -p 3000:80 --name easy-recipes-container -d ram1uj/easy-recipes
```


## How to build a Docker Image for Spring Boot Application

To build a Docker image for a Spring Boot application, you need to create a `Dockerfile` that contains the instructions for assembling the image.

```dockerfile
FROM openjdk:21-jdk-slim
WORKDIR /
ADD target/spring-boot-app.jar app.jar
CMD ["java", "-jar", "app.jar"]

```

## How to build the image

To build the Docker image using the `Dockerfile`, use the `docker build` command. This command reads the `Dockerfile` and creates the image.

```bash
docker build -t spring-boot-app .
```

## Run the Image

To run the Docker image you built, use the `docker run` command. This command creates and starts a new container from the image.

```bash
docker run -p 5000:8080 --name spring-boot-app-container -d spring-boot-app
```

### Access the Application on Port 8080
The Spring Boot application should now be accessible on `localhost:8080`.

### 8. Check Logs
To view the logs for troubleshooting or monitoring, use the following command:

```sh
docker logs [container-name]
```

### 9. Stop and Remove Containers

To stop a running container, use the `docker stop` command followed by the container name or ID.

```sh
docker stop [container-name]
```

To remove a container, use the `docker rm` command followed by the container name or ID.

```sh
docker rm [container-name]
```

### 10. Remove Images

To remove an image from your local machine, use the `docker rmi` command followed by the image name or ID.

```sh
docker rmi [image-name]
```

### 11. List Containers

To list all the containers on your local machine, use the `docker ps` command.

```sh
docker ps
```

To list all containers, including stopped ones, use the `-a` flag.

```sh
docker ps -a
```

### 12. List Images

To list all the images on your local machine, use the `docker images` command.

```sh
docker images
```
