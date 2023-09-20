package for_java_devs.m5_functions._4extension

fun String.extractUniqueVowels() : Set<Char> {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    return this.lowercase().filter { vowels.contains(it) }.toSet()
}



fun main() {
    println("hello".last())
    println("hello".first())

    println("hello kotlin".extractUniqueVowels())
}