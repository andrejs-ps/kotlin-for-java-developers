package for_java_devs.m3_types_vars._5demo

fun main() {

    val input = readln().split(" ")

    val value = input[0].toDouble()
    val unit = input[1]

    var converted: Double? = null
    if(unit == "yards") {
        converted = value.times(0.9144)
    } else if(unit == "miles") {
        converted = value.times(1609.34)
    }

    println("$value $unit is $converted meter(s)")
}