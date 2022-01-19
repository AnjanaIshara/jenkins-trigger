def jenkins_agent = 'master'
def SCHEDULE = "59 16 * * 1-5"
def TZ = "TZ = Asia/Colombo"
CRON_SETTINGS = '''*/3 * * * *'''
node("$jenkins_agent"){
    readprop = readProperties file: 'variable.properties'
    def cron_string = readprop['SCHEDULE']
    echo "${cron_string}"
    // triggers {
    //     cron("${cron_string}")
    // }
}

pipeline{
    agent { label "$jenkins_agent" }


    // environment {
        
    //     //SCHEDULE = "$readprop.SCHEDULE"
    //     //TZ = "$readprop.TZ"
    // }

    triggers {
        parameterizedCron(CRON_SETTINGS)
    } 
    stages{
        stage('Welcome to jenkins') {
            steps {
                script {
                    echo "Hello anjana How are you?"
                    echo "${cron_string}"
                    //echo "${TZ}"
                }
            }
        }
    }
}