pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {
         stage('Clone repository') {
            steps {
                script{
                checkout scm
                }
            }
        }

        stage('Build') {
            steps {
                script{
                 app = docker.build("school")
                }
            }
        }
        stage('Test'){
            steps {
                 echo 'SKIP TEST STAGE'
            }
        }

        stage('Deploy'){
            steps {
                echo 'Deploy'
                    script{
                      docker.withRegistry('http://localhost') {
                      app.push("${env.BUILD_NUMBER}")
                      app.push("latest") }
                      }
             }
        }
       }
    }