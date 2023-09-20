package m5_functions._3params;

import java.util.List;

public class FunctionParameters {

    public static void greetAll(String greeting, String... names) {
        for (String name : names) {
            System.out.printf("%s %s%n", greeting, name);
        }
    }

    public static void main(String[] args) {
        greetAll("hi", "John", "Jake");

        var list = List.of("John", "Jake");
        greetAll("hi", list.toArray(new String[0]));


        System.out.println(abbreviate("Hello Java overloaded methods", 10));                                // Hello J...
        System.out.println(abbreviate("Hello Java overloaded methods", 5, 10));                      // ... Jav...
        System.out.println(abbreviate("Hello Java overloaded methods", ">>>", 10));            // Hello J>>>
        System.out.println(abbreviate("Hello Java overloaded methods", ">>>", 5, 10));  // >>> Jav>>>
    }

    // Taken from Apache Utils Strings library
    public static String abbreviate(final String str, final int maxWidth) {
        return abbreviate(str, "...", 0, maxWidth);
    }

    public static String abbreviate(final String str, final int offset, final int maxWidth) {
        return abbreviate(str, "...", offset, maxWidth);
    }

    public static String abbreviate(final String str, final String abbrevMarker, final int maxWidth) {
        return abbreviate(str, abbrevMarker, 0, maxWidth);
    }

    public static String abbreviate(final String str, final String abbrevMarker, int offset, final int maxWidth) {
        final int abbrevMarkerLength = abbrevMarker.length();
        final int minAbbrevWidth = abbrevMarkerLength + 1;
        final int minAbbrevWidthOffset = abbrevMarkerLength + abbrevMarkerLength + 1;

        if (maxWidth < minAbbrevWidth) {
            throw new IllegalArgumentException(String.format("Minimum abbreviation width is %d", minAbbrevWidth));
        }
        final int strLen = str.length();
        if (strLen <= maxWidth) {
            return str;
        }

        if (offset <= abbrevMarkerLength + 1) {
            return str.substring(0, maxWidth - abbrevMarkerLength) + abbrevMarker;
        }
        if (maxWidth < minAbbrevWidthOffset) {
            throw new IllegalArgumentException(String.format("Minimum abbreviation width with offset is %d", minAbbrevWidthOffset));
        }
        if (offset + maxWidth - abbrevMarkerLength < strLen) {
            return abbrevMarker + abbreviate(str.substring(offset), abbrevMarker, 0, maxWidth - abbrevMarkerLength);
        }
        return abbrevMarker + str.substring(strLen - (maxWidth - abbrevMarkerLength));
    }
}
