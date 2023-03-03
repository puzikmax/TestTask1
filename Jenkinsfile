pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {
         stage('Clone repository') {
            steps {
                script {
                checkout scm
                }
            }
        }

        stage('Build') {
            steps {
                script {
                 sh 'docker build -f Dockerfile'
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
                    script {
                    sh 'docker run --rm -p 8081:8081 -p 50001:50001 --name school/myapp'}
                }
            }
        }
    }