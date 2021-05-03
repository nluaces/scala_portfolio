package lists

import org.scalatest.funsuite.AnyFunSuite

class WorkingWithListsSuite extends AnyFunSuite{

  import lists.P01.last

  test("last returns the last element") {

    assert(last(List(1,1,2,3,5,8)) === 8)
  }

}
