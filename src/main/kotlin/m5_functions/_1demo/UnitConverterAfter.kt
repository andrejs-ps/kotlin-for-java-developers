package for_java_devs.m5_functions._1demo

fun main() {

    val input = readln().split(" ")
    val value = input[0].toDouble()
    val unit = input[1]

    val converted = when (unit) {
        "yard", "yards" -> yardsToMeters(value)
        "mile", "miles" -> milesToMeters(value)
        "kilometer", "kilometers" -> kilometersToMeters(value)
        else -> throw IllegalArgumentException("Unknown unit $unit")
    }

    val displayMeter = if(converted == 1.0) "meter" else "meters"
    println("$value $unit is $converted $displayMeter")
}

private fun kilometersToMeters(value: Double) = value.times(1000)

private fun milesToMeters(value: Double) = value.times(1609.34)

private fun yardsToMeters(value: Double) = value.times(0.9144)