import sbtassembly.AssemblyPlugin.autoImport._
import sbt.Keys._
import sbt._
import scoverage.ScoverageKeys._

object Settings{
  val DefaultOrganization = "com"

  lazy val BaseProject = Seq(
    organization := DefaultOrganization,
    version := "1.0.0",
    scalaVersion := Dependencies.scalaVersion,
    scalacOptions ++= Seq("-deprecation"),
    coverageMinimumStmtTotal := 80,
    coverageMinimumBranchTotal := 80,
    coverageMinimumStmtPerPackage := 80,
    coverageMinimumBranchPerPackage := 80,
    coverageMinimumStmtPerFile := 80,
    coverageMinimumBranchPerFile := 80,
    coverageFailOnMinimum := true
  )

  lazy val Assembly = Seq(
    isSnapshot := false,
    assembly / logLevel := Level.Error
  )
}