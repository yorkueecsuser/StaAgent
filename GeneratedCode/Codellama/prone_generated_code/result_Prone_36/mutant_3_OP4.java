import java.util.*;

class DoNotMock {

    public static void main(String[] args) {
        // BUG: DoNotMock
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.add(6);
        System.out.println(numbers);

        // Mutation Operator: Unreachable if-else statement
        // Description: Inserting unreachable if-else branch into a randomly selected basic block in the program. The condition of the inserted branch is always false to make it unreachable.
        boolean condition = false;
        if (condition) {
            // do something
        } else {
            // do something else
        }
    }

}