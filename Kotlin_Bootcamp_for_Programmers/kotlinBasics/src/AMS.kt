import java.util.*

fun main(args: Array<String>) {
    println("Hello ${args[0]}")
    dayOfWeek()

    val isUnit = println("Is a expression")
    println(isUnit)

    var temperature = 5
    val isFried = temperature > 3
    println(isFried)

    val message = "The fish is ${if (temperature>3) "fried" else "raw"}"
    println(message)
}

fun dayOfWeek() {
    val numDayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println("What day is it today")
    var dayOfWeek: String ?= null
    when (numDayOfWeek){
        1 -> dayOfWeek = "Sunday"
        2 -> dayOfWeek = "Monday"
        3 -> dayOfWeek = "Tuesday"
        4 -> dayOfWeek = "Wednesday"
        5 -> dayOfWeek = "Thursday"
        6 -> dayOfWeek = "Friday"
        7 -> dayOfWeek = "Saturday"

    }
    println("Today is $dayOfWeek")
}