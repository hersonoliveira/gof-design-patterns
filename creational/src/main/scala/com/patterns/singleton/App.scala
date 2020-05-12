package com.patterns.singleton

object App {
  def main(args: Array[String]): Unit = {
    val s1 = Singleton
    val s2 = Singleton
    println(s1 == s2)
  }
}
