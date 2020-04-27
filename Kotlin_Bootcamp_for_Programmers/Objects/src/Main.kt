fun main() {
    buildObject()
}

fun buildObject() {
    val obj = Object()

    println("Width: ${obj.width}" +
            " Height: ${obj.height}" +
            " Length: ${obj.length}")

    obj.height = 80

    println("New height: ${obj.height} cm")

    println("Volume: ${obj.volume} liters")

    obj.volume = 100

    println("Width: ${obj.width}" +
            " Height: ${obj.height}" +
            " Length: ${obj.length}")

    println("Volume: ${obj.volume} liters")

}
