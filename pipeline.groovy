def jenkins_agent = 'master'
def SCHEDULE = "H 16 * * 1-5"
def TZ = "TZ = Asia/Colombo"
pipeline{
    agent { label "$jenkins_agent" }


    environment {
        readprop = readProperties file: 'variable.properties'
        //SCHEDULE = "$readprop.SCHEDULE"
        //TZ = "$readprop.TZ"
    }

    triggers {
        cron("${SCHEDULE}")
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
}