def jenkins_agent = 'master'

pipeline{
    agent { label "$jenkins_agent" }

    triggers {
        cron("")
    }

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