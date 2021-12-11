package com.knoldus.oop

class Person(var name: String, var age: Int) extends Ordered[Person] {

  override def < (personTwo: Person): Boolean = {
    //To check if both the persons have same name
    if(this.name.equalsIgnoreCase(personTwo.name)) {
      //To compare age of Person 1 and Person 2
      if (this.age < personTwo.age)
        true
      else
        false
    }
    else {
      //To compare length of names if person 1 and person 2 have different names
      if (this.name.length < personTwo.name.length)
        true
      else
        false
    }
  }

  override def >(personTwo: Person): Boolean = {
    //To check if both the persons have same name
    if(this.name.equalsIgnoreCase(personTwo.name)) {
      //To compare age of Person 1 and Person 2
      if (this.age > personTwo.age)
        true
      else
        false
    }
    //To compare length of names if person 1 and person 2 have different names
    else {
      if (this.name.length > personTwo.name.length)
        true
      else
        false
    }
  }

  override def comparePerson(personTwo: Person): Boolean = {
    //To check if both the persons have same name
      if(this.name.equalsIgnoreCase(personTwo.name)) {
        //To compare age of Person 1 and Person 2
        if (this.age < personTwo.age)
          true
        else
          false
      }
      //To compare length of names if person 1 and person 2 have different names
      else {
        if (this.name.length < personTwo.name.length)
          true
        else
          false
      }
  }
}




