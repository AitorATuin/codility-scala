package com.girhub.codility

object Lesson2 {
  object CyclicRotation {
    def solution(A: Array[Int], K: Int): Array[Int] = {
      val n = A.length
      if (n == 0) A
      else {
        val s1 = n - (K % n)
        (A.toList.drop(s1) ++ A.toList.take(s1)).toArray
      }
    }
  }
  object OddOccurrencesInArray {
    def solution(A: Array[Int]): Int = {
      def _solution(ys: List[Int]): Int = ys match {
        case x :: Nil => x
        case y :: x :: xs  if x == y => _solution(xs)
        case y :: x :: xs => y
      }
      _solution(A.toList.sorted)
    }
  }
}
