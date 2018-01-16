package workingwithlists


import org.scalatest.FunSuite


class WorkingWithListsSuite extends FunSuite{

  import workingwithlists.P01.last

  test("last returns the last element") {

    assert(last(List(1,1,2,3,5,8)) === 8)
  }


}
