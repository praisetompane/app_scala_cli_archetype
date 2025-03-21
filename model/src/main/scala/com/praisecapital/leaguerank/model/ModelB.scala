package com.app_scala_quickstart_cli.model

import scala.util.matching.Regex
case class ModelB(name: String, score: Int)

object ModelB:
  val alphaNumbericPattern: Regex = "([a-zA-Z ]*) ([0-9]*)".r
  def apply(modelBString: String): ModelB = modelBString match
    case alphaNumbericPattern(name, score) => ModelB(name, score.toInt)
    case _ =>
      throw new IllegalArgumentException("invalid modelBformat")