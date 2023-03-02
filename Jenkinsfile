pipeline {
	agent none
  stages {
    stage('Docker Build') {
    	agent any
      steps {
      	sh 'docker build -t school:latest'
      }
    }
    stage('Docker Run') {
        agent any
      steps {
        sh 'docker run school -p 8081:8081 -p 50002:50002'}
        }
  }
}