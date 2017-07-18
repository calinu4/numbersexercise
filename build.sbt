name := "Numbers"

version := "1.0"

scalaVersion := "2.11.8"
// grading libraries
libraryDependencies += "junit" % "junit" % "4.10" % "test"

// for funsets
libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.4"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
libraryDependencies += "org.scoverage" % "scalac-scoverage-plugin_2.11" % "1.1.1" % "provided"




wartremoverErrors ++= Warts.unsafe
