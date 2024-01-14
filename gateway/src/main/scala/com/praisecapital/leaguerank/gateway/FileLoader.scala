package com.app_x_scala.gateway

import com.app_x_scala.model.{ModelA, ModelB}
import scala.util.{Try, Success, Failure}
import scala.io.Source
import scala.util.Using

object FileLoader {
  def loadFile(filename: String): List[String] =
    Using(Source.fromFile(filename)) { reader =>
      reader.getLines().toList
    } match {
      case Success(result) => result
      case Failure(e) =>
        println(
          s"An error occurred loading file $filename."
        )
        throw e
    }
}
