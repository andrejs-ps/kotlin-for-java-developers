package for_java_devs.m3_types_vars._4nullability

fun main() {

    var str = "a"

    var str2: String? = null

    val input: String? = readlnOrNull()
    if (input == null) {
    }


    val input2: Int? = readlnOrNull()?.toInt()      // safe call

    val input3: Int = readlnOrNull()?.toInt() ?: 0  // safe call + elvis operator

    val input4: Int = readlnOrNull()!!.toInt()      // not-null assertion operator
}

