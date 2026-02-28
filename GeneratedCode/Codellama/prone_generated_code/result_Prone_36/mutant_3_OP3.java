import java.util.*;

class DoNotMock {

    public static void main(String[] args) {
        // BUG: DoNotMock
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.add(6);

        // Mutation Operator: Unreachable if statement
        if (false) {
            System.out.println("This code is unreachable");
        }

        System.out.println(numbers);
    }

}