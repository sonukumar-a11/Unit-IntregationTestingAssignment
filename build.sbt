name := "UT-IT-Group2"

version := "0.1"

scalaVersion := "2.13.4"

lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.3" % Test
lazy val mockitoScala = "org.mockito" %% "mockito-scala" % "1.16.15" % Test

lazy val quest1and2 = project.in(file("quest1and2")).settings(
  libraryDependencies += scalaTest
)
lazy val quest3 = project.in(file("quest3")).settings(
  libraryDependencies ++= Seq(scalaTest , mockitoScala)
)
lazy val root = project.in(file(".")).aggregate(quest1and2, quest3)