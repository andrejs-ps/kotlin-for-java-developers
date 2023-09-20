package m3_types_vars._3comparison;

public class VariablesComparison {

    public static void main(String[] args) {

        int num = 1;
        int num2 = 2;

        System.out.println(1 == 2); // false

        String s = "a";
        String s2 = "a";
        String s3 = new String("a");

        System.out.println(s == s2);    // true
        System.out.println(s == s3);    // false
        System.out.println(s.equals(s3));   // true

        String maybeNull = null;
        if ("abc".equals(maybeNull)) {   // false

        }
    }
}
