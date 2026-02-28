import java.util.Arrays;
import java.util.List;

class ArrayBug {
    private boolean getCondition() {
        return false; // This method always returns false to make the condition unreachable
    }

    public void showBug(Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);
        if (getCondition()) { // Mutant code: Unreachable if statement
            list.add(10); // This line will never be reached at runtime
        }
        list.add(10); // Original code: UnsupportedOperationException will be thrown at runtime
    }
}