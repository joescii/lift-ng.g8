lift-ng.g8
==========

g8 template for getting off the ground with Scala, Lift, and AngularJS

1. [Install sbt](http://www.scala-sbt.org/release/tutorial/Setup.html).
2. [Install giter8](https://github.com/n8han/giter8#installation).  ([Go here](https://github.com/n8han/conscript#linux-mac-windows) if you are sentenced to Windows)
3. In a command console, `cd` to your code cave.
4. Run `g8 joescii/lift-ng.g8`
5. Fill in the prompted blanks. Default values are in the square brackets. Feel free to fill in the first 3 as you wish, but only mess with the versions if you know what you're doing.
a. `name [my-lift-ng-project]:`
b. `organization [org.example]:`
c. `package [org.example.myliftngproject]:`
d. `scalaVersion [2.10.4]:`
e. `sbtVersion [0.13.5]:`
f. `liftVersion [2.5.1]:`
g. `ngVersion [1.2.19]:`
6. cd to the newly created directory and do your `git init`, etc.
7. Launch `sbt` in this directory.  Wait patiently as it downloads the internet the first time.
8. Execute `jasmine` to run javascript tests.
9. Execute `test` to run javascript tests and scala tests.
10. Execute `container:start` to launch the web application.
11. Point your browser to `http://localhost:8080` to play with the app.
12. Have fun!