import java.util.*

fun main(args : Array<String>) {
    println(canAddFish(10.0, listOf(3,3,3)))
    println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false))
    println(canAddFish(9.0, listOf(1,1,3), 3))
    println(canAddFish(10.0, listOf(), 7, true))
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
}

fun randomDay() : String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day : String) : String {
    return when(day) {
        "Monday" -> "flakes"
        "Tuesday" -> "redworms"
        "Wednesday" -> "granates"
        "Thursday" -> "mosquitoes"
        "Friday" -> "pellets"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}

fun canAddFish(
    tankSize: Double,
    currentFish: List<Int>,
    fishSize: Int = 2,
    hasDecorations : Boolean = true) : Boolean {
    return (if (hasDecorations) 0.8 else 1.0) * tankSize >= currentFish.sum() + fishSize
}