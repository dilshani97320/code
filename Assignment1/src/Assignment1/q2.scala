package Assignment1

object q2 {
    def main(args:Array[String])
  {
    var r:Double =5.0;
    var result:Double=calculate_volume(r);
    println("volume of a sphere with radius 5 --->"+result);
  }
  def calculate_volume(radius:Double):Double={
    var volume:Double=(math.Pi*4*radius*radius*radius)/3;
    return volume;
  }
}
