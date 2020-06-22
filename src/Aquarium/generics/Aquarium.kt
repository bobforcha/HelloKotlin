package Aquarium.generics

open class WaterSupply(var needsProcessed: Boolean)

class TapWater: WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessed = false
    }
}

class FishStoreWater: WaterSupply(false)
class LakeWater: WaterSupply(true) {
    fun filter() {
        needsProcessed = false
    }
}

class Aquarium<T: WaterSupply>(val waterSupply: T) {
    fun addWater() {
        check(!waterSupply.needsProcessed) { "water supply needs processing" }
        println("adding water from ${waterSupply}")
    }
}

fun main(args: Array<String>) {
    val aquarium = Aquarium(TapWater())
    aquarium.waterSupply.addChemicalCleaners()
}