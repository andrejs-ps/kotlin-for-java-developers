package for_java_devs.m3_types_vars._1types

val oneMillion = 1_000_000

fun main() {

    val zero = 0
    val oneMillion: Int = 1_000_000

    val twoMillion = 2_000_000L
    val bigNumber = 1_000_000_000_000_000   // infer as Long

    val float = 1.5f
    val double = 1.0    // default to double

    val char = 'a'
    val str = "a"
    val bool = false


    val someInt = 5
    println(someInt.toString())
    println(someInt.toString(2))

    println(someInt.times(5))
    println(someInt.rangeTo(10))

    if(bool.or(true)) {
        // ...
    }


    val validConcat = "a" + 1
//    val invalidConcat = 1 + "a"

    val i = 1
    val d = 2.0
    val result = i.plus(d)

    val r = sum(i.toDouble(), i.toDouble())

    val name = "John"
    val greeting = "Hello $name";
    val temp = "In two years I will be ${35 + 2}"
    println(greeting)
    println(temp)

}

fun sum(a: Double, b: Double): Double {
    return a + b
}

