package Aquarium

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {

    var volume: Int
        get() = width * height * length / 1000
        private set(value) {height = (value * 1000 / (width * length))}

    var water = volume * 0.9

    constructor(numberOfFish: Int): this() {
        val water =  numberOfFish * 2000
        val tank = water * 1.1
        height = (tank / (length * width)).toInt()
    }
}