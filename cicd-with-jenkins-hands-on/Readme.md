1. What is Jenkins?

Jenkins is an open-source automation server that enables developers to build, test, and deploy software efficiently. It is widely used for implementing Continuous Integration (CI) and Continuous Delivery/Deployment (CD) pipelines, allowing for faster delivery of software while maintaining high quality.

### Key Features:

* **Extensibility:** Supports numerous plugins to integrate with various tools and technologies.
* **Distributed Builds:** Can distribute build/test loads across multiple machines.
* **Flexibility:** Supports both GUI-based and code-based pipeline creation.
* **Open-Source:** Free to use and supported by a vast community.

---

## 2. Setting Up Jenkins

### Prerequisites:

* A system with Java installed (Jenkins requires Java 8 or newer).
* Administrative access to install software.

### Steps:

1. **Download Jenkins:**
   * Go to the [Jenkins official site](https://www.jenkins.io/) and download the LTS (Long-Term Support) version suitable for your OS.
2. **Install Jenkins:**
   * On Linux (using apt):
     ```bash
     sudo apt update
     sudo apt install jenkins
     ```
   * On Windows:
     * Run the installer and follow the wizard steps.
3. **Start Jenkins:**
   * On Linux:
     ```bash
     sudo systemctl start jenkins
     ```
   * On Windows:
     * Jenkins starts automatically after installation.
4. **Access Jenkins:**
   * Open a browser and navigate to `http://localhost:8080`.
5. **Unlock Jenkins:**
   * Retrieve the initial admin password from the file displayed on the setup page (e.g., `/var/lib/jenkins/secrets/initialAdminPassword`).
6. **Install Recommended Plugins:**
   * Select "Install suggested plugins" on the setup page.
7. **Create Admin User:**
   * Set up a username and password for the admin account.

---

## 3. Understanding Jenkins Pipeline Concepts

Jenkins Pipelines define the automated steps for building, testing, and deploying applications.

### Types of Pipelines:

1. **Declarative Pipeline:**
   * More structured and easier to read.
   * Example:
     ```groovy
     pipeline {
         agent any
         stages {
             stage('Build') {
                 steps {
                     echo 'Building...'
                 }
             }
             stage('Test') {
                 steps {
                     echo 'Testing...'
                 }
             }
             stage('Deploy') {
                 steps {
                     echo 'Deploying...'
                 }
             }
         }
     }
     ```
2. **Scripted Pipeline:**
   * Written in Groovy and allows more flexibility.
   * Example:
     ```groovy
     node {
         stage('Build') {
             echo 'Building...'
         }
         stage('Test') {
             echo 'Testing...'
         }
         stage('Deploy') {
             echo 'Deploying...'
         }
     }
     ```

---

## 4. Freestyle Jobs vs Declarative Pipelines

### Freestyle Jobs:

* Basic Jenkins jobs created using the GUI.
* Suitable for simple tasks like running a script or executing a single command.
* Less flexible and harder to maintain compared to pipelines.

### Declarative Pipelines:

* Defined in a `Jenkinsfile` (stored in source control).
* Enables versioning and sharing of pipeline definitions.
* Preferred for complex CI/CD workflows.

---

## 5. Automating Builds with Maven in Jenkins

Maven is a popular build automation tool for Java projects. Jenkins integrates seamlessly with Maven to automate builds.

### Steps to Automate Builds:

1. **Install Maven Plugin in Jenkins:**
   * Go to "Manage Jenkins" > "Manage Plugins" > "Available" > Search for "Maven Integration" and install it.
2. **Configure Maven in Jenkins:**
   * Go to "Manage Jenkins" > "Global Tool Configuration" > "Maven" section.
   * Provide the name and path to the Maven installation.
3. **Create a Maven Job:**
   * Go to "New Item" and select "Freestyle Project."
   * In the "Build" section, choose "Invoke top-level Maven targets."
   * Specify the goal (e.g., `clean install`).
4. **Trigger Builds Automatically:**
   * Set up triggers (e.g., SCM Polling or Webhooks).

---

## 6. Integrating Jenkins with Git

Integrating Git with Jenkins allows automatic builds and testing when changes are pushed to a repository.

### Steps:

1. **Install Git Plugin:**
   * Go to "Manage Jenkins" > "Manage Plugins" > "Available" > Search for "Git Plugin" and install it.
2. **Add Git Credentials:**
   * Go to "Manage Jenkins" > "Credentials" > "System" > "Global credentials" > "Add credentials."
   * Provide the SSH key or username/password.
3. **Configure a Git Repository in a Job:**
   * In the job configuration, go to the "Source Code Management" section and select "Git."
   * Provide the repository URL and branch name.
4. **Enable Webhooks in Git:**
   * In your Git repository settings, set up a webhook to notify Jenkins about changes.
   * Provide the Jenkins webhook URL (e.g., `http://<jenkins-url>/github-webhook/`).
5. **Trigger Build on Git Changes:**
   * In the job configuration, enable the "Build when a change is pushed to GitHub" option.
