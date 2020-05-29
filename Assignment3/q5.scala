package Assignment3

object q5 {
  def main(args:Array[String])
  {
    print("Enter positive number :");
    var number:Int=scala.io.StdIn.readInt();
    var sum:Int=Find_sum_of_enen(number);
    print("The sum of even numbers under "+number+" is "+sum);
  }
  def Find_sum_of_enen(n:Int):Int=n match {
    case n if(n==0)=>0;
    case n if(n%2==0) =>(n-2)+Find_sum_of_enen(n-2);
    case _ =>(n-1)+Find_sum_of_enen(n-1);
  }
}