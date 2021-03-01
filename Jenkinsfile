pipeline {
   agent any
   tools {
      maven "3.6.3"
   }
   stages {
      stage('Build') {
         steps {
            sh 'mvn -B install'
         }
      }
      stage('Test') {
         steps {
            sh 'mvn -B test'
         }
      }
   }
}
