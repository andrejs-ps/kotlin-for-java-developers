package for_java_devs.m4_branching_looping._1branching


fun main() {

    val str = "a string"
    when (str.length) {
        null -> println("no string")
        1 -> println("short string")
        8 -> println("exact length")
        else -> println("something else")   // aka "default" in Java
    }

    val match = when (str) {
        "a string" -> "match"
        else -> "no match"
    }


    val x = 5
    val numResult = when (x) {
        0, 5 -> "0 or 5"
        in 1..10 -> "from 1 to 10"
        !in 12..14 -> "not from 12 to 14"
        !in listOf(1, 2) -> "..."
        else -> "I give up!"
    }

    when {
        x == 5 -> println("this")
        x.times(2) < 10 -> println("that")
    }
}

