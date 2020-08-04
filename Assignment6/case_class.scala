package Assignment6

object case_class {
  
 
  def main(args:Array[String])
  {
    val p1= point(1,2);
    val p2= point(8,2);
    println("Addition of two points");
     println(p1);
     println(p2);
     val p3=p1.add(p2)
     println("Addition of above two points is: "+p3);
     
     println("");
     println("Move a point by a given distance dx and dy"); 
     println(p1);
  
     val p4=p1.move(2,3);
     println("After moving "+p1+"by (2,3) is:"+p4);
     
     println("");
     println("distance of two points"); 
     println(p1);
     println(p2);
     val p5=p1.distance(p2);
     println("The distance between above two points is : "+p5);
     
     
     println("");
     println("invert of point"); 
     println(p1);
     val p6=p1.invert(p1));
     println("The invert point of p1 is "+p6);
    
     
  }
  
  
}
case class point(a:Int,b:Int)
{
  def x:Int=a;
  def y:Int=b;
  
  //method 1
  def add(that:point)= point(this.x+that.x,this.y+that.y);
  
  //method 2
  def move(dx:Int,dy:Int)=point(this.x+dx,this.y+dy);
  
  //method 3
  def distance(that:point)=math.sqrt((this.x-that.x)*(this.x-that.x)+(this.y-that.y)*(this.y-that.y));
  
  //method 4
  def invert(that:point)=point(this.x=this.y,this.y=this.x);
  
}

                                       

  
  
  

