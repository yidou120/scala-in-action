package com.edou.scala.tuplelearning

object TupleMain {
  def main(args: Array[String]): Unit = {
    val tup = ("google", 1999): Tuple2[String, Int]
    // _n 代表访问元组的第n个元素 从1开始
    println(tup._1)
    println(tup._2)

    var twoNumer = List((1,2),(3,-1))
    for ((n1, n2) <- twoNumer) {
      println(n1 * n2)
    }

    val distanceCountry = List(("Beijing",200), ("HRB", 1000), ("Lanzhou", 1000))
    distanceCountry.foreach(
      tuple => {
        tuple match {
          case ("Beijing",dist) => println(s"${tuple._1} + $dist")
          case t if(t._1 == "HRB") => println(s"${t._1}")
          case _ => println("else")
        }
      }
    )
  }
}