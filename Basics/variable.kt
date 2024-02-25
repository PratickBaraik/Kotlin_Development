// starting the program
fun main() {

  // normal variable declaration
  val myName = "Pratick"
  val number = 123456
  val isOk = true
  val PIvalue = 3.14
  val myAlphabet = 'P'

  // printing the normal variables
  println("My name is $myName") // $ is used for interpolation
  println("My number is $number")
  println("Is it ok? - $isOk")
  println("Value of PI: $PIvalue")
  println("The alphabet which I like is $myAlphabet")

  // explicit declaration of variables
  val myString: String = "Protein Powder"
  val anInteger: Int = 9900
  val aBoolean: Boolean = false
  val myDouble: Double = 23.67
  val aChar: Char = 'A'

  // printing the values
  println("My string is: $myString")
  println("Integer: $anInteger")
  println("Boolean: $aBoolean")
  println("Double: $myDouble")
  println("Char: $aChar")

}