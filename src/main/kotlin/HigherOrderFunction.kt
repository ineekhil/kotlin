// Higher-order function that takes a function as a parameter

fun operation(x:Int, y:Int, operation:(Int, Int) ->Int): Int {
    return operation(x,y)
}

// function that can be passed to the higher-order function
fun add (a:Int, b:Int): Int{
    return a+b
}

fun subtract(a:Int, b:Int): Int{
    return a-b
}

fun main(){
    val resultAdd = operation(10,3, :: add) // Passing the "add' function
    val resultSubtract = operation(12,4, ::subtract) // Passing the 'subtract' function

    println("Result of addiction: $resultAdd")
    println("Result of subtraction: $resultSubtract")
}