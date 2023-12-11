fun main(){
    var x = 5

    //do-while loop
    do {
        println("Value of x: $x")
        x--   // for decrement
    }while (x>0)

    println()
    breakDown()
    println("contine from here")
    contineGo()
}

fun breakDown(){
    var i = 1

    //Infinite loop
    while (true){
        println("Interation: $i")
        i++

        if (i>4){
            break //exit the loop when i exceeds 5
        }
    }
}

fun contineGo(){
    var j = 1

    //Using continue in a while loop
    while (j<=5){
        if (j==3){
            j++
            continue // Skip the rest of the loop body for j ==3
        }
        println("Value of j: $j")
        j++
    }

}