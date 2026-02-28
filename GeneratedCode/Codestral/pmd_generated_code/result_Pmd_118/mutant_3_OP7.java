import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public boolean getCondition() {
        return false;   // This method returns a false value to make the loop unreachable
    }

    public void showBug(Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);

        // Inserted unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This line will never execute.");
        }

        list.add(10); // Original code
    }
}