import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "artistaOne"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
     "mysql" % "mysql-connector-java" % "5.1.25",
    "com.amazonaws" % "aws-java-sdk" % "1.3.11",
    javaCore,
    javaJdbc,
    javaEbean
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}
