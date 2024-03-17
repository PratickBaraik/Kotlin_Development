// list of list can be created in kotlin
// driver code
fun main() {
  val myMutableList = listOf("Apple", "Mango", "Cherry", listOf("Rice", "Toratolli", "Soup"))
  print_list_of_list(myMutableList)
}

// defining a function to print the list of list
fun print_list_of_list(myListOfList: List<Any>) {
  myListOfList.forEach{
    items -> println(items)
  }
}