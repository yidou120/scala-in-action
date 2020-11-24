package com.edou.scala.classlearning
// 如果类中的主构造函数的参数不声明var/val类型,默认为val,而且为私有,只能在类中访问
class Point(var x:Int , var y:Int) {
  def move(dx:Int, dy:Int) = {
    x = x + dx
    y = y + dy
  }

  override def toString: String = {
    s"($x, $y)"
  }
}
class Point1 {
  private var _x = 0
  private var _y = 0
  private val bound = 100
  // 相当于get方法
  def x = _x
  def y = _y
  // _= 相当于set方法
  def x_= (newValue : Int) : Unit = {
    if(newValue < bound) _x = newValue else printWraning
  }
  def y_= (newValue : Int) : Unit = {
    if(newValue < bound) _y = newValue else printWraning
  }
  private def printWraning : Unit = {
    println("number out of bounds")
  }
}
object ClassMain {
  def main(args: Array[String]): Unit = {
/*    val p1 = new Point(1,2)
    p1.move(2,3)
    p1.move(dx = 1, dy = 2)
    println(p1)*/
    val p2 = new Point1
    println(p2.x)
    p2.x = 10
    println(p2.x)
    p2.y = 101
    println(p2.y)
  }
}
