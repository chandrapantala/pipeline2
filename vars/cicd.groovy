def newGit(repo)
{
  git "https://github.com/intelliqittrainings/${repo}.git"
}
def newMaven()
{
  sh 'mvn package'
}
def newDeploy(jobname,ipadress,context)
{
  sh 'scp /var/lib/jenkins/workspace/${"jobname"}/webapp/target/webapp.jar ubuntu@${"ipadress"}:/var/lib/tomcat9/webapps/${"context"}.war'
}
