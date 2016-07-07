import ScalaxbKeys._

scalaxbSettings

name := "SparkXmlAvro"
version := "1.0"
 
//scalaVersion := "2.10.6"
lazy val commonSettings = Seq(
  organization  := "com.telia.spark",
  scalaVersion  := "2.10.6"
)

libraryDependencies += "net.databinder.dispatch" %% "dispatch-core" % "0.11.0"
libraryDependencies += "com.owlike" %% "genson-scala" % "1.4"
libraryDependencies += "com.gensler" %% "scalavro" % "0.6.2"


//sourceGenerators in Compile <+= scalaxb in Compile 
//packageName in scalaxb in Compile := "com.telia.spark.generated"

libraryDependencies ++= Seq(
    ("org.apache.spark"%%"spark-core"%"1.4.1" % "provided"),
    "org.apache.avro" % "avro-mapred" % "1.7.7"  % "provided" classifier("hadoop2") exclude("org.mortbay.jetty", "servlet-api"),
    "org.apache.avro" % "avro" % "1.7.6" exclude("org.mortbay.jetty", "servlet-api")
 )


libraryDependencies += "org.apache.hadoop" % "hadoop-streaming" % "2.7.2" % "provided"
libraryDependencies += "org.apache.hadoop" % "hadoop-common" % "2.7.1" % "provided"

mergeStrategy in assembly <<= (mergeStrategy in assembly) { (old) =>
  {
    case PathList("javax", "servlet", xs @ _*) => MergeStrategy.last
    case PathList("org", "apache", xs @ _*) => MergeStrategy.last
    case PathList("com", "esotericsoftware", xs @ _*) => MergeStrategy.last
    case "about.html" => MergeStrategy.rename
    case x => old(x)
  }
}

// put all libs in the lib_managed directory, that way we can distribute eclipse project files
retrieveManaged := true
    
EclipseKeys.relativizeLibs := true
    
// Avoid generating eclipse source entries for the java directories
(unmanagedSourceDirectories in Compile) <<= (scalaSource in Compile)(Seq(_))
   
(unmanagedSourceDirectories in Test) <<= (scalaSource in Test)(Seq(_))
