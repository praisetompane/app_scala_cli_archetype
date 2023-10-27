package com.app_project_x_scala.model

import org.scalatest.funsuite.AnyFunSuite
import com.app_project_x_scala.model.ModelB
import com.app_project_x_scala.model.ModelBDefaultObject

class ModelBUnitTests extends AnyFunSuite {

  test("can handle single word modelB") {
    val modelBString = "Lions 3"
    val modelB = ModelB(modelBString)
    assert(
      ModelBDefaultObject.copy(name = "Lions", score = 3) == modelB
    )
  }

  test("can handle modelB with 2 words") {
    val modelBString = "FC Awesome 5"
    val modelB = ModelB(modelBString)
    assert(
      ModelBDefaultObject.copy(name = "FC Awesome", score = 5) == modelB
    )
  }

  test("can handle modelB with more than 2 words and score") {
    val modelBString = "FC Awesome Players 5"
    val modelB = ModelB(modelBString)
    assert(
      ModelBDefaultObject.copy(
        name = "FC Awesome Players",
        score = 5
      ) == modelB
    )
  }
}
