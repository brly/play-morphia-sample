name := "mongotest"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
	"com.google.code.morphia" % "morphia" % "0.99",
  "org.mongodb" % "mongo-java-driver" % "2.7.3"
)     

play.Project.playJavaSettings
