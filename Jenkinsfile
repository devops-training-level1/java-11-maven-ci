pipeline{
    agent any
    stages{
        stage("Test My code"){
            steps{
                sh "./mvnw clean test"
            }
        }
        stage("Build artifact"){
            steps{
                sh "./mvnw clean  install -DskipTests"
            }
        }

        stage("Build Image"){
            steps{
                sh "docker ps"
            }
        }


    }

}