name := "ProcessingSBTTemplate"

version := "0.1"

scalaVersion := "2.13.2"

// For some reason, 3.5.x isn't available via Maven yet
libraryDependencies ++= Seq(
  "org.processing" % "core" % "3.3.7"
)