package Aquarium.decorations

fun main(args: Array<String>) {
    makeDecorations()
}

fun makeDecorations() {
    val d1 = Decorations("granite")
    println(d1)
    val d2 = Decorations("slate")
    println(d2)
    val d3 = Decorations("slate")
    println(d3)

    println(d1.equals(d2))
    println(d2.equals(d3))
}

data class Decorations(val rocks: String) {}