package com.weatherdata.generator.constants

import com.weatherdata.generator.regions.Regions

/**
  * Created by pnagarjuna on 09/05/16.
  */
object EarthTemperature {

  val maxTempEarth = 58 //max temp found on earth
  val minTempEarth = -88 //min temp found on earth

  //sea level max min temperatures
  val avgDayTemps = Map(Regions.Equator -> (40, 30),
    Regions.Tropic -> (30, 20),
    Regions.ABOVE_TROPIC -> (15, 10),
    Regions.Poles -> (-2, -5))

  val avgNightTemps = Map(Regions.Equator -> (25, 15),
    Regions.Tropic -> (15, 10),
    Regions.ABOVE_TROPIC -> (7, 0),
    Regions.Poles -> (-10, -20))


}
