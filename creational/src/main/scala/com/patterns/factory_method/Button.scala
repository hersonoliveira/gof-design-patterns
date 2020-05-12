package com.patterns.factory_method

// Product Interface
sealed trait Button {
  def onClick: String
}

// Concrete Product
class WindowsButton extends Button {
  override def onClick: String = "This is Windows button"
}

class HTMLButton extends Button {
  override def onClick: String = "This is HTML button"
}
