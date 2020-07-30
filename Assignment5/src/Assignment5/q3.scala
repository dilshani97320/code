package Assignment5

object q3 {
  def main(args:Array[String])
  {
    
    val x=new Account("975802981V",10001,20000);
    val y=new Account("975678351V",10002,5000);
    
    val tr=x.transfer(y,5000);
    
    println("New balance of account x--->"+x.balance);
    println("New balance of account y--->"+y.balance);
    
  }
}



 class Account(id:String,n:Int, b:Double) {
     val nic:String=id
     val acnumber: Int = n
     var balance: Double = b


     def withdraw(a:Double) =
     this.balance=this.balance-a;

       def deposit(a:Double) =
       this.balance=this.balance+a;


     def transfer(a:Account,b:Double)=
       {
        this.balance=this.balance-b
        a.balance=a.balance+b
       }

 

override def toString =
 "["+nic+":"+acnumber +":"+ balance+"]"


}
