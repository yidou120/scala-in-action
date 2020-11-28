package com.edou.scala.collectionlearning

object OptionMain {
  def main(args: Array[String]): Unit = {
    val map1 = Map("key1" -> "value1")
    // map的get方法返回的是一个Option[T]
    println(map1.get("key1"))
    println(map1.get("1"))

    // Some和None是Option的子类 如果获取一个值返回Some代表有值,None代表无值
    // 引入Option是为了避免空指针
    val hasValue:Option[Int] = Some(1)
    val noValue:Option[Int] = None

    // getOrElse方法 如果Option不为空,取它的值,为空取方法里的默认参数值
    println(hasValue.getOrElse(10))
    // Exception in thread "main" java.util.NoSuchElementException: None.get
//    noValue.get
    println(noValue.getOrElse(100))

    // 其他方法
    // isEmpty
    // filter
    // map
    // foreach(f) 如果为Some则应用f函数 为None则不处理
  }
}
