package Assignment2

object q2 {
  def main(args:Array[String])
  {
    print("Enter ticket price :");
    var ticket_price:Int=scala.io.StdIn.readInt();
    print("you can see the profit according to ticket price which you entered \n");
    print("profit->"+calculate_profit(ticket_price));
    
  }
  def No_Of_attendees(ticket_price:Int):Int={
    return 120+((15-ticket_price)/5)*20;
  }
  def calculate_revenue(ticket_price:Int):Int={
   return  No_Of_attendees(ticket_price)*ticket_price;
  }
  def calculate_cost(ticket_price:Int):Int={
    return 500+No_Of_attendees(ticket_price);
  }
  def calculate_profit(ticket_price:Int):Int={
    return calculate_revenue(ticket_price)-calculate_cost(ticket_price);
  }
}