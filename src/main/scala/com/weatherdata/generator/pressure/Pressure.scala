package com.weatherdata.generator.pressure

import com.weatherdata.generator.constants.EarthPressure
import com.weatherdata.generator.models.Elevation

/**
  * Created by pnagarjuna on 09/05/16.
  */
object Pressure {

  /**
    * Pressure decreases exponentially with elevation
    * ref: http://www.regentsprep.org/regents/math/algtrig/atp8b/exponentialresource.htm
    */

  def pressureAt(elevation: Elevation): Double = {
    EarthPressure.pressureSeaLevel * Math.pow(Math.E,
      -(elevation.value / EarthPressure.atmosphereScaleHeight.value))
  }

}
