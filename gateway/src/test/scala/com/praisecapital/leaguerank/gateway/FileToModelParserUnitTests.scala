package com.app_x_scala.gateway

import org.scalatest.funsuite.AnyFunSuite
import com.app_x_scala.model.{ModelADefaultObject, ModelBDefaultObject}

class FileToModelParserUnitTests extends AnyFunSuite {

  test(
    "successfully parse a single match result in string format to a List[ModelA] object"
  ) {
    val modelAs = "ObjectA 3, ObjectB 3"
    val objectA = "ObjectA"
    val ObjectB = "ObjectB"
    val expectedMatchResults = List(
      ModelADefaultObject.copy(
        objectA = ModelBDefaultObject.copy(objectA, 3),
        objectB = ModelBDefaultObject.copy(ObjectB, 3)
      )
    )

    assert(expectedMatchResults === FileToModelParser.parse(List(modelAs)))
  }

  test(
    "successfully parse multiple match result in string format to a List[ModelA] object"
  ) {
    val modelAs_1 = "ObjectA 3, ObjectB 3"
    val modelAs_2 = "ObjectAA 1, ObjectBB 0"
    val objectA = "ObjectA"
    val ObjectB = "ObjectB"
    val bbjectAA = "ObjectAA"
    val objectBB = "ObjectBB"

    val expectedMatchResults = List(
      ModelADefaultObject.copy(
        objectA = ModelBDefaultObject.copy(objectA, 3),
        objectB = ModelBDefaultObject.copy(ObjectB, 3)
      ),
      ModelADefaultObject.copy(
        objectA = ModelBDefaultObject.copy(bbjectAA, 1),
        objectB = ModelBDefaultObject.copy(objectBB, 0)
      )
    )

    assert(
      expectedMatchResults === FileToModelParser.parse(
        List(modelAs_1, modelAs_2)
      )
    )
  }
}
