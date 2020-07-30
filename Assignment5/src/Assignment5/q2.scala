package Assignment5

object q2 {
   def main(args:Array[String])
  {
    
  
  val x=new Rational(3,4);
  val y=new Rational(5,8);
  val z=new Rational(2,7);
  val result=x.substact(y).substact(z);
  println("x="+x);
  println("y="+y);
  println("z="+z);
  println("x-y-z="+result);
  
  }
}
  
  class Rational(x:Int,y:Int)
    {
      def numerator=x;
      def denominator=y;
      
      def substact(r:Rational)=new Rational(this.numerator*r.denominator-this.denominator*r.numerator,
                                       this.denominator*r.denominator);
     override def toString=numerator+"/"+denominator;
     }
   
  

