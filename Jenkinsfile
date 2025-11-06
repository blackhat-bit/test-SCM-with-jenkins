pipeline {
    agent any

    parameters {
        choice(
            name: 'BRANCH_VERSION',
            choices: ['3.3.3', '3.4.0', '3.5.0'],
            description: 'select the branch version to build')
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