object NewFunctions {

  def main(args: Array[String]): Unit = {
    def doubler : Int => Int  = (x : Int) => x*2
    println(doubler(2))

    def something : () => Int = () => 3
    println(something)
    println(something())
  }

}
