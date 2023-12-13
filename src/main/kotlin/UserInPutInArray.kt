fun main(){
    print("Enter array size: ")
    val num = readLine()!!.toInt()  //take from user and set number of size of array

    println("Enter student name: ")
    val students = Array(num) { readLine()!! }  // user input = number of num

    for (student in students){ //if students = num then print
        println(student)
    }
}