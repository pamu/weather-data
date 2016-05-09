package com.weatherdata.generator.gps

import org.scalatest.{FlatSpec, Matchers}

import scala.util.Random

/**
  * Created by pnagarjuna on 09/05/16.
  */
class GPSUtilsSpec extends FlatSpec with Matchers {

  "Distance between same GPS coordinates" should "be nearly zero" in {
    val lat = Random.nextDouble()
    val long = Random.nextDouble()
    val location = (lat, long)
    Math.round(GPSUtils.distance(location, location)) should be (0)
  }

  "Distance between random GPS coordinates " should " be greater than 0" in {
    val point1 = (Random.nextDouble(), Random.nextDouble())
    val point2 = (Random.nextDouble(), Random.nextDouble())
    GPSUtils.distance(point1, point2) should be > 0.0d
  }

  "Hyderabad" should "is 200 kms away Warangal" in {
    val hyderabad = (17.4121531, 78.1278513)
    val warangal = (7.958299, 79.5341463)
    GPSUtils.distance(hyderabad, warangal) should be < 200 * 1000d
  }

  "PI radians" should "be 180 degrees nearly" in {
    Math.PI.toDegrees should be (180d)
  }
}
