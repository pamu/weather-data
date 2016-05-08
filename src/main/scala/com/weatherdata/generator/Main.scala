package com.weatherdata.generator

/**
  * Created by pnagarjuna on 09/05/16.
  */
object Main {

  def main(args: Array[String]): Unit = {
    println("Generating Data ...")
    WeatherDataGenerator.generate.take(100).foreach(println)
  }

}
