package com.edou.scala.collectionlearning

object ListMain {
  def main(args: Array[String]): Unit = {
    var list:List[Int] = 1::(2::(3::Nil))
    var list1:List[Int] = List(1,2,3)
    list.foreach(l => println(l))
  }
}
