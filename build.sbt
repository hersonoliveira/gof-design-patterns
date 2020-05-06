ThisBuild / name := "gof-design-patterns"
ThisBuild / version := "0.1"
ThisBuild / scalaVersion := "2.13.2"

ThisBuild / libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.1" % "test"

lazy val root = (project in file("."))

lazy val creational = (project in file("creational"))
