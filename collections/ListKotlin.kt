// demonstrating the use of simple list in kotlin
fun main() {
  // defining a simple list using listOf function
  val myList = listOf(1, 2, 'a', 'B', "Human", "Animal");

  // calling print list function
  printList(myList);
}

// defining a print list function
fun printList(myList: List<Any>) {

  // printing the list items using a loop
  println("Items of the list are: ")
  for(item in myList) {
    print("$item ");
  }
}