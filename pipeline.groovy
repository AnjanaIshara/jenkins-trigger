def jenkins_agent = 'master'
def SCHEDULE = "59 16 * * 1-5"
def TZ = "TZ = Asia/Colombo"
CRON_SETTINGS = '''*/3 * * * *'''
readprop = readProperties file: 'variable.properties'

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
                    //echo ${BRANCH_NAME}
                    //echo "${TZ}"
                }
            }
        }
    }
}