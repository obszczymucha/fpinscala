package fpinscala.gettingstarted

import org.scalatest.{FunSpec, Matchers}
import fpinscala.datastructures.List
import fpinscala.datastructures.Nil
import fpinscala.datastructures.List.{setHead, tail}

class DataStructuresSpec extends FunSpec with Matchers {
  describe("tail()") {
    it("should return List(2,3) for given List(1,2,3)") {
      tail(List(1, 2, 3)) shouldBe List(2, 3)
    }

    it("should return Nil for given Nil") {
      tail(Nil) shouldBe Nil
    }
  }

  describe("setHead()") {
    it("should return the list with given element if given list is Nil") {
      setHead(Nil, 1337) shouldBe List(1337)
    }

    it("should return List(1337) for given List(42)") {
      setHead(List(42), 1337) shouldBe List(1337)
    }

    it("should return List(42, 1337) for given List(1, 1337) and element 42") {
      setHead(List(1, 1337), 42) shouldBe List(42, 1337)
    }
  }
}
