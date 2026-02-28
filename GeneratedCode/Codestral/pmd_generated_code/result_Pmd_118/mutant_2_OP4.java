import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public void showBug(Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);
        if (getUnreachableCondition()) {
            // Unreachable if-else statement mutant
            list.remove(0);
        } else {
            list.add(10); // Original code
        }
    }

    private boolean getUnreachableCondition() {
        return false; // Always returns false to make the if statement unreachable
    }
}