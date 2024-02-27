pipeline {
    agent {
         any
      }
    stages {
        stage('Build') {
            steps {
                git 'https://github.com/TheReshkin/fib_numb'
                echo "Building.."
                dir('fib_numb'){
                    sh "ls"
                    sh "mvn compile"
                    sh "ls"
                }
            }
        }
        stage('Test') {
            steps {
                echo "Testing.."
                sh "mvn exec:java -Dexec.mainClass="com.app.Main""
            }
        }
        stage('Show') {
            steps {
                sh "cat fibonacci.txt"
            }
        }
    }
}