import scala.io.StdIn
object Do_I_Get_A_Bonus extends App {
  def BonusCalculator(salary : Int, bonus : Boolean) : String = {
    val salaryAsDouble = salary.toDouble
    if(bonus) {
      val x = ((salaryAsDouble / 100) * 20) + salary
      println(s"£${x.toInt}")
      s"£${x.toInt}"
    }
    else {
      println(s"£$salary")
      s"£$salary"
    }
  }
  def collectUserInfo() : (Int, Boolean) = {
    def collectSalary() : Int = {
      try {
        StdIn.readLine("Please enter your salary: ").toInt
      }
      catch {
        case _ : NumberFormatException => collectSalary()
      }
    }
    def collectBonus() : Boolean = {
      try {
        StdIn.readLine("If you are eligible for a bonus please enter true, otherwise enter false: ").toBoolean
      }
      catch {
        case _ : IllegalArgumentException => collectBonus()
      }
    }
    (collectSalary(), collectBonus())
  }
  val (salary, bonus) = collectUserInfo()
  BonusCalculator(salary, bonus)
}
