**Docker with Spring and Postgres**
=======================================================================

- create db host from render db ([https://render.com/]())
- connect the host db in to spring boot project
- create docker file
- `docker build -t imageName .` : build the docker image
- `docker image ls` : To show all docker images 
- `docker rmi {imageId}` : To remove specific image
- `docker run --name containerName -p 8080:8080 imageName` : run the docker container
- `docker rm {containerId}` : To remove specific container
