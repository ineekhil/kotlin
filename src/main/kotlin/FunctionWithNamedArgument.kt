fun main(){
    //calling a function with named arguments
    egreet("Avinash","Sharma",23)

    //You can also change the order of named arguments
    egreet(age = 28, firstName = "Raj", lastName = "Agarwal")
}

fun egreet(firstName: String, lastName: String,age: Int){
    println("Hello, $firstName $lastName! You are $age years old.")
}