package com.github.codility

import com.girhub.codility.Lesson1
import com.girhub.codility.Lesson1.BinaryGap
import org.specs2._

class Lesson1Spec extends mutable.Specification {
  "BinaryGapSpec" >> {
    "1041" >> {
      BinaryGap.solution(1041) must be_==(5)
    }
    "3" >> {
      BinaryGap.solution(3) must be_==(0)
    }
    "4" >>  {
      BinaryGap.solution(4) must be_==(0)
    }
    "9" >> {
      BinaryGap.solution(9) must be_==(2)
    }
    "1" >> {
      BinaryGap.solution(1) must be_==(0)
    }
    "13" >> {
      BinaryGap.solution(13) must be_==(1)
    }
    "0" >> {
      BinaryGap.solution(0) must be_==(0)
    }
    "5" >> {
      BinaryGap.solution(5) must be_==(1)
    }
  }
}
