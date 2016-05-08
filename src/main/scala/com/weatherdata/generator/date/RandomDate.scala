package com.weatherdata.generator.date

import java.util.{Calendar, Date, TimeZone}

import scala.util.Random

/**
  * Created by pnagarjuna on 09/05/16.
  */
object RandomDate {

  def getDate(minYear: Int, maxYear: Int): Date = {
    val cal = Calendar.getInstance(TimeZone.getDefault)
    cal.set(Calendar.YEAR, minYear + Random.nextInt(Math.abs(maxYear - minYear)))
    cal.set(Calendar.DAY_OF_YEAR, Random.nextInt(cal.getActualMaximum(Calendar.DAY_OF_YEAR)))
    cal.getTime
  }

}
