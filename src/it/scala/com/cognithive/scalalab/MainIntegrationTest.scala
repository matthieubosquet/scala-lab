package com.cognithive.scalalab

import org.scalatest._

class AppIntegrationTests extends FlatSpec {
  "A program" should "have integration tests" in {
    assert(true == true)
  }

  it should "run" in {
    assert(false != true)
  }
}
