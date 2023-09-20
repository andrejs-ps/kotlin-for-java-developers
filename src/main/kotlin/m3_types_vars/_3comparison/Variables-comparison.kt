package for_java_devs.m3_types_vars._3comparison

fun main() {
    val line1 = "line 1"
    val line2 = "line 1"

    println(line1 == line2)
    println(line1 === line2)

    println(Person("John") == Person("John"))   // false

    println(Person2("John") == Person2("John"))   // true
}

class Person(val name: String)  // no default equals

data class Person2(val name: String)    // like Java record, has default equals