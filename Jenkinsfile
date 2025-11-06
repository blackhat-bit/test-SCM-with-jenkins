pipeline {
    agent any

    parameters {
        string(name: 'BRANCH_VERSION', defaultValue: '3.3.3', description: 'specify branch version')
    }
    stages {
        stage('Build') {
            steps {
                echo "Building branch ${params.BRANCH_VERSION}..."
                // Add your build steps here
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                // Add your test steps here
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                // Add your deploy steps here
            }
        }
    }
    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed.'
        }
    }
}