def gv



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
        stage('initialize') {
            steps {
                script {
                    gv = load 'script.groovy'
                }
            }
        }
        
        stage('Build') {
            steps {
                script{g
                v.buildapp()
                }
                
            }
        }
        stage('Test') {
            when{
                expression{ params.RUN_TESTS }
            }
            steps {
                script {
                    gv.testapp()
                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                    gv.deployapp()
                }
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