package com.girhub.codility

object Lesson1 {
  object BinaryGap {
    def solution(N: Int): Int = {
      def _solution(N: Int, t: Boolean, R: Int, C: Int): Int = (N/2, N%2) match {
        case (0, _)              => if (R > C) R else C
        case (next, 0) if t      => _solution(next, t, R+1, C)
        case (next, 0)           => _solution(next, t, R, C)
        case (next, 1) if R >= C => _solution(next, true, 0, if (R >= 0) R else C)
      }
      _solution(N, false, 0, 0)
    }
  }
}
