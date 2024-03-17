// set is a collection in kotlin which contains unique values
// starting the program
fun main() { // driver code
  val mySet = setOf("Ruler", "Calendar", "Notebook", "Id Card", "Ruler", "Pencil", "Pencil");
  // printing the set items
  print("Set items: $mySet");

  val numberSetOne = setOf(1, 2, 3, 4, 5);
  val numberSetTwo = setOf(2, 4, 5, 6, 8);
  // performing union operation on set
  // printing the union of two set
  println("\nUnion: ${numberSetOne union numberSetTwo}");

  // performing intersection on two sets
  println("\nIntersection: ${numberSetOne intersect numberSetTwo}");

}

// // defining a function to print set items
// fun print_set() {
//   println("\nPrinting the set items: ")
//   mySet.forEach{
//     items -> print("$items  ");
//   }
// }