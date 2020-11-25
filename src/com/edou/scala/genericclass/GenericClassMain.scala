package com.edou.scala.genericclass

object GenericClassMain {
  def main(args: Array[String]): Unit = {
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    println(stack.pop)
    println(stack.pop)
  }
}

class Stack[A] {
  private var elements:List[A] = Nil
  def push(x : A) = {
    // 将x加入到list头部 其实就是元素的组合
    elements = x :: elements
  }
  def peek : A = {
    elements.head
  }
  def pop : A = {
    val element = peek
    elements = elements.tail
    element
  }
}
