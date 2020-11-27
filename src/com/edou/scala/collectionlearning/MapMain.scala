package com.edou.scala.collectionlearning

object MapMain {
  def main(args: Array[String]): Unit = {
    val colors = Map("red" -> "#FF0000",
      "azure" -> "#F0FFFF",
      "peru" -> "#CD853F")
    val colors2 = Map("blue" -> "#0033FF",
      "yellow" -> "#FFFF00",
      "red" -> "#FF0000")
    val emptyMap:Map[Char,Int] = Map()
    // 获取keys
    colors.keys.foreach(
      key => {
        println(key)
        println(colors(key))
      }
    )
    println(emptyMap.isEmpty)
    // 合并两个Map 相同key会被覆盖 只保留一个 值为最右边的
    println(colors.++(colors2))
    println(colors ++ colors2)

    // 输出map的keys values
    colors.keys
    colors.values
    // map中包含指定key
    colors.contains("red")
  }
}
