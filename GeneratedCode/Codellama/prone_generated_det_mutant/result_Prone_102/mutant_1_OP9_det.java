import java.util.ArrayList;

class LoopConditionChecker {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        { int i = 0; do { sum += numbers[i]; i++; } while (i < numbers.length); }
        System.out.println("The sum of the numbers is: " + sum);
    }
}