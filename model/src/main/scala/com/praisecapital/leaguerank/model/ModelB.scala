package com.app_project_x_scala.model

case class ModelB(name: String, score: Int)

object ModelB {
  val alphaNumbericPattern = "([a-zA-Z ]*) ([0-9]*)".r
  def apply(modelBString: String): ModelB = modelBString match {
    case alphaNumbericPattern(name, score) => ModelB(name, score.toInt)
    case _ =>
      throw new IllegalArgumentException("invalid modelBformat")
  }
}
