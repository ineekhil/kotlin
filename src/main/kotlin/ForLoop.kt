fun main(){
    for (i in 1..100){
        println("Number: $i")
    }
    println()
    println("Iterate Backwards")

    downTo()
    println()
    println("Iterate with step")
    iterateWithStep()
}

fun downTo(){
    // Iterate over a range backend
    for (i in 100 downTo 1){
        println("Number: $i")
    }
}

fun iterateWithStep(){
    for (i in 2..100 step 2){
        println("Number: $i")
    }
}