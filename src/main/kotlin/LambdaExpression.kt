// Higher-order function that takes a lambda as a parameter
fun operation2(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun main() {
    // Using lambda expressions as arguments to the higher-order function
    val resultAdd = operation2(5, 3) { a, b -> a + b } // Lambda for addition
    val resultSubtract = operation2(8, 2) { a, b -> a - b } // Lambda for subtraction

    println("Result of addition: $resultAdd")
    println("Result of subtraction: $resultSubtract")
}
 