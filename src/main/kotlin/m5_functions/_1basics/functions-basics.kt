package for_java_devs.m5_functions._1basics

fun getString(): String {
    return ""
}

fun getNum(): Int {
    return 1
}

fun doThing() {
    print("msg")
}

fun greeting() = "Hello "

fun addTwentyPercent(num: Double) = num * 1.2

fun extractValueShort(line: String) = line.split(",")[1].trim().toInt()

val extractValueLong: (String) -> Int = {
    it.split(",")[1].trim().toInt()

}

fun main() {

    val stockPrices = """
                Apple,150
                Microsoft,300
                """.trimIndent()

    stockPrices.lines()
        .map{ extractValueShort(it) }
        .forEach { println(it) }

    stockPrices.lines()
        .map { extractValueLong(it) }
        .forEach { println(it) }
}