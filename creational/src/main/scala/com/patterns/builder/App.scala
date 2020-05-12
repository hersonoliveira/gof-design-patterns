package com.patterns.builder

object App {
  def main(args: Array[String]): Unit = {
    val user1 = new UserBuilder()
      .setFirstName("John")
      .setAddress("Liverpool")
      .build
  }
}
