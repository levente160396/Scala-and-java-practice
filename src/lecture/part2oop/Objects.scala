package lecture.part2oop

object Objects extends App {

  // SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")
  object Person { //type + its only instance
    val N_EYES = 2
    def canFly: Boolean = false

    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }
  class Person(val name: String) {
    //instance-level functionality
  }
  //companions

  println(Person.N_EYES)
  println(Person.canFly)

  //Scala object = SINGLETON INSTANCE
  val mary = new Person("Mary")
  val jhon = new Person("John")
  println(mary.equals(jhon))

  val bobbie = Person(mary, jhon)

  //Scala Applications = Scala object with
  //def main(args: Array[String]): Unit
}
