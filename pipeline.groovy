def jenkins_agent = 'master'
def readprop = readProperties file: 'variable.properties'
def TZ = readprop['TZ']
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