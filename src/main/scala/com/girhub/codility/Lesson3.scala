package com.girhub.codility

object Lesson3 {
  object FrogJmp {
    def solution(X: Int, Y: Int, D: Int): Int =
      if ((Y - X) % D > 0) ((Y - X) / D) + 1
      else (Y - X) / D
  }
  object TapeEquilibrium {
    def solution(A: Array[Int]) = {
      def _sum(xs: List[Int], xssum: List[Int]): List[Int] = (xs match {
        case Nil => xssum
        case x :: xxs => _sum(xxs, (xssum.headOption.getOrElse(0) + x) :: xssum)
      })
      val xs1 = _sum(A.toList, List()).reverse.init
      val xs2 = _sum(A.toList.reverse, List()).drop(1)
      xs2.zip(xs1).map((p) => Math.abs(p._2 - p._1)).sorted.head
    }
  }
}
