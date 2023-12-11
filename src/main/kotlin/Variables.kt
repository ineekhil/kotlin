fun main(){
    // In kotlin we declare in two way
    var name = "Jethalal"  // "var" if you use var then you can reassign later by using var
    println("Before reassign: $name")

    name = "Dilip Joshi"
    println("After reassign: $name")

    val personName:String = "Aatma Ram Bhide"   // you cannot do type interfered in val OR you cannot reassigned value
    println(personName)
}