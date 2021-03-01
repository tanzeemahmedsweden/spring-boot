pipeline {
   agent any
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
