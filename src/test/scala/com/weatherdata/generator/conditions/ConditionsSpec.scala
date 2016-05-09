package com.weatherdata.generator.conditions

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by pnagarjuna on 09/05/16.
  */
class ConditionsSpec extends FlatSpec with Matchers {

  "Temperature +ve and humidity more than 80" should "be rain" in {
    Conditions.getCondition(20, 80) should be (Conditions.Rain)
  }

  "Temperature +ve and humidity less than 80" should "be sunny" in {
    Conditions.getCondition(20, 70) should be (Conditions.Sunny)
  }

  "Temperature -ve and humidity more than 80" should "be show snow" in {
    Conditions.getCondition(-20, 80) should be (Conditions.Snow)
  }

  "Temperature +ve and humidity less than 80" should "be Cold" in {
    Conditions.getCondition(-20, 70) should be (Conditions.Cold)
  }

}
