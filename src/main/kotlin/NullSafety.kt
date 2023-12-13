fun main() {
    var name1: String = "Sonam"
//    name1 =  null // not allowed because already assigned a value

    var name2: String? = ""
    name2 = null // this is allowed because there is question mark that mean it change be change or not fix value

    // also we can't find also
    // val name2Length = name2.length
    // println(name2Length)

    // but we can also find by using this
    val name2Length = if (name2 != null) name2.length else -1
    println(name2Length)
}