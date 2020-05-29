package Assignment3

object q2 {
  def main(args:Array[String])
  {
    print("Enter number");
    var number:Int=scala.io.StdIn.readInt();
    print_prime(number);
    
  }
  def print_prime(n:Int):Unit={
    if(prime(n))
         print(n+"\n");
    if (n>0)
      print_prime(n-1);
    
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