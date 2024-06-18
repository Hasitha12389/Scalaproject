object q1{
def totalRunningTime(easyPace: Double, tempo: Double): Double = {

  (easyPace * 8) + (tempo * 7)

}


def main(args:Array[String]):Unit={
val time = totalRunningTime(4, 3)

println(s"Total Running time: $time min")

}
}