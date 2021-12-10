package com.knoldus.oop

trait Ordered[T] {
  def < (that : Person) : Boolean

  def > (that : Person) : Boolean

  def check (that: Person) : Boolean
}
