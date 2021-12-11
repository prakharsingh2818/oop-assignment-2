# oop-assignment-2

### The project compares 2 person objects using <pre>1. Operator overloading of '<'   '>'  operators </pre> <pre>2. Providing check() method </pre> and follows the below criteria while comparing:
  - If they have the same name then they are compared based on their age
  - If they have different names then they are compared based on their name length

<pre><b>Example</b>: PersonOne's name is Prakhar and his age is 24
PersonTwo's name is Gaurav and his age is 25
PersonThree's name is Prakhar and his age is 26

PersonOne <b><</b> PersonTwo will return false following criteria 2
PersonOne <b><</b> PersonThree will return true following criteria 1

Similarly, 
PersonOne <b>></b> PersonTwo will return true
PersonOne <b>></b> PersonThree will return false

PersonOne.<b>comparePerson</b>(PersonTwo) will return false
PersonOne.<b>comparePerson</b>(PersonThree) will return true</pre>

### The project contains: 
  - ***Ordered.scala***: Scala Trait which contains method definition for comparision 
  - ***Person.scala***: Which defines a person based on their name and age. It also contains the method for comparision of 2 person objects
  - ***Tester.scala***: Object to test the functionality of the project
  - ***PersonTest.scala***: Scala class which performs unit testing on the project using AnyFlatSpec style of ScalaTest
  
### To run the project execute the Tester.scala class. One can make changes to see various scenarios  
  
 
