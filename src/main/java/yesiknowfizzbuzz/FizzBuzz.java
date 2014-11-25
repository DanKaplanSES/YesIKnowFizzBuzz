package yesiknowfizzbuzz;

public class FizzBuzz {

    public static void main(String[] args) {
        for (Integer element = 0; element < 100; element++) {
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
