pipeline {
  agent any
  stages {
    stage('Get Code') {
      steps {
        git(url: 'https://github.com/narasimhavuppala/bdd-cucumber-java-demos.git', branch: 'master')
      }
    }
  }
}