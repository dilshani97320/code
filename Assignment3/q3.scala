package Assignment3

object q3 {
  def main(args:Array[String])
  {
    print("Enter positive number");
    var number:Int=scala.io.StdIn.readInt();
    var sum:Int=Find_sum(number);
    print("The sum of 1 to "+number+" is "+sum);
  }
  def Find_sum(n:Int):Int=n match {
    case n if(n==0)=>0;
    case _ =>n+Find_sum(n-1);
  }
}