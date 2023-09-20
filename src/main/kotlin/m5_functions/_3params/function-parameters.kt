package for_java_devs.m5_functions._3params

fun greetAll(greeting: String, vararg names: String) {
    names.forEach { name -> println("$greeting $name") }
}

fun main() {

    greetAll("hi", "John", "Jake")

    val list = listOf("John", "Jake")

    greetAll("hi", *list.toTypedArray())

    println(abbreviate("Hello Java overloaded methods", 10)) // Hello J...

    println(abbreviate("Hello Java overloaded methods", 10, 5)) // ... Jav...

    println(abbreviate("Hello Java overloaded methods", 10, 0, ">>>")) // Hello J>>>

    println(abbreviate(
        str = "Hello Java overloaded methods",
        maxWidth = 10,
        abbrevMarker = ">>>")
    )
}

fun abbreviate(str: String, maxWidth: Int, offset: Int = 0, abbrevMarker: String = "..."): String {
    val abbrevMarkerLength = abbrevMarker.length
    val minAbbrevWidth = abbrevMarkerLength + 1
    val minAbbrevWidthOffset = abbrevMarkerLength + abbrevMarkerLength + 1
    require(maxWidth >= minAbbrevWidth) { String.format("Minimum abbreviation width is %d", minAbbrevWidth) }
    val strLen = str.length
    if (strLen <= maxWidth) {
        return str
    }
    if (offset <= abbrevMarkerLength + 1) {
        return str.substring(0, maxWidth - abbrevMarkerLength) + abbrevMarker
    }
    require(maxWidth >= minAbbrevWidthOffset) {
        String.format(
            "Minimum abbreviation width with offset is %d",
            minAbbrevWidthOffset
        )
    }
    return if (offset + maxWidth - abbrevMarkerLength < strLen) {
        abbrevMarker + abbreviate(
            str.substring(offset),
            maxWidth - abbrevMarkerLength,
            0,
            abbrevMarker
        )
    } else abbrevMarker + str.substring(strLen - (maxWidth - abbrevMarkerLength))
}