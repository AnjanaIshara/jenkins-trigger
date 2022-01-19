def jenkins_agent = 'master'

pipeline{
    agent none

    stages{
        stage('Welcome to jenkins') {
            steps {
                script {
                    echo "Hello anjana How are you?"
                }
            }
        }
    }
}