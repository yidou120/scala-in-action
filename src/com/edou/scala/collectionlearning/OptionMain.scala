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

    // 如何使用Option避免空指针,不用检查Option是否为None
    // 如果Option为None,调用方法肯定会抛出NoSuchElementException异常
    // 1.我们使用for遍历Option,把处理逻辑写道for循环里就可以了,如果为None,不会走循环体的内容
    for (x <- map1) {
      // 具体的处理逻辑
    }
    // 2.也可以使用map方法写具体的逻辑,如果Option为None不会走map里面的逻辑,直接返回None,如果为Some走具体的逻辑
    // map的返回值要么是Some 要么是None
  }
}
