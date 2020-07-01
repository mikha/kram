enablePlugins(ScalaJSPlugin)

name := "KRAM"

scalaVersion := "2.13.2"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

scalaJSStage in Global := FastOptStage

scalaJSUseMainModuleInitializer := true

mainClass in Compile := Some("com.dewdrop.kram.KramApp")

libraryDependencies += "com.lihaoyi" %%% "scalatags" % "0.9.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0" % "test"
