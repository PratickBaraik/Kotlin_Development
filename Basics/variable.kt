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
  val myLongData: Long = 1_000_000_000_000_000

  // printing the values
  println("My string is: $myString")
  println("Integer: $anInteger")
  println("Boolean: $aBoolean")
  println("Double: $myDouble")
  println("Char: $aChar")
  println("My long value: $myLongData")

  // using var (mutable type) to declare variables
  // explicit declaration of variables
  var mySecString: String = "Android"
  var mySecInteger: Int = 4433
  var mySecBoolean: Boolean = false
  var mySecDouble: Double = 452.11883
  var mySecChar: Char = 'Z'
  // declaring the float type
  var myFloat: Float = 33.78f

  // printing the value
  println("mySecString: $mySecString")
  println("mySecInteger: $mySecInteger")
  println("mySecBoolean: $mySecBoolean")
  println("mySecDouble: $mySecDouble")
  println("mySecChar: $mySecChar")
  println("myFloat: $myFloat")

  // changing the values of var data types, coz it is mutable
  mySecString = "Mobile Phone"
  mySecInteger = 890
  
  // printing the changes
  println("mySecString: $mySecString")
  println("mySecInteger: $mySecInteger")

  // finding the type of data 
  println(mySecString::class.simpleName)
  println(mySecInteger::class.simpleName)

  // declaring nullable variables
  var exampleString: String? = null

  // printing the data
  println("My example string: $exampleString") // nullable variable can be printed

  // assigning null to other variables
  var nullBoolean: Boolean? = null
  println("Nullable boolean: $nullBoolean")
  // assigning a value to nullBoolean
  nullBoolean = true
  println("Nullable boolean has a value: $nullBoolean")
}