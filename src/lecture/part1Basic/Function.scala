package lecture.part1Basic

object Function extends App {

  def aFunction(a: String, b:String) = {
    a + " " + b
  }

  println(aFunction("béla", "levi"))
  println(aFunction("Hello", "world"))

  def aParameterLessFunction(): Int = 42

  println(aParameterLessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if(n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("Hello", 3))

  //WHEN YOU NEED LOOPS, USE RECURSION.

  def aFuntionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int ={
    def aSmallerFunction(a: Int, b: Int):Int = a + b
    aSmallerFunction(n, n-1)
  }

  /*
    1. A greeting function (name, age)=> "hy, my name is $name and I am $age years old"
    2. Factorial function 1 * 2 * 3 ... n
    3. A fibonacci function
      f(1) = 1
      f(2) = 2
      f(n) f(n-1) + f(n-2)
    4. Test if number is prime

   */

  def greetingForKids(name: String, age: Int):String = {
    "Hy my name is " + name + " and I am " + age + " years old."
  }

  println(greetingForKids("Levi", 24))

  def factorial(n: Int): Int = {
    if(n <= 0) 1
    else n * factorial(n-1)
  }

  println(factorial(5))


  def fibonacci(n: Int): Int = {
    if( n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)
  }

  println(fibonacci(30))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if(t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37*17))

}
