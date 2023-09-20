package m3_types_vars._4nullability;


import java.util.Optional;

public class NullsInJava {


    public static void main(String[] args) {

        String inputStr = args[0];

        int input = Optional
                .ofNullable(inputStr)
                .map(Integer::parseInt)
                .orElse(0);

    }
}
