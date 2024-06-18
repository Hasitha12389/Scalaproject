object q2{
def celsius_Fahrenheit_converter(celsius: Double): Double = {

  celsius * 1.8000 + 32.00

}


def main(args:Array[String]):Unit={
val temperatureInFahrenheit = celsius_Fahrenheit_converter(35)

println(s"35C is: $temperatureInFahrenheit Fahrenheit")


}
}