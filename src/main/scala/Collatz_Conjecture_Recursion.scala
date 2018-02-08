import Collatz_Conjecture_Recursion.collatzCalc

import scala.io.StdIn


object Collatz_Conjecture_Recursion extends App{


  def collatzCalc(num: Int, counter: Int = 0): Int = {

    if (num == 1) {

      counter+ 1

    } else {

      if (num % 2 == 0) collatzCalc(num / 2, counter + 1)

      else collatzCalc(num * 3 + 1, counter + 1)
    }
  }

  val userNum = StdIn.readLine("Please enter a number that is greater than 1: ").toInt

  if (userNum < 2){

    println("That was not a positive number larger than 1")

  }

  else {

    collatzCalc(userNum)
  }

  println(collatzCalc(userNum))
}