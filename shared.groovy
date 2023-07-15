/* groovylint-disable-next-line MethodReturnTypeRequired */
def sampleTest(){
    echo "this is india"
}
def systemInfo(){
    /* groovylint-disable-next-line NglParseError */
    hostnamectl > /opt/sample.txt
    
}
def movegroovy(){
    mv /var/lib/jenkins/workspace/testing/devOps/devops/* /opt/devops/
}