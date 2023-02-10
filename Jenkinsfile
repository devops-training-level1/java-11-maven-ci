pipeline {
    agent any
    environment{
        DOCKERHUB_CREDENTIALS = credentials('gildastema-dockerhub')
    }
    stages {
        stage('create_artifact') {
            steps {
                sh './mvnw clean package -DskipTests'
            }
        }
        stage('Create Docker image'){
            steps{
                sh 'docker build -t hello .'
            }
        }
        stage('Docker Login'){
            steps{
                sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin '
            }
        }
        
    }
}