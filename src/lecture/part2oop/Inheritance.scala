package lecture.part2oop

object Inheritance extends App {
  //single class inheritance
  sealed class Animal {
    val creatureType = "wild"
    def eat = println("nomnom")
  }

  class Cat extends Animal {
  }

  val cat = new Cat
  cat.eat


  //constructors

  class Person(name: String, age: Int) {
    def this (name: String) = this (name, 0)
  }
  class Adult (name: String, age: Int, idCard: String) extends Person(name)

  //overriding
  class Dog(override val creatureType: String) extends Animal {
   // override val creatureType: String = "domesic"
    override def eat: Unit ={
      super.eat
      println("crunch, crunch")
    }
  }
  val dog = new Dog("k9")
  dog.eat
  println(dog.creatureType)

  //type substitution
  val unknowAnimal: Animal = new Dog("k9")
  unknowAnimal.eat

  //overRindig OverLoading
  // super
  //preventing overrides KeyWord "FINAL"
}
