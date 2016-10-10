name := """akkaDocker"""

version := "1.0"

scalaVersion := "2.11.8"

enablePlugins(DockerPlugin)
enablePlugins(JavaAppPackaging)

dockerExposedPorts := Seq(2552, 8080)
dockerBaseImage := "java:8"

libraryDependencies ++= Dependencies.common