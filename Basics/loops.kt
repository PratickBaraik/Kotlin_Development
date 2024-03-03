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
}