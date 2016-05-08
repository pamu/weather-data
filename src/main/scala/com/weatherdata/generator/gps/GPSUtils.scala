package com.weatherdata.generator.gps

object GPSUtils {

  def distance(dest: (Double, Double), src: (Double, Double)): Double = {
    val x1 = dest._1.toRads
    val y1 = dest._2.toRads
    val x2 = src._1.toRads
    val y2 = src._2.toRads

    val dLat = Math.abs(dest._1 - src._1).toRads
    val dLong = Math.abs(dest._2 - src._2).toRads

    val radius = 6371000 //meters
    val a = Math.pow(Math.sin(dLat/2), 2) * Math.pow(Math.sin(dLat/2), 2) + Math.sin(dLong/2) * Math.sin(dLong/2) * Math.cos(x1) * Math.cos(x2)
    val c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a))

    radius * c
  }

  implicit class RadUtils(degrees: Double) {
    def toRads: Double = degrees * (Math.PI/180d)
  }

}