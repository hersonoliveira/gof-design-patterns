package com.patterns.builder

trait UserBuilderBase {
  def setFirstName(firstName: String): UserBuilder

  def setLastName(lastName: String): UserBuilder

  def setAge(age: Int): UserBuilder

  def setPhone(phone: String): UserBuilder

  def setAddress(address: String): UserBuilder

  def build: User
}

class UserBuilder extends UserBuilderBase {
  private var firstName = ""
  private var lastName = ""
  private var age = 0
  private var phone = ""
  private var address = ""

  override def setFirstName(firstName: String): UserBuilder = {
    this.firstName = firstName
    this
  }

  override def setLastName(lastName: String): UserBuilder = {
    this.lastName = lastName
    this
  }

  override def setAge(age: Int): UserBuilder = {
    this.age = age
    this
  }

  override def setPhone(phone: String): UserBuilder = {
    this.phone = phone
    this
  }

  override def setAddress(address: String): UserBuilder = {
    this.address = address
    this
  }

  override def build: User =
    User(firstName, lastName, age, phone, address)
}
