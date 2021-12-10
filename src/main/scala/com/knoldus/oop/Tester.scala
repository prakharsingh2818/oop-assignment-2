package com.knoldus.oop

object Tester extends App{

  val personOne : Person = new Person("Prakhar", 24)
  val personTwo : Person = new Person("Prakhar", 25)

  println(personOne < personTwo)

  val personThree : Person = new Person("Prakhar", 23)

  println(personOne < personThree)

  val personFour : Person = new Person("Prakhar Deep", 24)
  println(personOne < personFour)




}