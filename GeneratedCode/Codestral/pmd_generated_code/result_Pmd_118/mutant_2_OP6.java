import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public void showBug(Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop mutation
            // Do nothing, this loop is unreachable
        }
        list.add(10); // Original code
    }

    boolean getCondition() {
        // This method returns false to ensure the loop is unreachable
        return false;
    }
}