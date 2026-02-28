import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public void showBug(Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);

        // Original buggy code
        list.add(10);

        // Added mutant code
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This switch statement is unreachable because the condition is always false
            int value = 0;
            switch(value) {
                case 1:
                    System.out.println("This is an unreachable statement.");
                    break;
            }
        }
    }

    private boolean getCondition() {
        return false;  // The method always returns false
    }
}