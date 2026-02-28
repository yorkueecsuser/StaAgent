import java.util.*;

class DoNotMock {

    public static void main(String[] args) {
        // BUG: DoNotMock
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.add(6);
        System.out.println(numbers);

        // Unreachable if-else statement mutation
        boolean shouldNotRun = getCondition();
        if (shouldNotRun) {
            System.out.println("This code should not run!");
        } else {
            System.out.println("This code should run!");
        }
    }

    // Helper method to generate a non-final variable for the mutation
    public static boolean getCondition() {
        return true;
    }

}