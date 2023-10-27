package com.app_project_x_scala.core

import scala.collection.mutable.LinkedHashMap
import com.app_project_x_scala.model._

class CoreComputation() {
  def compute(modelAs: List[ModelA]): List[ComputationResult] = {
    // modelAs.map{modelA => do stuff with modelA}
    List(ComputationResult(1, "", 1))
  }
}
