package Assignment5

object q1 {
  def main(args:Array[String])
  {
 
  val x=new Rational2(1,2);
  val result=x.neg;
  println(result);

  

  }
  
class Rational2(a:Int,b:Int)
    {
      def num=a;
      def den=b;
      
    def neg = new Rational2(-this.num,this.den);
     override def toString=num+"/"+den;
 
    }
}