pipeline{
  agent any

  tools{
    maven "Maven"
    jdk "JDK21"
  }

  stages{
    stage('Checkout'){
      steps{
        git branch : 'main',
        url : 'https://github.com/AshrithaKS/practice.git',
        credentialsId : 'github-token'
      }
    }

    stage('Build'){
      steps{
        sh 'mvn clean compile'
      }
    }

    stage('Test'){
      steps{
        sh 'mvn test'
      }
    }

    stage('Package'){
      steps{
        sh 'mvn package'
      }
    }

    stage('Run application'){
      steps{
        sh 'mvn exec:java -Dexec.mainClass=com.example.app.App'
      }
    }
  }

  post{
    success{
      emailtext{
        subject : "SUCCESS :${JOB_NAME} #${BUILD_NUMBER}",
        body : "Build Success!\nCheck : ${BUILD_URL}",
        to : "ashrithaks2704@gmail.com"
      }
    }
    failure{
      emailtext{
        subject : "FAIL :${JOB_NAME} #${BUILD_NUMBER}",
        body : "Build fail!\nCheck : ${BUILD_URL}",
        to : "ashrithaks2704@gmail.com"
      }
    }
  } 
}
          
          
