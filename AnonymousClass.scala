object AnonymousClass {
  def main(args: Array[String]): Unit = {
   class person(name : String)
   {
   def sayhi : Unit = println(s"hi my $name is")
   }
    val jim= new person("Lebron") {
    override def sayhi : Unit = println(s"Hi my name is Lebron")
    }
  }
  }