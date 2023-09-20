package for_java_devs.m6_oop.notcovered


data class Book(val title: String,
                val author: String)


fun main() {

    val book = Book("Great Title", "Great Author")

    println(book.title)
    println(book.author)
}

