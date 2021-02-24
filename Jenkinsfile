pipeline {
   
    agent {
        docker {
            image "maven:3-openjdk-15-slim"
        }
    }

    stages {
        
        stage('build') {
            steps {
                sh 'mvn -B compile'
            }
        }

        stage('test') {
            steps {
                sh 'mvn -B test'
            }

        }
    }
    
    post {
        always {
            cleanWs()
        }
    }
}
