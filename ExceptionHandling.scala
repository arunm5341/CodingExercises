object ExceptionHandling {
  def main(args: Array[String]): Unit = {

    def getint(x: Boolean) : Int =
      if (x) throw new RuntimeException("No Int for you")
      else 42

    try {
      getint(true)
    }
    catch {
      case e : RuntimeException => println(" Caught the runtime exception")
    }
    finally {
      println("finally")
    }

  }
}
