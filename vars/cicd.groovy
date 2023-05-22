def newGit(repo)
{
  git "https://github.com/intelliqittrainings/maven.git"
}
def newMaven()
{
  sh 'mvn package'
}
def newDeploy(jobname,ipadress,context)
{
  sh 'scp /var/lib/jenkins/workspace/${"jobname"}/server/target/server.jar ubuntu@${"ipadress"}:/var/lib/tomcat9/webapps/${"context"}.war'
}
