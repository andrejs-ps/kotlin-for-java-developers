package for_java_devs.m5_functions._2higherorderfunctions

fun printFilteredStrings(list: List<String>, predicate: (String) -> Boolean) {
    list.filter(predicate).forEach(::println)
}

fun main() {
    val list = listOf("Kotlin", "Java", "C++", "JavaScript")

    printFilteredStrings(list, { string -> string.startsWith("J") })

    printFilteredStrings(list, { it -> it.startsWith("J") })

    printFilteredStrings(list, { it.startsWith("J") })

    printFilteredStrings(list) { it.startsWith("J") }       // prefer

    val startsWithC = { string: String -> string.startsWith("C") }

    printFilteredStrings(list, startsWithC)

}


