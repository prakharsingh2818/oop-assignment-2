package com.knoldus.oop

class Person(var name: String, var age: Int) extends Ordered[Person] {

  override def < (that: Person): Boolean = {
    if(this.name == that.name) {
      if (this.age < that.age)
        true
      else
        false
    }
    else {
      if (this.name.length < that.name.length)
        true
      else
        false
    }
  }

  override def >(that: Person): Boolean = {
    if(this.name == that.name) {
      if (this.age > that.age)
        true
      else
        false
    }
    else {
      if (this.name.length > that.name.length)
        true
      else
        false
    }
  }

  override def check(that: Person): Boolean = {
      if(this.name == that.name) {
        if (this.age < that.age)
          true
        else
          false
      }
      else {
        if (this.name.length < that.name.length)
          true
        else
          false
      }
  }
}




