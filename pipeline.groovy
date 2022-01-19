def jenkins_agent = 'master'
def SCHEDULE = "59 16 * * 1-5"
def TZ = "TZ = Asia/Colombo"
node{
    readprop = readProperties file: 'variable.properties'
    String cron_string = readprop['SCHEDULE']
}

pipeline{
    agent { label "$jenkins_agent" }


    // environment {
        
    //     //SCHEDULE = "$readprop.SCHEDULE"
    //     //TZ = "$readprop.TZ"
    // }

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