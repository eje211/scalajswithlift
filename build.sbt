enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"

val liftVersion = "2.6.2"

scalaVersion := "2.11.7" // or any other Scala version >= 2.10.2

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.8.1"
libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.8.1"
libraryDependencies += "com.lihaoyi" %%% "utest" % "0.3.0" % "test"
libraryDependencies += "net.liftweb" %% "lift-json" % liftVersion
libraryDependencies += "net.liftweb" %% "lift-common" % liftVersion

// jsDependencies += "org.webjars" % "jquery" % "2.1.3" / "jquery.js"
jsDependencies += RuntimeDOM

scalaJSStage in Global := FastOptStage
skip in packageJSDependencies := false

testFrameworks += new TestFramework("utest.runner.Framework")
