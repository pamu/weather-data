package com.weatherdata.generator.models

import java.util.Date

/**
  * Created by pnagarjuna on 09/05/16.
  */
case class DataPoint (code: String, geo: (Double, Double), elevation: Elevation,
                      date: Date, condition: String, temperature: Double, pressure: Double, humidity: Int) {

}

