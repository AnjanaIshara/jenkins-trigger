def jenkins_agent = 'master'


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