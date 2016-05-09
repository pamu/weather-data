package com.weatherdata.generator.temperature

import com.weatherdata.generator.models.Elevation
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by pnagarjuna on 09/05/16.
  */
class TemperatureSpec extends FlatSpec with Matchers {
  "Temperature " should "decrease by 9.8 for every 1000 meters" in {
    Temperature.elevationFactor(50)(Elevation(1000)) should be (50d - 9.8d)
  }
}
