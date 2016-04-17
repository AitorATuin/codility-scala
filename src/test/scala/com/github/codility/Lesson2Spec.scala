package com.github.codility

import com.girhub.codility.Lesson2
import com.girhub.codility.Lesson2._
import org.specs2._

class Lesson2Spec extends mutable.Specification {
  "CyclicRotationSpec" >> {
    "1" >> {
      CyclicRotation.solution(Array(1,2,3,4,5), 4) must be_==(Array(2,3,4,5,1))
    }
    "2" >> {
      CyclicRotation.solution(Array(1,2,3,4,5), 0) must be_==(Array(1,2,3, 4, 5))
    }
    "3" >> {
      CyclicRotation.solution(Array(1,2,3,4,5), 5) must be_==(Array(1,2,3, 4, 5))
    }
    "4" >> {
      CyclicRotation.solution(Array(1,2,3,4,5), 6) must be_==(CyclicRotation.solution(Array(1,2,3,4,5), 1))
    }
    "5" >> {
      CyclicRotation.solution(Array(1,2,3,4,5), 1) must be_==(Array(5,1,2,3,4))
    }
    "6" >> {
      CyclicRotation.solution(Array(3,8,9,7,6), 3) must be_==(Array(9,7,6,3,8))
    }
    "7" >> {
      CyclicRotation.solution(Array(), 3) must be_==(Array())
    }
  }

  "OddOccurrencesInArraySpec" >> {
    "1" >> {
      OddOccurrencesInArray.solution(Array(9, 3, 9, 3, 9, 9, 7)) must be_==(7)
    }
    "2" >> {
    OddOccurrencesInArray.solution(Array(9)) must be_==(9)
   }
    "3" >> {
      OddOccurrencesInArray.solution(Array(9,8,9,9,8)) must be_==(9)
    }
  }
}
