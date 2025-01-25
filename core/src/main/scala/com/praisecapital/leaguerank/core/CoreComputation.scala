package com.app_scala_quickstart_cli.core

import scala.collection.mutable.LinkedHashMap
import com.app_scala_quickstart_cli.model._

class CoreComputation():
  def compute(modelAs: List[ModelA]): List[ComputationResult] =
    // modelAs.map{modelA => do stuff with modelA}
    List(ComputationResult(1, "", 1))