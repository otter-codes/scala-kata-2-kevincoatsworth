import scala.io.StdIn

object Heads_And_Legs extends App {

  def numOfAnimals(heads : Int, legs : Int) : (Any) = {

    if (legs % 2 == 0) {

      val numOfChickens = ((4 * heads) - legs) / 2
      val numOfCows = (legs - (2 * heads)) / 2

      if ((numOfChickens >= 0) && (numOfCows >= 0)) {

        (numOfChickens, numOfCows)

      }

      else {

        "No solution found"

      }

    }

    else {

      "No solution found"

    }
  }

  val numOfHeads = StdIn.readLine("How many heads are there? ").toInt
  val numOfLegs = StdIn.readLine("How many legs are there? ").toInt

  println(numOfAnimals(numOfHeads, numOfLegs))

}