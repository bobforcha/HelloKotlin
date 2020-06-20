fun main(args: Array<String>) {
    whatShouldIDoToday("sad")
}

fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24
    ) : String {
    return when {
        mood == "happy" && weather == "sunny" -> "go for a walk"
        mood == "happy" && weather == "rainy" -> "play music"
        mood == "sad" && weather == "sunny" -> "wear a dress"
        mood == "sad" && weather == "rainy" -> "be goth"
        temperature < 0 -> "Stay in. It's too cold"
        temperature > 30 -> "Get out of the sun"
        else -> "Stay home and pout"
    }
}