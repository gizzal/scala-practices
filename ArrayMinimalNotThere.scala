object solution extends App {

  def solution(a: Array[Int]): Any = {
    val sortedArray = a.sorted.toList
    for (i <- 1 to a.max) {
      if (!sortedArray.contains(i)) {
        return i
      }
    }
    a.last + 1
  }

  println(solution(Array(-1, -2, 0, 1, 2, 6, 7, 8)))
}
