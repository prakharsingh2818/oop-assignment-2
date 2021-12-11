package com.knoldus.oop

object Tester extends App{

  val personOne : Person = new Person("Prakhar", 24)
  val personTwo : Person = new Person("Prakhar", 25)

  if(personOne < personTwo)
    println("Person One is less than Person Two")
  else
    println("Person One is greater than Person Two")

  val personThree : Person = new Person("Prakhar", 23)

  if(personOne > personThree)
    println("Person One is greater than Person Three")
  else
    println("Person One is less than Person Three")

  val personFour : Person = new Person("Prakhar Deep", 24)

  if(personOne.comparePerson(personFour))
    println("Person One is less than Person Four")
  else
    println("Person One is greater than Person Two")
}