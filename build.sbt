enablePlugins(ScalaJSPlugin)

name := "KRAM"

scalaVersion := "2.12.3"

scalaJSStage in Global := FastOptStage

skip in packageJSDependencies := false

jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv

scalaJSUseMainModuleInitializer in Compile := true

libraryDependencies += "com.lihaoyi" %%% "scalatags" % "0.6.5"
