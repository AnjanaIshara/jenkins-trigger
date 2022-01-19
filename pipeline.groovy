def jenkins_agent = 'master'

pipeline{
    agent none
    
    stages{
        stage('Welcome to jenkins') {
            steps {
                script {
                    echo "NODE_NAME = ${env.NODE_NAME}"
                    echo "Hello anjana How are you?"
                }
            }
        }
    }
}