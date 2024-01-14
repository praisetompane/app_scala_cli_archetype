package com.app_x_scala.cli

import com.app_x_scala.gateway._
import com.app_x_scala.core._
import java.io.FileNotFoundException
object Main extends App {
  try {
    if (args.length == 0)
      println("Please provide a filename.")
    else if (args.length > 1)
      println("Please provide one filename.")
    else {
      val inputFileName = args(0)
      val domainFile = FileLoader.loadFile(inputFileName)
      val modelAs = FileToModelParser.parse(domainFile)
      val projectXCoreComputer = new CoreComputation()
      val result = projectXCoreComputer.compute(modelAs)
      println(result)
    }
  } catch {
    case e: FileNotFoundException =>
      println(
        s"File not found, please ensure the file is in the same directory as the program. Provided filename was: ${args(0)}."
      )
    case e: Exception =>
      println(
        "Failed to generate the League rankings. Please refer to stack trace below for reason:"
      )
      e.printStackTrace()
  }
}
