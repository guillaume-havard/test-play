name := "testo"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache
)     

play.Project.playScalaSettings

# Déja dans les libraryDependencies ??
#val appDependencies = Seq
#(
#      jdbc
#)