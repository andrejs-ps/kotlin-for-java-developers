package m4_branching_looping._2looping;

import java.util.List;

public class LoopingDemo {

    public static void main(String[] args) {

        // while and do-while

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // for-each
        var list = List.of(1, 2, 3);

        for(int num : list) {
            System.out.println(num);
        }

        list.forEach(System.out::println);

        // streams
        list.stream()
                .filter( n -> n < 2)
                .forEach(System.out::println);
    }
}
