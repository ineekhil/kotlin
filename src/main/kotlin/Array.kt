fun main(){

    // Declare an array of integers
    val numbers = arrayOf(1, 2, 3, 4, 5)

    // Declare an array of strings
    val names = arrayOf("Alice", "Bob", "Charlie", "Dave")

    // Declare an array of a specific size
    val array = arrayOfNulls<Int>(10)

    // Declare an array of integers with a specified size and initial value
    val array2 = Array<Int>(7) { i -> i*i }
        
    val filledArray = IntArray(5) { index -> index * 2 } // Other type: BooleanArray, ShortArray, DoubleArray and etc.
    // print array all stored value
    numbers.forEach {
        println(it)
    }
    // print array all stored value
    names.forEach {
        println(it)
    }

    // Access an element at a specific index
    val firstNumber = numbers[0]

    // Access the last element of an array
    val lastNumber = numbers[numbers.size - 1]
}