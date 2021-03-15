package lecture.part1Basic

object Expressions extends App {

  val x = 1 + 2 //EXPRESSION

  println(x)

  println(2+3*4)

  println(1 == x)

  // == !=  > < >= <=

  println(!(1 == x))

  // ! && ||

  var aVariable = 2
  aVariable +=3 // -= *= /= ....

  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)

  // if expression

  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3

  println(aConditionValue)

  println(if(aCondition) 5 else 3)

  var i= 0
  val aWHile =while(i < 10){
    println(i)
    i +=1
  }

  //NEVER WRITE THIS AGAIN.

  // EVERYTHING in Scala is an Expression

  val aWeirdValue = (aVariable = 3) // unit === void
  println(aWeirdValue)

  //side effects: println, whiles, reassigning

  //Code blocks
  val aCodeBlock ={
    val y = 2
    val z = y + 1
    if(z > 2) "hello" else "goodbye" // this is the value because this is the last
  }

  // 1. difference between "hello world" vs println("hello world)
  //2

  val someValue = {
    2 < 3
  }

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }


}
