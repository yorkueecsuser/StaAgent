import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public void showBug(Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);

        // Adding unreachable switch statement
        boolean conditionSwitch = getCondition();
        if (!conditionSwitch) {
            int value = 0;
            switch (value) {
                case 1:
                    // This code will never execute
                    System.out.println("Unreachable code");
                    break;
            }
        }

        list.add(10); // BUG: UseArraysAsList - UnsupportedOperationException will be thrown at runtime
    }

    // Method to dynamically determine the condition for the switch statement
    private boolean getCondition() {
        return false; // Always return false to make the switch unreachable
    }
}