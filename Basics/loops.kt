// starting the program
fun main() {

  // creating a list
  val myList = listOf("Pratick", "Subham", "Sailes", "Karan", "Ashwin", "Dev", "Ayuv", "Abraham")
  // printing the list element turn by turn
  println("Normal printing")
  println(myList[0])
  println(myList[1])
  println(myList[2])
  println(myList[3])
  println(myList[4])
  println(myList[5])
  println(myList[6])
  println(myList[7])
  // println(myList[8])

  // printing the list element using a loop
  println("Printing using a for loop")
  for(name in myList) {
    println(name)
  }

  // printing by using the for each loop
  println("Printing using for-each loop")
  myList.forEach{
    name -> println(name)
    // or, println(it)
  }

  // defining a second list
  val secList = listOf("Fruits", "Vegies", "Yogurt", "Salad")

  // printing the indices of the list
  println("Printing the indices of secList")
  for(index in secList.indices) {
    println(index)
  }

  // printing the values
  println("Printing the values with index of secList")
  for(index in secList.indices) {
    println("$index -> ${secList[index]}")
  }

  // printing the values using the .withIndex() function
  println("Printing the values with index of secList by using .withIndex() function")
  for((index, list) in secList.withIndex()) {
    println("$index -> $list")
  }

  // iterating through every character of a string 
  var myString = "Pratick"
  println("Printing the characters of the string defined")
  for(character in myString) {
    print("$character  ")
  }

  // using the forEachIndexed loop to print list items with their index
  println("\nUsing the forEachIndexed loop to print list element with index")
  myList.forEachIndexed{
    index, value -> println("$index -> $value")
  }

  // using IntRange 
  println("Making use of IntRange")
  for(value in 1..20 step 4) {
    println(value)
  }

  // using until 
  println("using until to print till the 2nd last value")
  for(value in 1 until 6) {
    println(value)
  }

  // printing value in reverse order
  println("Using downTo to print values in reverse order")
  for(value in 5 downTo 1) {
    println(value)
  }
  
  // declaring while and do-while loop
  var myNum = 5
  println("Using while loop")
  while(myNum > 0) {
    println("Number: $myNum")
    myNum--
  }

  println("Using do-while loop")
  do {
    println("Number: $myNum")
  } while(myNum > 0)
}