fun main() {
    // Anonymous function with parameters and return type
    val add: (Int, Int) -> Int = fun(x: Int, y: Int): Int {
        return x + y
    }

    // Calling the anonymous function
    val result = add(3, 7)

    println("Result of addition: $result")
}
