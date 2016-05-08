package com.weatherdata.generator.conditions

/**
  * Created by pnagarjuna on 09/05/16.
  */
object Conditions extends Enumeration {
  val Rain, Snow, Sunny = Value

  def getCondition(temperature: Double, humidity: Int): Conditions.Value = {
    if (temperature > 0) {
      if (humidity > 80) Rain
      else Sunny
    } else Snow
  }

}
