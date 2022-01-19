def jenkins_agent = 'master'
def readprop = 'variable.properties'
def TZ = readprop['TZ']
def SCHEDULE = readprop['SCHEDULE']
pipeline{
    agent { label "$jenkins_agent" }


    stages{
        stage('Welcome to jenkins') {
            steps {
                script {
                    echo "Hello anjana How are you?"  
                }
            }
        }
    }
    triggers {
        cron("")
    }
}