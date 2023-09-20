package for_java_devs.m6_oop.notcovered

enum class DayOfWeek {
    MONDAY, TUESDAY, SUNDAY;

    fun formattedName() = name.lowercase().replaceFirstChar(Char::titlecase)
}


enum class Month(private val month: String, val position: Int) {
    JAN("January", 1),
    FEB("February", 2);


    fun position(): Int {
        return position
    }

    override fun toString(): String {
        return month;
    }

}

fun main() {

    println(DayOfWeek.MONDAY)   // MONDAY
    println(Month.JAN)          // January

    println(DayOfWeek.TUESDAY.formattedName())  // Tuesday

    println(Month.FEB.position())   // 2
    println(Month.FEB.position)     // 2

    val day = DayOfWeek.SUNDAY

    when (day) {
        DayOfWeek.SUNDAY -> println("rest")
        else -> println("work")
    }
}