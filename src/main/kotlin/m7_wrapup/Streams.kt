package for_java_devs.m7wrapup.collections


fun main() {
    val languages = listOf("JavaScript", "Kotlin", "java", "C", "C++", "c#", null)


    languages
        .filterNotNull()
        .filter { !it.startsWith("C") }
        .map { it.uppercase() }
        .associateWith { it.length }
        .forEach { println(it) }


    val list = languages.asSequence()
        .filterNotNull()
        .filter {
            println("Filtering $it")
            it.length > 2
        }
        .map {
            println("Mapping $it")
            it.uppercase()
        }
        .take(2)

    println(list.joinToString())
}