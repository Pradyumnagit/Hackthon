
node {
    stage 'checkout'
    git 'ssh://git@172.17.0.3:7999/mk/mkrepo1.git' 
  
  
  
  stage('Sonarqube analysis') {
    
      
     sh "pwd"  
    def scannerHome = tool 'sonarscanner';
    
     withSonarQubeEnv('sonarqube') {
         
        echo "${workspace}"
        
         
         sh "${scannerHome}/bin/sonar-scanner -Dsonar.host.url=${SONAR_HOST_URL}    -Dsonar.projectName=dockerpipeline -Dsonar.projectVersion=1.0 -Dsonar.analysis.mode= -Dsonar.projectKey=dockerpipeline  -Dsonar.verbose=true -Dsonar.sources=. -Dsonar.java.binaries=/var/jenkins_home/workspace/Docker-Lab-Pipeline/build/classes"
          
    }
    
   
    
    
     
 }
  
  
    
    stage 'code build'
    
   def antVersion = 'ant'
withEnv( ["ANT_HOME=${tool antVersion}"] ) {
    sh '$ANT_HOME/bin/ant '
  
  junit allowEmptyResults: true, testDataPublishers: [[$class: 'AttachmentPublisher']], testResults: '**/reports/junit/*.xml'
  
  
}
  stage('jacoco'){
  step([$class: 'JacocoPublisher', 
      execPattern: 'target/*.exec',
      classPattern: '**/target/classes',
      sourcePattern: '/var/jenkins_home/workspace/Docker-Lab-Pipeline/src/bean',
      exclusionPattern: 'src/test*'
])
  }
  
  
  
    
    
   stage('docker image build') 
   
sh "sudo docker build -t dockerappimage-new ."

    stage ('docker deploy')
sh "sudo docker run --name dockerappcontainer-new_latest_1234 -d -p 8046:8080 dockerappimage-new "
    
}


