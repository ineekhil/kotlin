fun main(){
    val data = setOf("Sonam", "Rahul", "Sumit", 100, 'M', "Sonam")  //Set remove the duplicate in output
    println(data)

 //mutable set
    val storeRoom = mutableSetOf("Android","iOS", "Linux")
    println(storeRoom)

    //print using for loop
    for (dt in storeRoom){
        println(dt)
    }

    // add in set
    storeRoom.add("Windows")
    println(storeRoom)

    //remove from set
    storeRoom.remove("iOS")
    println(storeRoom)

    //define dataType in set
    val container = mutableSetOf<String>("Apple","Blackberry","Nothing")
    println(container)
}