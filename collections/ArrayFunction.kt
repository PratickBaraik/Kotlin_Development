// using first() and last() function to print first and last element of array
fun main() {
  // defining an array
  val myIntArray: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
  // printing the first element of array
  println("First element: ${myIntArray.first()}");
  // printing the last element of array
  println("Last element: ${myIntArray.last()}");

  // using the set() method to change the set the elements of array
  myIntArray.set(0, 10);

  // calling the print array function
  printArray(myIntArray);
}

// my function to print the array elements
fun printArray(myArray: IntArray) {
  // using a loop to print the array elements
  println("Array elements are: ")
  for(value in myArray) {
    println(value);
  }
}