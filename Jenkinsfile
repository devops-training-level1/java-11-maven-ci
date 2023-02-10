pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'docker --version'
                sh './mvnw clean package -DskipTests'
            }
        }
    }
}