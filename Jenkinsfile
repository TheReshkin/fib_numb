pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                git 'https://github.com/TheReshkin/fib_numb.git'
                echo "Building.."
                sh "mvn --version"
                sh "mvn package"
                sh "ls"
            }
        }
        stage('Test') {
            steps {
                echo "Testing.."
                sh 'mvn exec:java -Dexec.mainClass="com.app.Main"'
            }
        }
        stage('Show') {
            steps {
                sh "cat fibonacci.txt"
            }
        }
    }
}
