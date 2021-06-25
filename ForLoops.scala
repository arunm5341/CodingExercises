object ForLoops {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 5)
      println(i)

    for ( i <- 3 until 5)
      println(i)

    var list = List(12,3,4,5,6)
    for( i <- list )
      println(list)

    var result = for{i<-list ; if i<6} yield { i+i}
    println(result)
  }

}
