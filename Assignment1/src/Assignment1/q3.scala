package Assignment1

object q3 {
  def main(args:Array[String])
  {
    var no_of_copies:Int=60;
    var total_cost:Double=normal_price(no_of_copies)-add_discount(normal_price(no_of_copies))+calculate_shipping_cost(no_of_copies);
    println("Total cost is--->"+total_cost);
  }
  
  def normal_price(n:Int):Double={
    return n*24.95;
  }
  def add_discount(amount:Double):Double={
    return amount*0.4;
  }
  def calculate_shipping_cost(n:Int):Double={
    return (n*3)-(n-50*0.75);
  }
}