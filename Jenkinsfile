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
                sh "docker build -t gildastema/java-ci-pipeline ."
            }
        }
        stage("Login To DockerHub"){
            steps{
                sh "echo dckr_pat_nDy6TWh4q0T4ltKRHPgtxqIZvE4 | docker login -u gildastema --password-stdin  "
            }
        }


    }

}