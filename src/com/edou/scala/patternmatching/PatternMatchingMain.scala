package com.edou.scala.patternmatching

import scala.util.Random

object PatternMatchingMain {
  def main(args: Array[String]): Unit = {
    var number = Random.nextInt(10)
    def matchFirst(num : Int) = number match {
      case 1 => println("number is 1")
      case 2 => println("number is 2")
      case _ => println("other number")
    }
    println(number)
    matchFirst(number)

    // 案例类的匹配
    val phone = Phone(3999.9,"Apple")
    val computer = Computer(9999.99,"Dell")
    def matchDevice(device : Device) : String = {
      device match {
        case Phone(price,brand) => s"price is $price,and device can do this:${device.func}"
        case Computer(price,brand) => s"price is $price,and computer can do this:${device.func}"
        case _ => "not a device"
      }
    }
    println(matchDevice(phone))
    println(matchDevice(computer))

    // 只匹配类型
    def matchDeviceType(device: Device) : String = {
      device match {
        case phone:Phone => s"${phone.price}===${phone.func}"
        case computer: Computer => s"${computer.price}===${computer.func}"
        case _ => "not a device"
      }
    }
    println(matchDeviceType(phone))
    println(matchDeviceType(computer))
    println(matchDeviceType(null))

    // 带条件匹配 pattern gaurds 模式防卫
    var brandSeq = Seq("Dell","MI")
    def matchDeviceBrand(device: Device, brandSeqs : Seq[String]) : String = {
      device match {
        case Phone(price, brand) if brandSeqs.contains(brand) => s"pattern gaurds:$price===$brand"
        case Computer(price, brand) if brandSeqs.contains(brand) => s"pattern gaurds:$price===$brand"
        case other => matchDeviceType(other)
      }
    }
    println(matchDeviceBrand(phone, brandSeq))
    println(matchDeviceBrand(computer, brandSeq))

    // 密封类 关键字sealed
    // 特征和类可以使用密封关键字 被标识之后需要保证子类与父类在同一文件中 保证所有子类都是已知的
    sealed trait Person
    case class MalePerson(age : Int) extends Person
    case class FemalePerson(age : Int) extends Person
    // 这样模式匹配中无须指定匹配其他任何情况的 条件 也就是没有匹配到的默认条件
  }
}

trait Device {
  def func:String
}
case class Phone(price : Double, brand : String) extends Device {
  override def func = "phone could call anyone"
}
case class Computer(price : Double, brand : String) extends Device {
  override def func = "computer could work more effcient"
}
