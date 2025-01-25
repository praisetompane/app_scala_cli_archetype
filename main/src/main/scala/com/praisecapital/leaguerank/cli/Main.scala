package com.app_scala_quickstart_cli.cli

import com.app_scala_quickstart_cli.gateway._
import com.app_scala_quickstart_cli.core._
import java.io.FileNotFoundException

@main def main(args: String*) =
  try 
    if args.length == 1 && args(0).isEmpty then
      println("Please provide a filename.")
    else if args.length > 1 then
      println("Please provide one filename.")
    else
      val inputFileName = args(0)
      val domainFile = FileLoader.loadFile(inputFileName)
      val modelAs = FileToModelParser.parse(domainFile)
      val projectXCoreComputer = new CoreComputation()
      val result = projectXCoreComputer.compute(modelAs)
      println(result)
  catch 
    case e: FileNotFoundException =>
      println(s"File not found, please ensure the file is in the same directory as the program. Provided filename was: ${args(0)}.")
    case e: Exception =>
      println("Failed to generate the League rankings. Please refer to stack trace below for reason:")
      e.printStackTrace()