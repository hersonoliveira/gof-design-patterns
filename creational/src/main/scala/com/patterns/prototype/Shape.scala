package com.patterns.prototype

case class Shape (color: String, format: String)

object App {
  def main(args: Array[String]): Unit = {
    val b = Shape("red", "triangle")
    val c = b.copy()
    val d = b.copy(color = "green")

    println(b == c)
    println(b == d)
  }
}
