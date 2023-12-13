fun main(){
    // calling functions with default arguments
    greetToPerson("Avinash Sharma")
    greetToPerson()
    
    addNumbers(7,10)
    addNumbers(10)

}

fun greetToPerson(name: String ="Avinash"){
    println("Hello, $name")
}

fun addNumbers(a:Int, b:Int =0){
    val sum = a+b
    println("Sum of $a & $b is: $sum")
}