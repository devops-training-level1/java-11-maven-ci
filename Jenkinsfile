pipeline{
    agent any
    environment{
        DOCKERHUB = credentials('dockerhub')
    }
    stages{
        stage("Test My code"){
            steps{
                sh "./mvnw clean test"
            }
        }
        stage("Build artifact"){
            steps{
                sh "./mvnw clean  install"
            }
        }

        stage("Build Image"){
            steps{
                sh "docker build -t gildastema/java-ci-pipeline ."
            }
        }
        stage("Login To DockerHub"){
            steps{
                sh 'echo $DOCKERHUB_PSW | docker login -u $DOCKERHUB_USR --password-stdin '
            }
        }

        stage("Push Image"){
            steps{
                sh "docker push gildastema/java-ci-pipeline"
            }
        }


    }

}