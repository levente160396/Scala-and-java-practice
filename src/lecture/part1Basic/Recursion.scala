package lecture.part1Basic

import scala.annotation.tailrec

object Recursion extends  App {

  def factorial(n: Int): Int = {
    if(n <= 1) 1
    else {
      println("Computing factorial of " + n + "- I first need factorial of " + (n-1))
      val result =n * factorial(n-1)
      println("Computed factorial of " + n)

      result
    }
  }

  println(factorial(5))

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if(x<=1) accumulator
      else factHelper(x-1, x * accumulator) // TAIL RECURSION = user recursive call as the Last expression

      factHelper(n, 1)
  }

  def oldFactorial(n: Int): Int = {
    var result = 1
    for( i <- 1 to n){
      result *= i
    }

      result
  }
  /*
    anotherFactorial(10) = factHelper(10, 1)
    = factHelper(9, 10 * 1)
    = factHelper(8,0 9 * 10 * 1)
    = factHelper(7, 8 * 9 * 10 * 1)
    = ...
    = factHelper(2, 3 * 4 * ... * 10 * 1)
    = factHelper(1, 1 * 2 * 3 * 4 * ... * 10)
    =  1 * 2 * 3 * 4 * ... * 10

   */

  println(anotherFactorial(20000))
    println()
    print("Old: ")
    println(oldFactorial(5))

  // WHEN YOU NEED LOOPS, US _TAIL_ RECURSION

  /*
  * 1. Concatenate a string n times.
  * 2. IsPrime function tail recursive.
  * 3. Fibonacci function tail recursive.
  *
  * */

  @tailrec
  def concatenateTailrec(aString: String, n: Int, accumulator: String): String =
    if(n <= 0) accumulator
    else concatenateTailrec(aString, n-1, aString + accumulator)

  println(concatenateTailrec("Hello",3 ,""))

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean =
      if(!isStillPrime) false
      else if(t <= 1) true
      else isPrimeTailRec(t-1, n % t != 0 && isStillPrime)

    isPrimeTailRec(n / 2, true)
  }

  println(isPrime(2003))

  def fibonacci(n: Int): Int = {
    def fiboTailRec(i: Int, last: Int, nextToLast: Int): Int =
      if(i >= n) last
      else fiboTailRec(i + 1, last + nextToLast, last)

    if( n <= 2) 1
    else fiboTailRec(2, 1,1)
  }

  println(fibonacci(8))


  def tryFactorial(n: Int): Int = {
    @tailrec
    def tryFactorialHelper(x: Int, accumulator: Int): Int =
      if(x<=1) accumulator
      else tryFactorialHelper(x - 1, x * accumulator)

    tryFactorialHelper(n, 1)
  }

  println(tryFactorial(6))
}
