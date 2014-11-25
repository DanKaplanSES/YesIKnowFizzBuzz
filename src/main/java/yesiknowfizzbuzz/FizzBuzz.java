package yesiknowfizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        for (Integer i = 0; i < 100; i++) {
            input.add(i);
        }

        for (Integer element : input) {
            System.out.print("element " + element + ": ");
            if (element % 3 == 0) {
                System.out.print("Fizz");
            }
            if (element % 5 == 0) {
                System.out.print("Buzz");
            }
            if (element % 3 != 0 && element % 5 != 0) {
                System.out.print(element);
            }
            System.out.println();
        }
    }

}
