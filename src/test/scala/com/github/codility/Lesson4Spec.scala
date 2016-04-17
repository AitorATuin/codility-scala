package com.github.codility

import com.girhub.codility.Lesson4
import com.girhub.codility.Lesson4._
import org.specs2._

class Lesson4Spec extends mutable.Specification {
  "FromRiverOne" >> {
    "1" >> {
      FromRiverOne.solution(5 ,Array(1,3,1,4,2,3,5,4)) must be_==(6)
    }
    "2" >> {
      FromRiverOne.solution(1 ,Array(1,3,1,4,2,3,5,4)) must be_==(0)
    }
    "3" >> {
      FromRiverOne.solution(4 ,Array(1,3,1,4,2,3,5,4)) must be_==(4)
    }
    "4" >> {
      FromRiverOne.solution(7 ,Array(1,3,1,4,2,3,5,7)) must be_==(-1)
    }
    "5" >> {
      FromRiverOne.solution(7 ,Array(1,3,1,4,2,3,5,6,7)) must be_==(8)
    }
    "6" >> {
      FromRiverOne.solution(2 ,Array(1,3,1,4,2,3,5,4)) must be_==(4)
    }
    "7" >> {
      FromRiverOne.solution(3 ,Array(1,3,1,4,2,3,5,4)) must be_==(4)
    }
    "5" >> {
      FromRiverOne.solution(5 ,Array(1,3,1,4,2,3,5,4)) must be_==(6)
    }
  }
  "MaxCounters" >> {
    "1" >> {
      MaxCounters.solution(5, Array(3)) must be_==(Array(0,0,1,0,0))
    }
    "2" >> {
      MaxCounters.solution(5, Array(3,4)) must be_==(Array(0,0,1,1,0))
    }
    "3" >> {
      MaxCounters.solution(5, Array(3,4,4)) must be_==(Array(0,0,1,2,0))
    }
    "4" >> {
      MaxCounters.solution(5, Array(3,4,4,6)) must be_==(Array(2,2,2,2,2))
    }
    "5" >> {
      MaxCounters.solution(5, Array(3,4,4,6,1)) must be_==(Array(3,2,2,2,2))
    }
    "6" >> {
      MaxCounters.solution(5, Array(3,4,4,6,1,4)) must be_==(Array(3,2,2,3,2))
    }
    "7" >> {
      MaxCounters.solution(5, Array(3,4,4,6,1,4,4)) must be_==(Array(3,2,2,4,2))
    }
    "8" >> {
      MaxCounters.solution(5, Array(3,4,4,6,1,4,4,8)) must be_==(Array(4,4,4,4,4))
    }
    "9" >> {
      MaxCounters.solution(5, Array(3,4,4,6,1,4,4,8,2)) must be_==(Array(4,5,4,4,4))
    }
    "10" >> {
      MaxCounters.solution(0, Array(3,4,4,6,1,4,4,8,2)) must be_==(Array())
    }
    "11" >> {
      MaxCounters.solution(1, Array(3,4,4,6,1,4,4,8,2,1)) must be_==(Array(2))
    }
  }
}
