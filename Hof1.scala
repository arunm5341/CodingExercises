object Hof1 {
def math(a : Int, b : Int , c:Int ,f :( Int, Int)=> Int): Int = f(f(a,b),c);

  def main(args: Array[String]): Unit = {
    var x= math(10, 50 ,10 , _*_);
    print(x)
  }
}
