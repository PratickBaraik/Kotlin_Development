fun main() {

  // a kotlin list can contain duplicate values
    // defining a simple list using the list function
    val myList = listOf(1, 2, 'a', 'B', "Human", "Animal")

    // calling the print_list function
    print_list(myList)

    // defining a mutable list
    val myMutableList = mutableListOf('A', 'B', 123, "Cell Phone")
    // printing the mutable list
    print_list(myMutableList)

    // using remove function to remove mutable list item
    myMutableList.remove("Cell Phone")
    // using removeAt function to remove list item
    myMutableList.removeAt(2)

    // printing the list
    print_list(myMutableList)

    // adding items to the mutable list
    myMutableList.add("Green")
    myMutableList.add("Black")
    myMutableList.add("Yellow")
    myMutableList.add("Magenta")

    // sorting the mutable list with a custom comparator
    myMutableList.sortWith(compareBy { it.toString() })

    // printing the sorted list
    print_list(myMutableList)

    // sorting the list in descending order
    myMutableList.sortWith(compareByDescending{
      it.toString()
    });

    // printing the sorted list
    print_list(myMutableList)
}

// defining a print_list function
fun print_list(myList: List<Any>) {
    // printing the list items using a loop
    println("\nItems of the list are:")
    for (item in myList) {
        print("$item ")
    }
}
