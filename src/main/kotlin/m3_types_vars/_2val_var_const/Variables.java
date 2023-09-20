package m3_types_vars._2val_var_const;

public class Variables {

    String greeting = "Hi";
    static String greeting2 = "Hi";
    final String greeting3 = "Hi";
    static final String GREETING_4 = "Hi";

    public static void main(String[] args) {

        greeting2 = "Hello";
        var greeting4 = "Hi";
        var thing = new MyThingWithLongName();
    }

    static class MyThingWithLongName {
    }

}
