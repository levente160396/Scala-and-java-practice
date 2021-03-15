package lecture.part2oop

object AnonymousClasses extends App {
   abstract class Animal {
     def eat: Unit
   }

  //anonymous class
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("hahahahah")
  }

  println(funnyAnimal.getClass)

  class Person(name: String) {
    def sayHi: Unit = println("sHi, my name is $name, how can i help")
  }

  val jim = new Person("Jim") {
    override def sayHi: Unit = println(s"Hi, my name is Jim, how can I be of service?")
  }

  /*
  1. Generic trait myPredicate[-T] with little method test(T) = > Boolean
  2. Generic trait MyTransFormer[-A, B] with a method transform (A) => B
  3. MyList:
        -map(transdormer) = MyList
        -filter(predicate) => Mylist
        -flatMap(transformer from A to MyList[B]) = MyList[B]

        class EvenPredicate extends MyPredicate[Int]
        class StringToIntTransformer extends MyTransformer[String, int]
        [1,2,3].map(n * 2) = [2,4,6]
        [1,2,3,4].filter(n % 2) = [2,4]
        [1,2,3].flatMap(n = > [n, n+1]) => [1,2,2,3,3,4]
   */
}
