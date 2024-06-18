object q2{
def sphereVolume(r: Double): Double = {

  val pi = Math.PI

  (4/3) * pi * r * r * r

}


def main(args:Array[String]):Unit={

val volume = sphereVolume(5)

println(s"Volume of sphere with radius 5 is: $volume")

}
}