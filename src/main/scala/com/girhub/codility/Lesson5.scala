package com.girhub.codility

object Lesson5 {
  object GenomicRangeQuery {
    sealed case class GenomicWeight(A: Int, C: Int, G: Int, T: Int) {
      def +(that: GenomicWeight) = GenomicWeight(
        A + that.A,
        C + that.C,
        G + that.G,
        T + that.T)
      def -(that: GenomicWeight) = GenomicWeight(
        Math.abs(A - that.A),
        Math.abs(C - that.C),
        Math.abs(G - that.G),
        Math.abs(T - that.T))
      def min = (A, C, G, T) match {
        case (a, _, _, _) if a > 0 => 1
        case (0, c, _, _) if c > 0 => 2
        case (0, 0, g ,_) if g > 0 => 3
        case (0, 0, 0 ,t) if t > 0 => 4
        case _ => 0
      }
    }
    object GenomicWeight {
      def fromChar(c: Char) = c match {
        case 'A' => GenomicWeight(1, 0, 0, 0)
        case 'C' => GenomicWeight(0, 1, 0, 0)
        case 'G' => GenomicWeight(0, 0, 1, 0)
        case 'T' => GenomicWeight(0, 0, 0, 1)
      }
      def zero = GenomicWeight(0, 0, 0, 0)
    }

    def solution(S: String, P: Array[Int], Q: Array[Int])  = {
      def prepareInput(xs: Array[Char]) =
        xs.map(GenomicWeight.fromChar).foldLeft(List[GenomicWeight]()) {
          case (a,b) => (a.headOption.getOrElse(GenomicWeight.zero) + b) :: a
        }

      val input = prepareInput(S.toArray).reverse.toArray

      P.zip(Q).map {
        case ((0, 0))           => input(0).min
        case ((0, j))           => input(j).min
        case ((i, j)) if i == j => (input(j) - input(i-1)).min
        case ((i, j))           => (input(i) - input(j)).min
      }
    }
  }

  object MinAvgTwoSlice {
    def solution(A: Array[Int]): Int = ???
  }
}
