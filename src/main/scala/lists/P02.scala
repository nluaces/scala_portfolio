package lists

import java.util.NoSuchElementException

/*P02 (*) Find the last but one element of a list.
Example:

  scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5
 */

object P02 {

  def penultimate(list: List[Int]): Int = penultimateRecursive(list, list.head)

  def penultimateRecursive(list: List[Int], last:Int):Int = list match {
    case x::Nil => last
    case head::tail => penultimateRecursive(tail, head)
    case _ => throw new NoSuchElementException()
  }
}
