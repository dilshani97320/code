package assignment4

object CaesarCipher {
  
 def main(args:Array[String])
 {
   
     val alphabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
     
    //Encryption function
   
    val Encryption=(c:Char,key:Int,a:String)=>
                 a((a.indexOf(c.toUpper)+key)%a.size)
     
    //Decryption function
     
     val Decryption=(c:Char,key:Int,a:String)=>
                 a((a.indexOf(c.toUpper)-key+26)%a.size)
     
     
     val cipher=(algo:(Char,Int,String)=>
                Char,s:String,key:Int,a:String)=>
                s.map(algo(_,key,a))
                
                
           
                
               val message="HappyBirthday";
               println("String is :"+message);
               print("Enter key :");
               var key=scala.io.StdIn.readInt();
              
                
               val encrypted_text=cipher(Encryption,message,key,alphabet);
               val plain_text=cipher(Decryption,encrypted_text,key,alphabet);
               
                println("Encrypted text: "+encrypted_text)

                println("Real(Decrypt) text: "+plain_text)
 }
 
}
