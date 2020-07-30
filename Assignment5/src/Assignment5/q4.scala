package Assignment5

object q4 {
  
  class account(id:String,n:Int,b:Double)
{
	val nic:String=id
     val acnumber: Int = n
     var balance: Double = b
}



	def main(args:Array[String])
	{
		

		var a1=new account("975802981V",10001,20000);
		var a2=new account("925432981V",10002,-25000);
		var a3=new account("936542981V",10003,600000);
		var a4=new account("976534231V",10004,-8000);
		var a5=new account("978732481V",10005,450000);
		
		val bank:List[account]=List(a1,a2,a3,a4,a5);
		
		
		
		var totalBalance=balance(bank);
		println("Total account balance---> "+totalBalance.balance);

		println();
		println("Account balances + interest---> ")
		var interestList=interest(bank);
		interestList.foreach(x=>println(x+" "));

		
	}

	val overdraft=(list:List[account])=>
	  list.filter(x=>x.balance<=0);
	
	val balance=(list:List[account])=>list.reduce((x,y)=>
	  new account("975802981V",1000,x.balance+y.balance));
	
	val interest=(list:List[account])=>
	  list.map(x=>(if(x.balance>0) x.balance*1.05d else x.balance*1.01d));
}



