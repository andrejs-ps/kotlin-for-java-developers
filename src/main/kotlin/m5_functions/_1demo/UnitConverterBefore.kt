package for_java_devs.m5_functions._1demo

fun main() {

    val input = readln().split(" ")

    val value = input[0].toDouble()
    val unit = input[1]

    val converted = when (unit) {
        "yard", "yards" -> value.times(0.9144)
        "mile", "miles" -> value.times(1609.34)
        "kilometer", "kilometers" -> value.times(1000)
        else -> throw IllegalArgumentException("Unknown unit $unit")
    }

    val displayMeter = if(converted == 1.0) "meter" else "meters"

    println("$value $unit is $converted $displayMeter")
}