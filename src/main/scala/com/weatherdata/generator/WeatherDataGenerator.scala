package com.weatherdata.generator

import com.weatherdata.generator.cities.Cities
import com.weatherdata.generator.conditions.Conditions
import com.weatherdata.generator.date.RandomDate
import com.weatherdata.generator.humidity.Humidity
import com.weatherdata.generator.models.{DataPoint, Elevation}
import com.weatherdata.generator.pressure.Pressure
import com.weatherdata.generator.temperature.Temperature

import scala.util.Random

/**
  * Created by pnagarjuna on 09/05/16.
  */
object WeatherDataGenerator {

  def generate: Iterator[DataPoint] = new Iterator[DataPoint] {
    override def hasNext: Boolean = {
      true
    }

    override def next(): DataPoint = {
      val (city, geo) = Cities.cities(Random.nextInt(Cities.cities.length))
      val (lat, long, ele) = geo
      val elevation = Elevation(ele)
      val coord = (lat, long)
      val date = RandomDate.getDate(2016, 2020)
      val isDay = Random.nextBoolean()
      val temp = Temperature.elevationFactor(Temperature.getApproxTemp(coord)(isDay))(elevation)
      val pressure = Pressure.pressureAt(elevation)
      val humidity = Humidity.guessHumidity
      DataPoint(city, coord, elevation, date, Conditions.getCondition(temp, humidity).toString, temp, pressure, humidity)
    }

  }

}
