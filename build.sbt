libraryDependencies += "com.lihaoyi" % "ammonite-repl" % "0.5.7" % "test" cross CrossVersion.full

libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "3.7.2" % "test")

libraryDependencies ++= Seq("org.specs2" %% "specs2-scalacheck" % "3.7.2" % "test")


libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.13.0" % "test"

scalacOptions in Test ++= Seq("-Yrangepos")

initialCommands in (Test, console) := """ammonite.repl.Main.run("")"""

lazy val root = (project in file(".")).
    settings(
        name := "codility-scala",
        version := "1.0",
        scalaVersion := "2.10.6"
    )
