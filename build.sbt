enablePlugins(ScalaJSPlugin)

name := "KRAM"

scalaVersion := "2.11.7"

scalaJSStage in Global := FastOptStage

skip in packageJSDependencies := false

jsDependencies += RuntimeDOM

persistLauncher in Compile := true

persistLauncher in Test := false

libraryDependencies += "com.lihaoyi" %%% "scalatags" % "0.5.3"