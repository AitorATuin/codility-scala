package com.github.codility

import com.girhub.codility.Lesson3
import com.girhub.codility.Lesson3._
import org.specs2._

class Lesson3Spec extends mutable.Specification {
  "FrogJmp" >> {
    "1" >> {
      FrogJmp.solution(10, 85, 30) must be_==(3)
    }
    "2" >> {
      FrogJmp.solution(0, 60, 30) must be_==(2)
   }
    "3" >> {
      FrogJmp.solution(0, 0, 100) must be_==(0)
    }
    "4" >> {
      FrogJmp.solution(0, 1, 100) must be_==(1)
    }
    "5" >> {
      FrogJmp.solution(0, 100, 1) must be_==(100)
    }
    "6" >> {
      FrogJmp.solution(0, 100, 2) must be_==(50)
    }
    "7" >> {
      FrogJmp.solution(0, 100, 3) must be_==(34)
    }
  }
  "TapeEquilibrium" >> {
    "1" >> {
      TapeEquilibrium.solution(Array(3,1,2,4,3)) must be_==(1)
    }
  }
}
