package for_java_devs.m7wrapup.collections

fun main() {

    val languages = arrayOf("Java", "Kotlin")
    println(languages.size)
    println(languages[0])
    languages[0] = "Python"

    val numbers = IntArray(5) { i -> i + 1 }

    val list = listOf("Java", "Kotlin", "C#", "JavaScript")

    println(list.first())
    println(list.last())
    println(list.getOrElse(10) { "Rust" })

    val set = setOf("Java", "Java", "Kotlin")
    val map = mapOf(1 to "Val1", 2 to "Val2")

    val mutableList = mutableListOf(1,2,3)
    val mutableSet = mutableSetOf(1,2,3)
    val mutableMap = mutableMapOf(1 to "Val1", 2 to "Val2")
}
