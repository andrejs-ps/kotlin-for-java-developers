package for_java_devs.m6_oop._2constructors.simple

class PassengerKt1 {
    val name: String
    val bags: Int
    val paidMeal: Boolean

    constructor(name: String) {
        this.name = name
        this.bags = 0
        this.paidMeal = false
    }

    constructor(name: String, bags: Int) {
        this.name = name
        this.bags = bags
        this.paidMeal = false
    }

    constructor(name: String, bags: Int, paidMeal: Boolean) {
        this.name = name
        this.bags = bags
        this.paidMeal = paidMeal
    }
}

class PassengerKt2 {
    val name: String
    val bags: Int
    val paidMeal: Boolean

    constructor(name: String) : this(name, 0)

    constructor(name: String, bags: Int) : this(name, bags, false)

    constructor(name: String, bags: Int, paidMeal: Boolean) {
        this.name = name
        this.bags = bags
        this.paidMeal = paidMeal
    }
}

class PassengerKt3(val name: String, val bags: Int, val paidMeal: Boolean) {

    constructor(name: String) : this(name, 0)

    constructor(name: String, bags: Int) : this(name, bags, false)
}


class PassengerKt4(val name: String, val bags: Int = 0, val paidMeal: Boolean = false)


fun main() {

    val passenger = PassengerKt4("Jane")
    println("${passenger.name} ${passenger.bags} ${passenger.paidMeal}")
}