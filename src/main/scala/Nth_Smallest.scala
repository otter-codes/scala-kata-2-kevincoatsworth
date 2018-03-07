object Nth_Smallest extends App {

  def NthSmallest(list : List[Int], num : Int) : Option[Int] = {

    val sortedList = list.sorted.distinct //.reverse for nth Largest

    if(num > list.length) {
      None
    } else {
      Some(sortedList(num-1))
    }
  }
  NthSmallest(List(3,4,5,2,6,1),7)
  NthSmallest(List(1,2,3,4,5),2)
  NthSmallest(List(3,3,4,4,5,5),3)
}
