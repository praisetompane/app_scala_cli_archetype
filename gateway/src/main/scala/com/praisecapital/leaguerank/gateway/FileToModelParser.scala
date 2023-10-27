package com.app_project_x_scala.gateway

import com.app_project_x_scala.model.{ModelA, ModelB}

object FileToModelParser {
  def parse(modelAs: List[String]): List[ModelA] =
    modelAs.map { modelALine =>
      val modelA = modelALine.split(", ").toList
      modelA match {
        case modelB_A :: modelB_B =>
          ModelA(ModelB(modelB_A), ModelB(modelB_B.head))
        case _ =>
          throw new IllegalArgumentException("invalid match results format")
      }
    }
}
