pipeline {
    agent any

    parameters {
        choice(
            name: 'BRANCH_VERSION',
            choices: ['1.1', '1.2', '1.3', '1.4', '1.5'],
            description: 'select the branch version to build'
            )
            booleanParam(
            name: 'RUN_TESTS',
                defaultValue: true,
                description: 'Run tests after building?'
            )
    }
    stages {
        stage('Build') {
            steps {
                echo "Building branch ${params.BRANCH_VERSION}..."
                // Add your build steps here
            }
        }
        stage('Test') {
            when{
                expression{ params.RUN_TESTS }
            }
            steps {
                echo "Testing branch ${params.BRANCH_VERSION}..."
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