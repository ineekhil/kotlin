fun main(){

        val dayOfWeek = 7

        val dayString = when (dayOfWeek) {
            1 -> "Monday"
            2 -> "Tuesday"
            3 -> "Wednesday"
            4 -> "Thursday"
            5 -> "Friday"
            6 -> "Saturday"
            7 -> "Sunday"
            else -> "Invalid day"  // Handles any other value
        }

        println("Day of the week is: $dayString")
    }

fun guess() {
    val number = 10

    val result = when {
        number > 0 -> "Positive"
        number < 0 -> "Negative"
        else -> "Zero"
    }

    println("Number is $result")
}


