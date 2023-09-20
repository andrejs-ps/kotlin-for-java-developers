package for_java_devs.m4_branching_looping._1branching

fun main() {

    val age = 21
    if (age < 21) {
        println("hi")
    } else {
        println("bye")
    }

    val price = 10
    val result = if(price < 10) "cheap" else "expensive"

}

fun doThing(price: Int): String {
    return if (price < 10) "cheap" else "expensive"
}


fun doThing2(price:Int): String =
    if(price < 10) {
        // logic
        "cheap"
    } else {
        "expensive"     // no return keyword
    }
