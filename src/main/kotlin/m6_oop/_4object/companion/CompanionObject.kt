package for_java_devs.m6_oop._4object.companion

class Dictionary private constructor(val language: String) {

    companion object {

        fun english(): Dictionary {
            return Dictionary("English")
        }

        fun spanish(): Dictionary {
            return Dictionary("Spanish")
        }

    }
}

fun main() {
    val englishDictionary = Dictionary.english()
    println(englishDictionary.language)
}
