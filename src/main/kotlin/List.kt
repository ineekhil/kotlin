fun main(){
    val data = listOf("Apple","Mango","Pineapple", "Banana")
    println(data)
    println(data[2])
    println(data[3])
    println(data.get(1))

    //print all at once using for loop
    for (dt in data){
        println(dt)
    }
    // print list size
    println("List size is: ${data.size}")

    //print by with indices & data
    for (i in data.indices){
        println("$i = ${data[i]}")
    }
    // print list by using forEach
    data.forEach{dt -> println(dt) }

    //define dataType in list
    val names = listOf <String>("Virat", "Messi", "Ronaldo", "Elon")
    println(names)

    //this is how we define mutable list
    val memory = mutableListOf("Macbook", "Samsung","Asus","Dell","HP","MSI")
    println(memory)

    memory[0] ="Windows" //update/modify
    println(memory)

    memory.add(6,"Zebronics")  // add in mutable list
    println(memory)

    memory.removeAt(4)  //remove
    println(memory)

    //specify data type
    val banks = mutableListOf <String>("ICICI", "SBI", "Inudsind", "Paytm")
    println(banks)

}