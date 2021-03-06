package lecture.part1Basic

object DefaultArgs extends App {

  //default value
  def trFact(n: Int, acc: Int = 1): Int =
    if(n <= 1) acc
    else trFact(n - 1, n * acc)

  val fact10 = trFact(10)

  //
  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("Saving picture")
  savePicture(width = 800)

  /*
    1. pass every leading argument
    2. name the arguments
   */

  savePicture(height = 600, width = 800, format = "bmp")
}
