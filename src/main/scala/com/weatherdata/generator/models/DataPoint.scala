package com.weatherdata.generator.models

import java.text.SimpleDateFormat
import java.util.Date

/**
  * Created by pnagarjuna on 09/05/16.
  */
case class DataPoint (code: String, geo: (Double, Double), elevation: Elevation,
                      date: Date, condition: String, temperature: Double, pressure: Double, humidity: Int) {
  override def toString: String = {

    val symbol = temperature match {
      case x if x > 0 => "+"
      case x if x < 0 => "-"
      case x if x == 0 => ""
    }

    val tempStr = symbol + String.format("%.2f", java.lang.Double.valueOf(temperature))

    s"""$code|${String.format("%.2f", java.lang.Double.valueOf(geo._1))}, ${String.format("%.2f", java.lang.Double.valueOf(geo._2))}, ${String.format("%.0f", java.lang.Double.valueOf(elevation.value))}|${new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss'Z'").format(date)}|${condition}|${tempStr}|${String.format("%.1f", java.lang.Double.valueOf(pressure))}|${humidity}"""
  }
}

