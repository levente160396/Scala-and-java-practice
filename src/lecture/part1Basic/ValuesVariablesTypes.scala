package lecture.part1Basic

object ValuesVariablesTypes extends App {

  val x = 42
  println(x)

  //VALS ARE IMMUTABLE

  //COMPILER can infer types

  val aString: String = "Hello"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 465
  val aLong: Long = 234234235346L;
  val aFloat : Float = 2.0F
  val aDouble: Double = 3.14

  //variables
  var aVariable: Int = 4
  aVariable = 5 // side effects

}
