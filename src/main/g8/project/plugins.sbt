// Change to 0.5.0 if using sbt 0.12.x
addSbtPlugin("com.earldouglas" % "xsbt-web-plugin" % "0.9.0")

libraryDependencies += "org.webjars.bower" % "jasmine" % "$jasmineVersion$"

addSbtPlugin("com.joescii" % "sbt-jasmine-plugin" % "$sbtJasmineVersion$")

//Enable the sbt idea plugin
addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.1")

//Enable the sbt eclipse plugin
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.2.0")
