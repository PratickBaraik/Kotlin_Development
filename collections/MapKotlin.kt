// Defining a function to print values of a map
fun printMap(myMap: Map<String, Int>) {
    println("Map items:")
    myMap.forEach { (key, value) ->
        println("$key -> $value")
    }
}

fun main() {
    // Defining a simple map which is immutable
    val myMap = mapOf("Calculator" to 1, "Calendar" to 2, "Laptop" to 3, "Notebook" to 4)
    // Printing the Kotlin map
    println("Immutable map:")
    printMap(myMap)

    // Defining a mutable map in Kotlin
    val myMutableMap = mutableMapOf("Table" to 10, "Chair" to 20, "Bed" to 30, "Wardrobe" to 40, "Dressing Table" to 50)
    // Printing the mutable map
    println("\nMutable map:")
    printMap(myMutableMap)

    // Adding values to the mutable map
    myMutableMap["Door"] = 11
    myMutableMap["Window"] = 12
    myMutableMap["Balcony"] = 13

    // Printing the updated mutable map
    println("\nUpdated mutable map:")
    printMap(myMutableMap)
}
