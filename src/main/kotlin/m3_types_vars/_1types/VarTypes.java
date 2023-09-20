package m3_types_vars._1types;

public class VarTypes {

    int zero = 0;
    int num = 1_000_000;

    static Integer wrappedInt = 0;

    long longNum = 0L;
    double zero2 = 0d;
    boolean bool = true;

    // + byte, short, long, float, char
    String s = "";


    public static void main(String[] args) {

        var num = 10;   // can't invoke methods on a primitive

        // can only call methods on Wrapper Objects
        var intString = wrappedInt.toString();
        int i = Integer.parseInt("1");
        String binary = Integer.toBinaryString(2);

        var valid = 1 + "a";
        var valid2 = "b" + 1;

        System.out.println(valid);
        System.out.println(valid2);


        int a = 1;
        double d = 2.0;
        var result = a + d; // double


        System.out.println(sum(a, a));
        System.out.println(sum(d, d));
        System.out.println(sum(1L, 2L));


        var name = "John";
        var greeting = String.format("Hello %s", name);
    }

    static double sum(double a, double b) {
        return a + b;
    }
}
