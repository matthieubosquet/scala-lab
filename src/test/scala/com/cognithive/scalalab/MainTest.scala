package com.cognithive.scalalab

import org.scalatest._

class AppTest extends FlatSpec {
  "A program" should "be tested" in {
    assert(true == true)
  }

  it should "run" in {
    assert(false != true)
  }
}
