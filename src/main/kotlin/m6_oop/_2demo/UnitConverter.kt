package for_java_devs.m6_oop._2demo.before

class FromMileConverter(private val miles: Double) {

    fun toKilometers() = miles.times(1.609)

    fun toMeters() = miles.times(1609)

    fun toYards() = miles.times(1760)
}

fun main() {

    val newYorkToSanFran = 2_906.0

    val converter = FromMileConverter(newYorkToSanFran)

    val output = """
        $newYorkToSanFran miles is:
        ${converter.toKilometers()} kilometers
        ${converter.toMeters()} meters
        ${converter.toYards()} yards
    """.trimIndent()

    println(output)
}