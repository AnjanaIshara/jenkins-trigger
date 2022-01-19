def jenkins_agent = any

pipeline{
    agent { label "${jenkins_agent}"}

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