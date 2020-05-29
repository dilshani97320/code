package Assignment3

object q6 {
  def main(args:Array[String])
  {
    print("Enter value for n :");
    var n:Int=scala.io.StdIn.readInt();
    //var result:Int=fibonacci(n);
    for(i<-0 to n)
       print(fibonacci(i)+"\t");
  }
  def fibonacci(n:Int):Int=n match{
    
    case n if(n==0)=>0;
    case n if(n==1)=>1;
    case _ =>fibonacci(n-1)+fibonacci(n-2);
  }
}