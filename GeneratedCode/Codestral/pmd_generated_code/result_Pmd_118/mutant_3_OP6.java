import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public void showBug(Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);
        boolean condition = getCondition();
        for (int i = 0; condition; i++) { // Unreachable for loop mutation
            System.out.println("This is an unreachable loop");
        }
        list.add(10); // Original buggy line
    }

    private boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }
}