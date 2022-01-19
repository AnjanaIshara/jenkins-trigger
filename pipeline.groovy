def jenkins_agent = 'master'
def SCHEDULE = ""
pipeline{
    agent { label "$jenkins_agent" }

    environment {
        readprop = readProperties file: 'variable.properties'
        SCHEDULE = "$readprop.SCHEDULE"
        TZ = "$readprop.TZ"
    }

    stages{
        stage('Welcome to jenkins') {
            steps {
                script {
                    echo "Hello anjana How are you?"
                    echo "${SCHEDULE}"
                    echo "${TZ}"
                }
            }
        }
    }
    triggers {
        cron("")
    }
}