package com.github.codility

import com.girhub.codility.Lesson5
import com.girhub.codility.Lesson5._
import org.specs2._

class Lesson5Spec extends mutable.Specification with org.specs2.ScalaCheck {
  "GenomicRangeQuery" >> {
    "1" >> {
      GenomicRangeQuery.solution("CAGCCTA" ,Array(2, 5, 0), Array(4, 5, 6)) must be_==(Array(2,4,1))
    }
    "2" >> {
      GenomicRangeQuery.solution("C" ,Array(0), Array(0)) must be_==(Array(2))
    }
    "3" >> {
      GenomicRangeQuery.solution("CA" ,Array(0,0,1), Array(0,1,1)) must be_==(Array(2,1,1))
    }
    "4" >> {
      GenomicRangeQuery.solution("AC" ,Array(0,0,1), Array(0,1,1)) must be_==(Array(1,1,2))
    }
    "5" >> {
      GenomicRangeQuery.solution("CAGCCTA" ,Array(0), Array(1)) must be_==(Array(1))
    }
  }

  "MinAvgTwoSlice" >> {
    "1" >> {
      MinAvgTwoSlice.solution(Array(4, 2, 2, 5, 1, 5, 8)) must be_==(1)
    }
  }
}
