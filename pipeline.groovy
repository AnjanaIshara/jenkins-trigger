def jenkins_agent = 'master'

pipeline{
    agent { label "$jenkins_agent" }

    triggers {
        parameterizedCron('''
            */2 * * * *
        ''')
    }

    environment {
        readprop = readProperties file: 'variable.properties'
        SCHEDULE = "$readprop.SCHEDULE"
        TZ = "$readprop.TZ"
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