package for_java_devs.m3_types_vars._5demo

fun main() {

    var input: String? = readLine();

    var value: Double? = null
    var unit: String? = null

    if(input != null) {
        var split = input.split(" ")
        value = split[0].toDouble()
        unit = split[1]
    }

    var converted: Double? = null
    if(unit == "yards") {
        converted = value?.times(0.9144)
    } else if(unit == "miles") {
        converted = value?.times(1609.34)
    }

    val output = value.toString() + " " + unit + " is " + converted + " meter(s)"

    println(output)
}