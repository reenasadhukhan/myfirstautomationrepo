pipeline {
    agent any
    stages {
    	stage ('Clean Stage') {

            steps {
                withMaven(maven : 'local_Maven') {
                    bat 'mvn clean'
                }
            }
        }
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'local_Maven') {
                    bat 'mvn compile'
                }
            }
        }
        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'local_Maven') {
                    bat 'mvn test'
                }
            }
        }
        stage ('Install Stage') {
            steps {
                withMaven(maven : 'local_Maven') {
                    bat 'mvn install'
                }
            }
        }
    }
}
