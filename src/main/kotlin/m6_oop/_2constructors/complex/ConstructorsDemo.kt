package for_java_devs.m6_oop._2constructors.complex

class PassengerKt1(val name: String, val bags: Int = 0, val paidMeal: Boolean = false) {

    init {
        validateName(name)
        validateBags(bags)
    }

    private fun validateBags(bags: Int) {
        if (bags < 0) throw IllegalArgumentException("nope!")
    }

    private fun validateName(name: String) {
        if (name.isBlank()) throw IllegalArgumentException("nope!")
    }
}

class PassengerKt2(val name: String, val bags: Int = 0, val paidMeal: Boolean = false) {
    init {
        require((name.isNotBlank())) { "Name cannot be blank" }
        require(bags >= 0) { "Number of bags cannot be negative" }
    }
}

fun main() {

}