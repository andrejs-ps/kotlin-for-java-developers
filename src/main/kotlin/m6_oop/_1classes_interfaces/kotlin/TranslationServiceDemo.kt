package for_java_devs.m6_oop._1classes_interfaces.kotlin

interface TranslationService {

    fun translate(sourceLanguage: String, targetLanguage: String, input: String): String

    fun getSupportedLanguages(): List<String> {
        return listOf("English", "Spanish", "French")
    }
}

abstract class AbstractTranslationService(private val apiKey: String) : TranslationService {
    fun getApiKey(): String {
        return apiKey
    }
}


class GoogleTranslationService(apiKey: String) : AbstractTranslationService(apiKey) {
    override fun translate(sourceLanguage: String, targetLanguage: String, input: String): String {
        // Use Google Cloud Translation API
        // https://cloud.google.com/translate
        return ""
    }
}

//class SneakySubclass : GoogleTranslationService

fun main() {
    val translator = GoogleTranslationService("abc-123")
}