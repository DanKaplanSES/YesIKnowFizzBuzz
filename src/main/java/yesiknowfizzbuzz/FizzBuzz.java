package yesiknowfizzbuzz;

public class FizzBuzz {

    public static void main(String[] args) {
        for (Integer value = 1; value <= 100; value++) {
            System.out.print(value + ": ");
            if (value % 3 == 0) {
                System.out.print("Fizz");
            }
            if (value % 5 == 0) {
                System.out.print("Buzz");
            }
            if (value % 3 != 0 && value % 5 != 0) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

}
