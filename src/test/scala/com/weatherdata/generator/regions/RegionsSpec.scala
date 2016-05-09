package com.weatherdata.generator.regions

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by pnagarjuna on 09/05/16.
  */
class RegionsSpec extends FlatSpec with Matchers {

  "distance 1500 * 1000" should "lie in equator region" in {
    Regions.getRegion(1500000) should be (Regions.Equator)
  }

  "distance 2000 * 1000" should "lie in tropic region" in {
    Regions.getRegion(2000000) should be (Regions.Tropic)
  }


  "distance 7000 * 1000" should "lie in above tropic region" in {
    Regions.getRegion(7000000) should be (Regions.ABOVE_TROPIC)
  }

}
