fun main() {
  sayHello();
  myGreeting("Pratick");
  listGreeting(listOf("Sujal", "Ranu", "Satyam", "Mohit", "Jeetu"));  
  anyList(listOf("String", true, 123, 117893245, 88.43, 'A'));
}

// sayHello() function definition
fun sayHello() {
  println("Function which is printing a simple message-");
  println("Hello");
}

// my greeting function definition
fun myGreeting(name: String) {
  println("Function which takes list of string values-");
  println("Hello $name");
}

fun listGreeting(names: List<String>) {
  println("Function which takes list of any values-");
  names.forEach {
    println("Hello, $it")
  }
}

// function which can take any type of values in list
fun anyList(values: List<Any>) {
  values.forEach {
    println("$it");
  }
}
