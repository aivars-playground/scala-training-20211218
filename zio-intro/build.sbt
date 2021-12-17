val scala3Version = "3.1.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "zio-intro",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test",
    libraryDependencies += "dev.zio" %% "zio" % "2.0.0-RC1"
  )
