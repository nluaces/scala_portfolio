name := "scala_sandbox"

version := "0.1"

scalaVersion := "3.0.0-RC3"

scalacOptions ++= Seq("-deprecation")


libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.8" % Test
)
