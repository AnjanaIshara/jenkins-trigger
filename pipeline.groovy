def jenkins_agent = 'master'


pipeline{
    agent { label "$jenkins_agent" }


    // environment {
        
    //     //SCHEDULE = "$readprop.SCHEDULE"
    //     //TZ = "$readprop.TZ"
    // }

    triggers {
        when {branch "master"}
        cron("*/3 * * * *")
    } 
    stages{
        stage('Welcome to jenkins') {
            steps {
                script {
                    echo "Hello anjana How are you?"
                    //echo env.BRANCH_NAME
                    //echo "${TZ}
                }
            }
        }
    }
}