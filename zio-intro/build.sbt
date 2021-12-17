val scala3Version = "3.1.0"
val ZIOVersion    = "2.0.0-RC1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "zio-intro",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,
    
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test",
    
    libraryDependencies ++= Seq(
      // ZIO
      "dev.zio"          %% "zio"              % ZIOVersion,
      "dev.zio"          %% "zio-test"         % ZIOVersion % "test",
      "dev.zio"          %% "zio-test-sbt"     % ZIOVersion % "test",
    )
  )
