import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public void showBug(Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);

        // Inserted unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block will never be executed
        }

        list.add(10); // BUG: UseArraysAsList - UnsupportedOperationException will be thrown at runtime
    }

    private boolean getCondition() {
        // Implement the logic to determine the condition dynamically
        return false; // For the demonstration, return false
    }
}