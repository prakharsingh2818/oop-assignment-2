package com.knoldus.oop

trait Ordered[T] {
  //Checks if the Person object calling the method is less than the Person object passed as parameter
  def < (personTwo : Person) : Boolean

  //Checks if the Person object calling the method is greater than the Person object passed as parameter
  def > (personTwo : Person) : Boolean

  //Checks if the Person object calling the method is less than the Person object passed as parameter
  //Performs the same function as method 1 '<'
  def comparePerson (personTwo: Person) : Boolean
}
