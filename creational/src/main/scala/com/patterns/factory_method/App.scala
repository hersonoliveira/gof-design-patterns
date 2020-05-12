package com.patterns.factory_method

object App {
  def main(args: Array[String]): Unit = {
    val winDialog = new WindowsDialog
    winDialog.createButton
  }
}
