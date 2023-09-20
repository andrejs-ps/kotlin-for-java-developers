package for_java_devs.m4_branching_looping._1demo

fun main() {

    val input = readln().split(" ")

    val value = input[0].toDouble()
    val unit = input[1]

    var converted: Double? = null
    if(unit == "yard" || unit == "yards") {
        converted = value.times(0.9144)
    } else if(unit == "mile" || unit == "miles") {
        converted = value.times(1609.34)
    } else if(unit == "kilometer" || unit == "kilometers") {
        converted = value.times(1000)
    }

    var displayMeter: String?
    if(converted == 1.0) {
        displayMeter = "meter"
    } else {
        displayMeter = "meters"
    }

    println("$value $unit is $converted $displayMeter")
}