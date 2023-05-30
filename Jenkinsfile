pipeline {
    agent any
    stages {
        stage('Clean') {
            steps {
                sh 'mvn clean'
            }
        }
        stage('install') {
            steps {
                sh 'mvn package'
            }
        }
        stage('upload'){
            steps{
                 sshagent(credentials : ['aliyun-ssh']) {
                      sh """
                            scp ./target/jenkins-spring-java-11-0.0.1-SNAPSHOT.jar root@47.94.195.238:jenkins-spring-java-11-0.0.1-SNAPSHOT.jar
                            ssh root@47.94.195.238 "bash springTest.sh"
                      """
                }
            }
        }
    }
}
