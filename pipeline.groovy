def jenkins_agent = 'master'

def d = [
  'SCHEDULE':'*/1 * * * *'
]

pipeline{
    agent { label "$jenkins_agent" }

    environment {
        readprop = props = readProperties(defaults: d, file: 'variable.properties')
        SCHEDULE = "$readprop.SCHEDULE"
    }
    triggers {
        cron("")
    }

    stages{
        stage('Welcome to jenkins') {
            steps {
                script {
                    echo "Hello anjana How are you?"
                    echo $env.JOB_BASE_NAME
                }
            }
        }
    }
}