package m6_oop._1classes_interfaces.java;

import java.util.List;

public interface TranslationService {

    String translate(String sourceLanguage,
                     String targetLanguage,
                     String input);

    default List<String> getSupportedLanguages() {
        return List.of("English", "Spanish", "French");
    }
}
