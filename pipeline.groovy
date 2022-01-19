def jenkins_agent = 'master'
def SCHEDULE = "59 16 * * 1-5"
def TZ = "TZ = Asia/Colombo"


pipeline{
    agent { label "$jenkins_agent" }


    environment {
        readprop = readProperties file: 'variable.properties'
        String cron_string = "28 17 * * 1-5"
        //SCHEDULE = "$readprop.SCHEDULE"
        //TZ = "$readprop.TZ"
    }

    triggers {
        cron(cron_string)
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