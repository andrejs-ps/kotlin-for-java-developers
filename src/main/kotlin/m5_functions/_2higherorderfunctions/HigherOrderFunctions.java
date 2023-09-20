package m5_functions._2higherorderfunctions;

import java.util.List;
import java.util.function.Predicate;

public class HigherOrderFunctions {

    static void printFilteredStrings(List<String> list, Predicate<String> predicate) {
        list.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {

        var list = List.of("Kotlin", "Java", "C++", "JavaScript");

        printFilteredStrings(list, s -> s.startsWith("J"));

        printFilteredStrings(list, s -> {
            System.out.println("Found one!");
            return s.startsWith("J");
        });

        Predicate<String> startsWithK = s -> s.startsWith("K");
        printFilteredStrings(list, startsWithK);
    }
}
