package m5_functions._1basics;

import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionsBasics {

    String getString() {
        return "";
    }

    void doThing() {
        //
    }


    static Supplier<String> greeting = () -> "Hello ";
    static Supplier<Person> bob = () -> new Person("Bob");

    static Function<Double, Double> addTwentyPercent = num -> num * 1.2;

    static Function<String, Integer> extractValue = line -> {
        String[] tokens = line.split(",");
        return Integer.parseInt(tokens[1].trim());
    };


    public static void main(String[] args) {

        System.out.println(greeting.get() + bob.get());

        String stockPrices = """
                Apple,150
                Microsoft,300
                """;

        stockPrices.lines()
                .map(extractValue)
                .forEach(System.out::println);

    }
}

record Person(String name) {
}

