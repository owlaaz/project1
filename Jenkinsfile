pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '''chmod +x mvnw
./mvnw clean install package'''
      }
    }

  }
}