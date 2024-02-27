// starting the program
fun main() {
  // arithmetic operator
  // declaring to mutable variables
  var first = 10
  var second = 20

  // adding the above two values
  println("Addition: ${first + second}")

  // subtracting the two values
  println("Subraction: ${second - first}")
  
  // multiplying the two numbers
  println("Multiplication: ${first * second}")

  // dividing two values
  println("Division: ${second / first}")

  // performing the modulus operation with two values
  println("Modulo: ${second % first}") // result 0, since number is totally divisible

  // relational operator
  // using if-else-if conditional block use the relational operator
  // using '>' operator to find greater value
  var maxAmongTwo = 
  if(first > second) {
    println("$first is greater than $second")
    // maxAmongTwo = first
    first
  } else {
    println("$second is greater than $first")
    // maxAmongTwo = second
    second
  }
  // printing the max value
  println("Max among two is: $maxAmongTwo")

  // using '<' operator to find lesser value
  var minAmongTwo = 
  if(first < second) {
    println("$first is lesser than $second")
    first
  } else {
    println("$second is lesser than $first")
    second
  }
  // printing the min value
  println("Min among two is: $minAmongTwo")

  // using '>=' to find greater than or equal to value
  if(first >= second) {
    println("$first is greater than or equal to $second")
  } else {
    println("$second is greater than or equal to $first")
  }

  // using '<=' to find lesser than or equal to value
  if(first <= second) {
    println("$first is lesser than or equal to $second")
  } else {
    println("$second is lesser than or equal to $first")
  }

  // using '==' value
  if(first == second) {
    println("$first is equal to $second")
  } else {
    println("Both are not equal")
  }

  // using '!=' value
  if(first != second) {
    println("$first is not equal to $second")
  } else {
    println("$first and $second are equal")
  }

  var assignVar: Int = 0

  // using the '+=' assignment operator
  assignVar += second

  // printing the result
  println("assignVar = $assignVar")

  // using the '-=' assignment operator
  assignVar -= first

  // printing the result
  println("assignVar = $assignVar")

  // using the '*=' assignment operator
  assignVar *= second

  // printing the result
  println("assignVar = $assignVar")

  // using the '/=' assignment operator
  assignVar /= first

  // printing the result
  println("assignVar = $assignVar")

  // unary operator: operator which takes only one operand
  println("+first : ${+first}")
  println("++first : ${++first}")
  println("-second : ${-second}")
  println("--second : ${--second}")

  // logical operator
  // var to store the result
  var result: Boolean

  // using the '||' operator
  result = (first > second) || (second > first)
  println("(first > second) || (second > first) : $result")

  // using the '&&' operator
  result = (first > second) && (second > first)
  println("(first > second) && (second > first) : $result")

  // using the '!' operator
  println("!result : ${!result}")

  // bitwise operator

  var num1: Int = 2
  var num2: Int = 1

  // using the 'shl(bits)' - signed shift left operator
  println("num1.shl(num2) : ${num1.shl(num2)}")

  // using the 'shr(bits)' - signed shift right operator
  println("num1.shr(num2) : ${num1.shr(num2)}")

  // using the 'ushr(bits)' - unsigned shift right operator
  println("num1.ushr(num2) : ${num1.ushr(num2)}")

  // using the 'and(bits)' - bitwise and operator
  println("num1.and(num2) : ${num1.and(num2)}")

  // using the 'or(bits)' - bitwise or operator
  println("num1.or(num2) : ${num1.or(num2)}")

  // using the 'xor(bits)' - bitwise xor operator
  println("num1.xor(num2) : ${num1.xor(num2)}")

  // using the 'inv()' - bitwise inverse operator
  println("num1.inv() : ${num1.inv()}")

}