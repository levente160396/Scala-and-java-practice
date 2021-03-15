package lecture.part2oop

object MethodNotations extends App {

  class Person(val name: String, favoriteMove: String) {
    def likes(movie: String): Boolean = movie == favoriteMove
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! :String  = s"$name, whate a hecK?!"
    def isAlive :Boolean = true
    def apply(): String = s"Hy, my name is $name and I like $favoriteMove"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent
  // infix notation = operator notation (syntactic sugar)

  // "operators" in Scala
  val tom = new Person("Tom", "Fight club")
  println(mary + tom)
  println(mary.+(tom))

  println(1 + 2)
  println(1.+(2))

  //ALL OPERATORS ARE METHODS

  //prefix notation
  val x = -1 //equivalent with 1.unary_-
  val y = 1.unary_-
  //unary_ prefix only works with - + ~ !

  println(!mary)
  println(mary.unary_!)

  //postfix
  println(mary.isAlive)


  //apply
  println(mary.apply())
  println(mary())


}
