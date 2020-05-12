package com.patterns.factory_method

// Creator Interface
trait Dialog {
  def createButton: Button
}

// Concrete Creator
class WindowsDialog extends Dialog {
  override def createButton: Button = new WindowsButton
}

class WebDialog extends Dialog {
  override def createButton: Button = new HTMLButton
}
