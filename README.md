# upgrad-walmart-repo

## Fixing a bug with Cherry-Picking

https://medium.com/@ramanujds9/fixing-a-bug-on-production-with-cherry-picking-0e874ab920ff


### Command to fix permission issues for docker

sudo usermod -a -G docker jenkins

## Repository for spring-boot-cicd-docker hands-on :

https://github.com/ramanujds/upgrad-wmart-cicd-jenkins-docker


### Pipeline Steps:

1. Create a GitHub repository.
2. Clone the repository.
3. Create a Spring Boot application and place it within the root directory of the repository.
4. Write code tests and execute them.
5. (Optional) Build and package the application, and then test it.
6. Create a Dockerfile.
7. (Optional) Build the Docker image, run it, and test it.
8. Create a Jenkinsfile.
9. Create the Jenkins pipeline.


**Final Project**

**Step 1:** Develop a new Spring Boot application.
**Step 2:** Create a Git repository and commit the code.
**Step 3:** Construct a Jenkins pipeline with stages for code retrieval, testing, building, and pushing the image to DockerHub.
**Step 4:** Update the code by creating a new feature branch.
**Step 5:** Push and merge the code by creating a pull request.
**Step 6:** Verify that Jenkins is retrieving the most recent commit from GitHub.


