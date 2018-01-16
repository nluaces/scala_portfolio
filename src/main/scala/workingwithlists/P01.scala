package workingwithlists

/**
  * P01 (*) Find the last element of a list.
    Example:

    scala> last(List(1, 1, 2, 3, 5, 8))
    res0: Int = 8
  */

object P01 extends App{


  def last(list: List[Int]):Int = list match {
    case List(x) => x
    case x::xs => last(xs)
  }

}

