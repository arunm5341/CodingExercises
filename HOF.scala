object HOF {
def math( a: Int , b: Int , f : (Int, Int)=>Int): Int = f (a,b);

  def main(args: Array[String]): Unit = {
    var x = math( 50 ,20 ,_+_);
    println(x)
  }


}
