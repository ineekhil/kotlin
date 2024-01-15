/****** Class and Object ******/
//Creating Class

class Mobile {
    //properties
    var  model: String = "Nothing"
    var price: Float = 10000.13F

    // member function
    fun discption(){
        println("Model = $model")
        println("Price = $price")
    }
}

fun main(){
    var lg = Mobile() // creating object
    lg.discption() // calling function member using object

    lg.model = "Apple"  // accessing properties using object
    lg.price = 75000F   // accessing properties using object
    lg.discption()
}