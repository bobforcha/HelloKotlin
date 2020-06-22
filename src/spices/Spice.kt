package spices

fun main(args: Array<String>) {
    val spiceCabinet = listOf<SpiceContainer>(
            SpiceContainer(Curry("Yellow Curry", "medium")),
            SpiceContainer(Curry("Green Curry", "mild")),
            SpiceContainer(Curry("Red Curry", "spicy"))
    )

    for(container in spiceCabinet) println(container.label)
}

sealed class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor): SpiceColor by color {
    val heat: Int
        get() = when(spiciness) {
            "mild" -> 1
            "medium" -> 3
            "spicy" -> 5
            "very spicy" -> 7
            "extremely spicy" -> 9
            else -> 0
        }

    abstract fun prepareSpice()
}

class Curry(name: String,
            spiciness: String,
            color: SpiceColor = YellowSpiceColor): Spice(name, spiciness, color), Grinder {
    override fun grind() {}
    override fun prepareSpice() {
        grind()
    }
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor: SpiceColor {
    override val color = Color.YELLOW
}

data class SpiceContainer(var spice: Spice, var label: String = spice.name)

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00)
}