import scala.collection.mutable.ListBuffer

object Index_Multiples extends App {
  def listOfMultiples(list : List[Int]) : List[Int] = {
    val listReturn = new ListBuffer[Int]
    for(i <- list.indices) {
      list(i) match {
        case o if i == 0 || o == 0 => Nil
        case x if x % i == 0 => listReturn.append(x)
        case _ => Nil
      }
    }
    listReturn.toList
  }
  listOfMultiples(List(2,4,7,9,10))
}