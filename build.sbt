
ThisBuild / description           := "Scala projects template repository."
ThisBuild / homepage              := Some(url("https://scala-lab.cognithive.com"))
ThisBuild / licenses              := Seq("ISC" -> url("https://www.isc.org/licenses/"), "GPLv2" -> url("https://www.gnu.org/licenses/gpl-2.0.html"))
ThisBuild / organization          := "com.cognithive"
ThisBuild / organizationHomepage  := Some(url("https://cognithive.com"))
ThisBuild / organizationName      := "Cognithive"
ThisBuild / name                  := "Scala lab"
ThisBuild / scalaVersion          := "2.13.1"
ThisBuild / startYear             := Some(2019)
ThisBuild / version               := "0.1.0"

// Library dependencies
lazy val versions = new {
  val scalatest = "3.1.0"
}

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % versions.scalatest % Test
)
