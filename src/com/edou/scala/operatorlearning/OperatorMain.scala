package com.edou.scala.operatorlearning

object OperatorMain {
  def main(args: Array[String]): Unit = {
    """
      |在scala当中 方法即是运算符 方法用作中缀运算符的前提是
      |方法必须只有一个参数
    """.stripMargin

    val o1 = Operator(10.8,11.1)
    val o2 = Operator(10.2,11.9)
    val result = o1 + o2
    val out = o1.+(o2)
    println(result.x == out.x && result.y == out.y)

  }
}
case class Operator(x:Double, y:Double){
  def +(that:Operator) = Operator(this.x + that.x, this.y + that.y)
}
