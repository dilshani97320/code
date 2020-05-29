package Assignment2

object q1 {
  def main(args:Array[String])
  {
     printf("Enter no of working hours :");
  var no_of_working_hours=scala.io.StdIn.readInt();
   printf("Enter no of OT hours :");
  var no_of_ot_hours=scala.io.StdIn.readInt();
  printf("Your take home salary is ---->"+calculate_take_home(no_of_working_hours,no_of_ot_hours));
  }
  
  def calculate_wage(no_of_working_hours:Int):Int={
   return no_of_working_hours*150;
  }
  def calculate_Ot(no_of_ot_hours:Int):Int={
   return no_of_ot_hours*75;
  }
  def calculate_income(wh:Int,oh:Int):Int={
   return calculate_wage(wh)+calculate_Ot(oh);
  }
  def calculate_tax(calculate_income:Double):Double=
  {
   calculate_income*0.1;
  }
  def calculate_take_home(wh:Int,oh:Int):Double={
    return calculate_income(wh,oh)-calculate_tax(calculate_income(wh,oh));
  }
}