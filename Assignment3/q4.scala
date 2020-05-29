package Assignment3

object q4 {
  def main(args:Array[String])
  {
    print("Enter number which you want to check whether even or odd:");
    var number:Int=scala.io.StdIn.readInt();
    var result:String=chech_even_odd(number);
    print(result);
  }
  def chech_even_odd(n:Int):String= n match{
    case n if(n==0)=>"Even";
    case n if(n==1)=>"Odd";
    case _ =>chech_even_odd(n-2);
  }
}