pipeline{
    agent any
    tools{
        gradle 'gradle_8_7'
    }
    stages{
        stage("Build Gradle Project"){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/athisii/spring-jenkins-docker']])
                sh 'gradle clean bootJar'
            }
        }
        stage("Build Docker Image"){
            steps{
                script{
                    sh 'docker build -t athisii/spring-jenkins-docker .'
                }
            }
        }
        stage("Push Docker Image to Docker Hub"){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerHubPwd', variable: 'dockerHubPwd')]) {
                        sh 'docker login -u athisii -p ${dockerHubPwd}'
                    }
                    sh 'docker push athisii/spring-jenkins-docker'
                }
            }
        }
    }
}