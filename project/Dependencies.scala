/*
 * Copyright (c) 2014 Snowplow Analytics Ltd. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
import sbt._

object Dependencies {

  val resolutionRepos = Seq(
    "Snowplow Analytics Maven releases repo" at "http://maven.snplow.com/releases/",
    "Snowplow Analytics Maven snapshot repo" at "http://maven.snplow.com/snapshots/",
    "Twitter maven repo"                     at "http://maven.twttr.com/"
  )

  object V {
    // Java
    val slf4j                = "1.7.6"
    val kinesisClient        = "1.4.0"
    val kinesisConnector     = "1.1.2"
    val hadoop               = "1.2.1"
    val elephantbird         = "4.5"
    val yodaTime             = "2.2"
    val yodaConvert          = "1.2"
    val config               = "1.0.2"
    // Thrift (test only)
    val collectorPayload     = "0.0.0"
    // Scala
    val scopt                = "3.6.0"
    val json4s               = "3.2.11"
    val scalaz7              = "7.2.13"
    val snowplowTracker      = "0.1.0"
    // Scala (test only)
    val specs2               = "2.2"
    val scalazSpecs2         = "0.1.2"
  }

  object Libraries {
    // Java
    val slf4j            = "org.slf4j"                %  "slf4j-simple"              % V.slf4j
    val kinesisClient    = "com.amazonaws"            %  "amazon-kinesis-client"     % V.kinesisClient
    val kinesisConnector = "com.amazonaws"            %  "amazon-kinesis-connectors" % V.kinesisConnector
    val hadoop           = "org.apache.hadoop"        %  "hadoop-core"               % V.hadoop
    val elephantbird     = "com.twitter.elephantbird" %  "elephant-bird-core"        % V.elephantbird
    val yodaTime         = "joda-time"                %  "joda-time"                 % V.yodaTime
    val yodaConvert      = "org.joda"                 %  "joda-convert"              % V.yodaConvert
    val config           = "com.typesafe"             %  "config"                    % V.config
    // Thrift (test only)
    val collectorPayload = "com.snowplowanalytics"    %  "collector-payload-1"       % V.collectorPayload % "test"
    // Scala
    val scopt            = "com.github.scopt"         %% "scopt"                     % V.scopt
    val json4sJackson    = "org.json4s"               %% "json4s-jackson"            % V.json4s
    val scalaz7          = "org.scalaz"               %% "scalaz-core"               % V.scalaz7
    val snowplowTracker  = "com.snowplowanalytics"    %% "snowplow-scala-tracker"    % V.snowplowTracker
    // Scala (test only)
    val specs2           = "org.specs2"               %% "specs2"                    % V.specs2           % "test"
    val scalazSpecs2     = "org.typelevel"            %% "scalaz-specs2"             % V.scalazSpecs2     % "test"
  }
}
