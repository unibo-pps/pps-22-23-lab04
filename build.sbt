scalaVersion := "3.2.2"

lazy val root = (project in file("."))
  .settings(
    name := "pps-code-lab-4",
    libraryDependencies += "com.github.sbt" % "junit-interface" % "0.13.3" % Test
  )
