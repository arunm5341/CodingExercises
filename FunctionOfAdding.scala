object FunctionOfAdding {
  def main(args: Array[String]): Unit = {
    def adding(a : Int, b : Int): Int =a+b

    println(adding(2,4))

    // Currying - It is technique of transforming a function which takes multiple arguments into single argument

    def add(a: Int)(b : Int) = a+b
    println(add(3)(4))



  }

}
