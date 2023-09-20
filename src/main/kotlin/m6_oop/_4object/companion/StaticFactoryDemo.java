package m6_oop._4object.companion;

import java.time.Instant;

public class StaticFactoryDemo {

    static class Dictionary {

        private final String language;

        private Dictionary(String language){
            this.language = language;
        }

        public static Dictionary english() {
            return new Dictionary("English");
        }

        public static Dictionary spanish() {
            return new Dictionary("Spanish");
        }
    }



    public static void main(String[] args) {

        var spanishDictionary = Dictionary.spanish();

        var num = Integer.valueOf("1");
        var instant = Instant.now();

    }


}
