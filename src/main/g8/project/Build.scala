import sbt._

import Keys._
import Defaults._
import sbtandroid.AndroidPlugin._


object AndroidBuild extends Build {

  // Global settings
  val globalSettings = Seq(
    name := "$name$",
    version := "0.1",
    versionCode := 0,
    scalaVersion := "$scala_version$",
    platformName := "android-$api_level$",
    keyalias := "change-me",
    useProguard := false,
    libraryDependencies ++= Seq(
    ),

    resolvers ++= Seq (
    )
  )

  // Main project (equivalent to defining something in `build.sbt`)
  lazy val main = AndroidProject(
    "main",                     // Project name
    file("."),                  // Project base directory
    settings=globalSettings)    // Project settings

  lazy val tests = AndroidTestProject(
    "tests",                         // Project name
    file("tests"),                   // Project base directory
    settings=globalSettings)         // Project settings
    .dependsOn(main % "provided")    // Main is "provided"
    .settings(name := "MockaTests")  // Application name
}
