package m6_oop._1classes_interfaces.java;

public abstract class AbstractTranslationService implements TranslationService {

    private final String apiKey;

    public AbstractTranslationService(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiKey() {
        return apiKey;
    }
}
