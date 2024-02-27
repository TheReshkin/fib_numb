pipeline {
    agent any
    stages {
        stage('Build') {
            steps {

                echo "Building.."
                sh "mvn --version"
                sh "mvn package"
                sh "ls"
            }
        }
        stage('Test') {
            steps {
                echo "Testing.."
                sh 'mvn exec:java -Dexec.mainClass="Main"'
            }
        }
        stage('Show') {
            steps {
                sh "cat fibonacci.txt"
                archiveArtifacts artifacts: 'target/fibonacci-calculator-1.0-SNAPSHOT.jar', allowEmptyArchive: true
            }
        }
    }
}
