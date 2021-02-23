pipeline {

    agent any

    tools {
        maven "3.6.3"
        "jdk14"
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
