import scala.collection.mutable.ListBuffer

object Check_Exam_Results extends App {

def checkExamResults(correct : List[String], user : List[String]): Int = {

  val score : ListBuffer[Int] = new ListBuffer[Int]

  for (i <- correct.indices) {

    if (correct(i) == user(i)) {

      score.append(4)

    }

    else if (user(i) == "") {

      score.append(0)

    }

    else {

      score.append(-1)

    }

  }

  val total = score.sum
  total

  }

  println(checkExamResults(List("a", "b", "c", "d"), List("a", "b", "c", "d")))
  println(checkExamResults(List("a",	"b",	"c",	"d"),	List("a",	"a",	"a",	"a")))
  println(checkExamResults(List("a",	"b",	"c",	"d"),	List("a",	"a",	"a",	"")))

}