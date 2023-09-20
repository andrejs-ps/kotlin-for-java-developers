package m6_oop._1classes_interfaces.java;

public final class GoogleTranslationService extends AbstractTranslationService {

    public GoogleTranslationService(String apiKey) {
        super(apiKey);
    }

    @Override
    public String translate(String sourceLanguage, String targetLanguage, String input) {
        // Use Google Cloud Translation API
        // https://cloud.google.com/translate
        return "";
    }
}
