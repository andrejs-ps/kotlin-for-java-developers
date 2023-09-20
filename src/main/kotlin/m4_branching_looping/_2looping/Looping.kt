package for_java_devs.m4_branching_looping._2looping

fun main() {

    repeat(3) {
        println("Do whatever")
    }

    val a = 2
    do {
        // body: do something
    } while (a > 3)

    var index = 0
    val languages = arrayOf("Java", "Kotlin")
    while (index < languages.size) {
        println(languages[index])
        index++
    }


    for(lang in languages) {
        println(lang)
    }

    for((i, value) in languages.withIndex()) {
        println("$i $value")
    }

    for(i in 1 until 6) {}

    for(x in 6 downTo 1) {}

    for(x in 6 downTo 1 step 2) {}


    languages.forEach {
        lang -> println(lang)
    }

    languages.forEach {
        println(it)
    }

    languages.forEachIndexed{i, lang ->
        println("$lang is at index $i")

    }
}