package com.weatherdata.generator.constants

import com.weatherdata.generator.regions.Regions

/**
  * Created by pnagarjuna on 09/05/16.
  */
object EarthTemperature {

  val maxTempEarth = 58 //max temp found on earth
  val minTempEarth = -88 //min temp found on earth

  val avgDayTemps = Map(Regions.Equator -> 40,
    Regions.Tropic -> 30,
    Regions.ABOVE_TROPIC -> 15,
    Regions.Poles -> -2)

  val avgNightTemps = Map(Regions.Equator -> 25,
    Regions.Tropic -> 15,
    Regions.ABOVE_TROPIC -> 7,
    Regions.Poles -> -10)


}
