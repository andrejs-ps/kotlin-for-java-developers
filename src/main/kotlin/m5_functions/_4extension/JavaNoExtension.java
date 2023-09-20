package m5_functions._4extension;

public class JavaNoExtension {

    public static void main(String[] args) {
        String str = "Hello Kotlin";

        lastChar(str);

    }

    static char lastChar(String str) {
        return str.charAt(str.length() -1);
    }

}
