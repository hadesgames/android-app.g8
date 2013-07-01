// Include the Android test defaults
androidTest

// Set the project name
name := "$name$ Test"

// Set the project version
version := "0.1"

// Set the project version code
versionCode := 0

// Set the version of Scala to use
scalaVersion := "$scala_version$"

// Set the Android platform name
platformName := "android-$api_level$"

// Make the Java compiler work better with Android apps
javacOptions ++= Seq("-encoding", "UTF-8", "-source", "1.6", "-target", "1.6")
