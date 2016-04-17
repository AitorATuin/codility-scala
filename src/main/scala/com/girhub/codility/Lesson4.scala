package com.girhub.codility

import scala.annotation.tailrec

object Lesson4 {
  object FromRiverOne {
    def solution(X: Int, A: Array[Int]): Int = {
      def _solution(X: Int, s: Set[Int], n:Int, ys: List[Int]): Int = ys match {
        case _ if s.isEmpty => n - 1
        case Nil => -1
        case x :: xs if x <= X => _solution(X, s - x, n+1, xs)
        case x :: xs => _solution(X, s, n+1, xs)
      }
      _solution(X, Set(1 to X:_*), 0, A.toList)
    }
  }
  object MaxCounters {
    def getMax(a: Int, b: Int) = if (a >= b) a else b
    def incItem(counters: Array[Int])(k: Int) = {
      val v = counters(k)
      counters(k) = v + 1
      v + 1 -> counters
    }
    /* This gives us a timeout for big inputs which implies all max_counter operations
     * 12.000s TIMEOUT ERROR, running time: >12.00 sec., time limit: 6.20 sec.
     *
     * A solution could be to delay the setting operation until the end, we only need to keep
     * the reference for the max value
     */
    def setAllItems(counters: Array[Int], n: Int)(v: Int): Array[Int] = {
      for (i <- 0 until n) {
        counters(i) = v
      }
      counters
    }
    def incItem2(counters: Array[Int], m: Option[Int])(k: Int) = {
      val v = counters(k)
      counters(k) = v + 1
      v + 1 -> counters
    }
    //counters.map(a => v)
    def solution(N: Int, A: Array[Int]): Array[Int] = {
      @tailrec
      def _solution(counters: Array[Int], m: Int, ops: Seq[Int]): Array[Int] = {
        val incCounter = incItem(counters) _
        val maxCounter = setAllItems(counters, N) _
        ops match {
          case Nil => counters
          case x :: xs if x <= N =>
            val (y, _counters) = incCounter(x - 1)
            _solution(_counters, getMax(y, m), xs)
          case x :: xs if x > N => _solution(maxCounter(m), m, xs)
        }
      }
      _solution(Array.fill(N)(0), 0, A.toList)
    }
  }
}
