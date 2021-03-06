pipeline {
      agent {
          docker {
            image 'maven:3.6.3-adoptopenjdk-14'
            // args '-v $HOME/.m2:/root/.m2' 
          }
          }
stages {
          stage('Build') {
              steps {
                sh 'mvn -B install' 
              }
          } 
        }
}
