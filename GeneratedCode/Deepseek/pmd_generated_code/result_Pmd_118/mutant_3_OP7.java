import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class BugExample {
    public void showBug(Integer[] ints) {
        // BUG: UseArraysAsList
        List<Integer> l = Arrays.asList(ints);
        l.add(10); // This line will cause an UnsupportedOperationException

        // Mutation Operator: Unreachable while loop
        // Non-final variable used to ensure the loop condition is dynamically determined at runtime
        boolean condition = false;
        while (condition) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }

    public static void main(String[] args) {
        BugExample bug = new BugExample();
        Integer[] ints = {1, 2, 3, 4, 5};
        bug.showBug(ints);
    }
}