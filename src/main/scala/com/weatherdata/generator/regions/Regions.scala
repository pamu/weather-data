package com.weatherdata.generator.regions

import com.weatherdata.generator.constants.EarthDistance

/**
  * Created by pnagarjuna on 09/05/16.
  */
object Regions extends Enumeration {
  val Equator, Tropic, ABOVE_TROPIC, Poles = Value

  def getRegion(distance: Double): Regions.Value = distance match {
    case x if x <= EarthDistance.equatorPoleDistance * 15 / 100 => Equator
    case x if x <= EarthDistance.equatorPoleDistance * 35 / 100 => Tropic
    case x if x <= EarthDistance.equatorPoleDistance * 35 / 100 => ABOVE_TROPIC
    case _ => Poles
  }
}