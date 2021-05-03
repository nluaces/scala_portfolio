package lists

import org.scalatest.funsuite.AnyFunSuite
import lists.P02

class P02Test extends AnyFunSuite {
    test("penultimate returns the last element") {
        assert (P02.penultimate(List(1, 1, 2, 3, 5, 8)) === 5)
    }

    test("penultimate returns the last element within a list with a Nil") {
        assert (P02.penultimate(5::Nil) === 5)
    }

    test("penultimate returns the unique element") {
        assert (P02.penultimate(List(1)) === 1)
    }

    test("penultimate throws an exception because of not having elements") {
        intercept[NoSuchElementException] {
            P02.penultimate(List())
        }
    }
}