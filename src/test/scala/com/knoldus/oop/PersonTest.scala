package com.knoldus.oop

import org.scalatest.flatspec.AnyFlatSpec

class PersonTest extends AnyFlatSpec {
  val personOne : Person = new Person("Prakhar", 24)

  "A person" should "be less than other person it it is younger and has the same name" in {
    val personTwo : Person = new Person("Prakhar", age = 25)
    assert(personOne < personTwo)
    assert(personOne.comparePerson(personTwo))
  }

  it should "be greater than other person it it is older and has the same name" in {
    val personTwo : Person = new Person("Prakhar", age = 25)
    assert(personTwo > personOne)
  }

  it should "be less than other person if it has a shorter name" in {
    val personTwo : Person = new Person("Prakhar Deep", 23)
    assert(personOne < personTwo)

    personTwo.age = 25

    assert(personOne < personTwo)
  }

  it should "not be less than other person if it older and has the same name" in {
    val personTwo : Person = new Person("Prakhar", 23)

    assert(!(personOne < personTwo))
  }

  it should "not be less than other person if it has a longer name" in {
    val personTwo : Person = new Person("Rahul",  25)
    assert(!(personOne < personTwo))

    personTwo.age = 23

    assert(!(personOne < personTwo))
  }
}
