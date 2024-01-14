import org.scalatest.funsuite.AnyFunSuite
import com.app_x_scala.model._
import com.app_x_scala.core.CoreComputation
import scala.collection.mutable.LinkedHashMap
import com.app_x_scala.model.{ModelADefaultObject, ModelBDefaultObject}

class CoreComputationUnitTests extends AnyFunSuite {
  test("Can compute") {
    val coreComputation = new CoreComputation()
    assert(
      List(ComputationResult(1, "", 1)) === coreComputation.compute(
        List(ModelADefaultObject.copy())
      )
    )
  }
}
