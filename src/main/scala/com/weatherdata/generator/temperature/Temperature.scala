package com.weatherdata.generator.temperature

import com.weatherdata.generator.constants.EarthTemperature
import com.weatherdata.generator.gps.GPSUtils
import com.weatherdata.generator.models.Elevation
import com.weatherdata.generator.regions.Regions

import scala.util.Random

/**
  * Created by pnagarjuna on 09/05/16.
  */
object Temperature {

  def getApproxTemp(geoCoordinate: (Double, Double))(isDayTime: Boolean = true): Double = {
    val latitudeOnlyGeoCoord = (geoCoordinate._1, 0d)
    val distance = Math.abs(GPSUtils.distance(latitudeOnlyGeoCoord, (0d, 0d)))
    val region = Regions.getRegion(distance)
    if (isDayTime) {
      val (max, min) = EarthTemperature.avgDayTemps(region)
      val randNum = Random.nextInt(max - min)
      min + randNum
    } else {
      val (max, min) = EarthTemperature.avgNightTemps(region)
      val randNum = Random.nextInt(max - min)
      min + randNum
    }
  }

  def elevationFactor(temp: Double)(elevation: Elevation): Double = {
      temp - (elevation.value / 1000) * 9.8d
  }


}
