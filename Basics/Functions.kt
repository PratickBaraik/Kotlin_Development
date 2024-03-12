fun main() {
  sayHello();
  myGreeting("Pratick");
  listGreeting(listOf("Sujal", "Ranu", "Satyam", "Mohit", "Jeetu"));  
}

// sayHello() function definition
fun sayHello() {
  println("Hello");
}

// my greeting function definition
fun myGreeting(name: String) {
  println("Hello $name");
}

fun listGreeting(names: List<String>) {
    names.forEach {
        println("Hello, $it")
    }
}
