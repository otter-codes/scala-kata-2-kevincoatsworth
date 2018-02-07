import scala.io.StdIn

import scala.collection.mutable.ArrayBuffer

object Collatz_Conjecture extends App {

  private val dividedNums : ArrayBuffer[Int] = new ArrayBuffer[Int]()

  def collatzCalc(num: Int) = {

    dividedNums.append(num)

    var currentNum = num

      do {

        if (currentNum % 2 == 0) {

          val num1 = currentNum / 2

          dividedNums.append(num1)
          currentNum = num1

        }

        else {

          val num2 = (currentNum * 3) + 1

          dividedNums.append(num2)
          currentNum = num2

        }
      }

      while(currentNum != 1);

        //println(dividedNumList)
        println("The length of your Collatz Conjecture is: " + dividedNums.length)

        }

  val userNum = StdIn.readLine("Please Enter a positive number that is larger than 1: ").toInt

  if (userNum < 2){

    println("That was not a positive number larger than 1")

    }

  else {

    collatzCalc(userNum)

  }

}
