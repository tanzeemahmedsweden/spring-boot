pipeline {
    agent any
    tools { 
        maven 'Maven 3.6.3' 
        jdk 'jdk14' 
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
