//Secondary Construction

class People{
    //properties
    var name:String
    var hAge: Int
    var gender:String = "Male"

    // Secondary Constructor
    constructor(name:String, age:Int){
        println("Constructor called")
        this.name = name   // using this
        hAge = age
    }

    //member function
    fun disp(){
        println("Name = $name")
        println("Age = $hAge")
        println("Gender = $gender")
    }

}

fun main() {
    val p1 = People("Avinash", 33)
    p1.disp()
}