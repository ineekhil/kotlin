fun main(){
    val name = mapOf("key1" to "Avinash", "key2" to "sharma", "key3" to "Abhisekh")
    println(name)
     for (dt in name){
         println(dt)
     }

    for (key in name.keys){
        println("$key = ${name[key]}")
    }

    //mutable mapOf
    val data = mutableMapOf<Int, String>(1 to "Apple", 2 to "Sunny", 3 to "Prateek")
    println(data)

    data[1] = "Mango"  //update
    println(data)

    data[4] = "Payal" //add
    println(data)

    //another method to update
    data.put(4, "Sachin")
    println(data)

    //this is how we remove
    data.remove(3)
    println(data)

    // another way to remove
    data.keys.remove(2)
    println(data)

    data.values.remove("Mango")
    println(data)
}