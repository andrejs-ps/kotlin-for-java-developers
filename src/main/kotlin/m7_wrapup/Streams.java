package m7_wrapup;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {

        var list = Arrays.asList("Java", "kotlin", "C", "C++", "c#", null);

        list.stream()
                .filter(Objects::nonNull)
                .map(String::toUpperCase)
                .collect(Collectors.toMap(str -> str, String::length))
                .forEach((k,v) -> System.out.println(k + "=" + v));
    }
}
