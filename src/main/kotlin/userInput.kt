import java.util.*

/******* User Input *******/
// using readLine()
//fun main(){
//    print("Enter which you want to print: ")
////     val name = readLine()
////    println("Printed Successfully: $name")
//
//    //Specific input
//    val name: String? = readLine()
//    println(name)
//    println(name!!::class.simpleName)
//
//    val roll= readLine()!!.toInt()  // this is use to stored as int
//    println(roll)
//    println(roll::class.simpleName)
//
//}
/******* Using Scanner Class *******/
fun main(){
    val sc = Scanner(System.`in`)
    val name = sc.next()
    print(name)
}