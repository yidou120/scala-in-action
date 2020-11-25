package com.edou.scala.listlearning

object ListMain {
  def main(args: Array[String]): Unit = {
    var list:List[Int] = 1::(2::(3::Nil))
    list.foreach(l => println(l))
  }
}
