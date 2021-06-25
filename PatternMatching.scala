object PatternMatching {
  def main(args: Array[String]): Unit = {
    val num =4
    num  match {
      case 1 | 3 | 5 | 7 | 9 => println("Odd")
      case 2 | 4 | 6 | 8 => println("Even")
    }
    var x = "xyz"
    x match {
      case "abc"=> println("none")
      case "xyz"=> println("nwefn")
    }


  }

}
