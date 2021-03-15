package lecture.part2oop

object CaseClasses extends App {

  case class Person(name: String, age: Int)

  val jim = new Person("Jim", 34)
  println(jim.name)

  //2. sensible toString
  println(jim.toString)

  //3, equals and hashCode implemented OOTB
  val jim2 = new Person("Jim", 34)
  println(jim == jim2)

  //4. CCs have handy copy mathod
  val jim3 = jim.copy(age = 45)
  println(jim3)

  // 5. CCs hav companion objects
  val thePerson = Person
  val mary = Person("Mary", 23)

  //6. CCs are serializable
  // Akka

  //7. CCs have extractor petterns = CCs can be used in PATTERN MATCHING

  case object UnitedKingdom {
    def name: String = "The UK of GB and NI"

  }
}
