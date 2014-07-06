name := "$name$"

organization := "$organization;format="lower"$"

version := "0.0.1-SNAPSHOT"

scalaVersion := "$scalaVersion$"

resolvers ++= Seq(
  "snapshots"         at "http://oss.sonatype.org/content/repositories/snapshots",
  "releases"          at "http://oss.sonatype.org/content/repositories/releases",
  "CB Central Mirror" at "http://repo.cloudbees.com/content/groups/public"  // Location of Lift SNAPSHOT builds
)

seq(webSettings :_*)

unmanagedResourceDirectories in Test <+= (baseDirectory) { _ / "src/main/webapp" }

scalacOptions ++= Seq("-deprecation", "-unchecked")

libraryDependencies ++= {
  val liftVersion = "$liftVersion$"
  val liftEdition = liftVersion.substring(0,3)
  val ngVersion = "$ngVersion$"
  Seq(
    "net.liftweb"             %% "lift-webkit"                        % liftVersion           % "compile",
    "net.liftmodules"         %% ("lift-jquery-module_"+liftEdition)  % "2.4",
    "net.liftmodules"         %% ("ng-js_"+liftEdition)               % ("0.1_"+ngVersion)    % "compile",
    "net.liftmodules"         %% ("ng_"+liftEdition)                  % "0.4.5"               % "compile",
    "org.eclipse.jetty"       % "jetty-webapp"                        % "8.1.7.v20120910"     % "container,test",
    "org.eclipse.jetty.orbit" % "javax.servlet"                       % "3.0.0.v201112011016" % "container,test" artifacts Artifact("javax.servlet", "jar", "jar"),
    "ch.qos.logback"          % "logback-classic"                     % "1.0.6",
    "org.specs2"              %% "specs2"                             % "1.14"                % "test"
  )
}

