object q1{
def areaOfDisk(r: Double): Double = {

  val Pi = Math.PI

  Pi * r * r

}

def main(args:Array[String]):Unit={

println("The area of the disk is: " + areaOfDisk(5))
}
}