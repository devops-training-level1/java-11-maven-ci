pipeline {
    agent any
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
    }
}