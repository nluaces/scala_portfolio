package lists

import org.scalatest.funsuite.AnyFunSuite
import lists.P01.last

class P01Test extends AnyFunSuite{

  test("last returns the last element") {
    assert(last(List(1,1,2,3,5,8)) === 8)
  }

  test("last returns the last element within a list with a Nil") {
    assert(last(5::Nil) === 5)
  }

  test("last returns the unique element") {
    assert(last(List(1)) === 1)
  }

  test("last throws an exception because of not having elements") {
    intercept[NoSuchElementException] {last(List())}
  }
}
