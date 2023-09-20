package m4_branching_looping._1branching;

public class Switching {

    private static void print(Object o) {
        System.out.println(o);
    }

    public enum FruitType {APPLE, PEAR, PINEAPPLE, KIWI}

    public static void main(String[] args) {

        String output;
        switch (FruitType.KIWI) {
            case APPLE, PEAR:
                output = "Common fruit";
                break;
            case PINEAPPLE, KIWI:
                // ..
                break;
            default:
                throw new IllegalArgumentException("...");
        }
    }


    private static void withSwitchExpression(FruitType fruit) {

        switch (fruit) {
            case APPLE, PEAR -> print("Common fruit");
            case PINEAPPLE -> print("Exotic fruit");
            default -> print("Undefined fruit");
        }
    }


    private static String switchExpressionWithReturn(FruitType fruit) {
        return switch (fruit) {
            case APPLE, PEAR -> "Common fruit";
            case PINEAPPLE -> "Exotic fruit";
            default -> "Undefined fruit";
        };
    }
}
