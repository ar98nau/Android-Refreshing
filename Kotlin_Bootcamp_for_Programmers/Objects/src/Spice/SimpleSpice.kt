package Spice

class Spice (var name: String, var spiciness: String = "mild"){

    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }

    init {
        println("Name: $name\n" +
                "Spiciness: $spiciness\n" +
                "Heat: $heat")
    }

    override fun toString(): String {
        return "Name: $name" +
                "Spiciness: $spiciness" +
                "Heat: $heat"
    }


}

fun main() {
    var spices1 = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
    )

    var spice = Spice("cayenne", spiciness = "spicy")

    makeSalt()

    val spicelist = spices1.filter {it.heat < 5}

    println(spicelist.toString())
}

fun makeSalt() = Spice("Salt")