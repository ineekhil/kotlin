//primary constructor
class Person constructor(val name:String, val age:Int){
    //properties
    var gender:String = "Female"

    // member function
    fun bioData(){
        println("Name = $name")
        println("Age = $age")
        println("Gender = $gender")
    }
}

class Human (name:String, age:Int){
    //properties
    var hName:String
    var hAge:Int = age
    var gender:String = "Female"

    init {
        hName = name
//        hAge = age
    }

    //member function
    fun disp(){
        println("Name = $hName")
        println("Age = $hAge")
        println("Age $gender")
    }
}

fun main() {
    val p1 = Person("Avinash",24)
    p1.bioData()
    p1.gender = "Male"
    p1.bioData()

    val p2 = Human("Suman", 23)
    p2.disp()
}