import scala.io.StdIn

object Times_Tables extends App {
  def timesTableCalculator(number : Int) {
    for (i <- 1 to 10) {
      val result = number * i
      println(s"$i * $number = $result")
    }
  }
  def collectNumber() : Int = {
   try
      {
        StdIn.readLine("Please enter a number: ").toInt
      }
      catch{
        case _ : NumberFormatException => collectNumber()
      }
  }
  timesTableCalculator(collectNumber())
}
