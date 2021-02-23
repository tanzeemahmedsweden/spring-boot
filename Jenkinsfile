pipeline {
    /*
    agent any

    tools {
        // Below must be configured inside Manage Jenkins -> Global Tool Configuration -> key is predefined and value corresponds to name you have specified
        maven "3.6.3"
        jdk "jdk14"
        dockerTool "docker"
    }
    */
    
    tools {
        dockerTool "docker"
    }
    
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
