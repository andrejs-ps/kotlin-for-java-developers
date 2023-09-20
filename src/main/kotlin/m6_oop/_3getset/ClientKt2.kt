package for_java_devs.m6_oop._3getset

class ClientKt {

    var name: String = "Andrejs"

        get() = field.uppercase()

    var id: Int = 0
        get() = field
        set(value) {
            field = value
        }
}

class ClientKt2(name: String) {

    var name: String = name
        set(value) {
            // ...
        }
}


fun main() {

    val client = ClientKt()

    println(client.name)

    client.name = "Sofia"

    println(client.name)

    client.name = ""

    println("Will this be blank? -> ${client.name}")
}