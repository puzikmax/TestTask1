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
                 sh 'docker login --username puziikmax --password Ass480883z'
                 sh 'docker build -f Dockerfile --tag school:MyApp .'
                 sh 'docker image tag school:MyApp'
                 sh 'docker push puziikmax/myschoolapp'
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
                    sh 'docker pull puziikmax/myschoolapp:tagname'
                    sh 'docker run --rm -p 8081:8081 -p 50001:50001 --name school/myschoolapp'
                }
            }
        stage('Cleanup'){
            steps {
                echo 'Cleanup'
                    docker system prune -f --filter "label!=keep"}
            }
        }
    }