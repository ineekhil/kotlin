fun main(){

    // Calling functions with parameters
    greetPerson("Avinash")
    addTwoNumber(33,44)
}

fun greetPerson(name:String){
    println("Hello, $name")
}

fun addTwoNumber(a:Int, b:Int){
    val sum= a+b
    println(sum)
}