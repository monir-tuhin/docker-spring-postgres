**Docker with Spring and Postgres**
=======================================================================

- create db host from render db ([https://render.com/]())
- connect the host db in to spring boot project
- build the jar file of the project
- copy the jar file from target folder and paste in to jar folder (which is custom created. to get the jar file during deployment)
  
**Some docker commands**
- `docker build -t imageName .` : build the docker image
- `docker image ls` : To show all docker images 
- `docker rmi {imageId}` : To remove specific image
- `docker run --name containerName -p 8080:8080 imageName` : run the docker container
- `docker rm {containerId}` : To remove specific container


**Host spring boot app**
______________________________________________________________

- host this app in to free hosting service for 4 hours duration
- host link : [https://labs.play-with-docker.com]()
- Add instance
- Pull the repository from Github
- Go to the repository folder
- Build the docker image
- Then run the container