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
                 sh = docker build -f Dockerfile --tag MyApp .
                 sh = docker push MyApp/MyApp

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
                    sh = docker run --rm -p 8080:8080 -p 50001:50001 --name MyApp MyApp
             }
        }
       }
    }