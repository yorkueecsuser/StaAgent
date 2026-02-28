import java.util.*;

class DoNotMock {

    public static void main(String[] args) {
        // BUG: DoNotMock
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.add(6);
        System.out.println(numbers);

        // Unreachable if statement mutation
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable branch.");
        }
    }

    private static boolean getCondition() {
        return false;
    }
}