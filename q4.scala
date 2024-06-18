object q1{
def wholesaleCost(n: Int): Double = {

  ((24.95 * 0.6 * n) + (3 + (0.75 * (n - 50))))

}



def main(args:Array[String]):Unit={
val price = wholesaleCost(60)

println(s"Total wholesale cost for 60 books: Rs. $price")

}