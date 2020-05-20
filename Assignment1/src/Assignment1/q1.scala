package Assignment1

object q1 {
    def main(args:Array[String])
  {
  var temperature:Double=35.00;
  var result:Double=convert_temp(temperature);
  println("35C---->"+result+"F");
  }
  
  def convert_temp(temp:Double):Double={
    var temp_in_fahrenheit=temp*1.8000+32.00;
    return temp_in_fahrenheit;
  }
}
