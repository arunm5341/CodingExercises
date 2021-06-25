object MapFlatmapFilters {
  def main(args: Array[String]): Unit = {

val list= List(2,3,4,5)

    val toPair=(x:Int)=> List(x,x+1)

    println(list.flatMap(toPair))

    println(list.filter(_%2==0))
  }
}
