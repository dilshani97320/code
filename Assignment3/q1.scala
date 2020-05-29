package Assignment3

object q1 {
  def main(args:Array[String])
  {
    println("Enter input for n:");
    var input:Int=scala.io.StdIn.readInt();
    var result:Boolean=prime(input);
    if(result==true)
      print("Prime number");
    else
      print("not a prime number");
  }
  def prime(p:Int,n:Int=2):Boolean=n match {
    case n if(n==p)=>true;
    case n if(gcd(n,p)>1)=>false;
    case _=>prime(p,n+1);
  }
  def gcd(p:Int,n:Int):Int= n match{
    case n if(n==0)=>p;
    case _=>gcd(n,(p%n));
  }
}