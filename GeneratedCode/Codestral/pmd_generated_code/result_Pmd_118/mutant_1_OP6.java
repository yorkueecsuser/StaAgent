import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public void showBug(Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);
        boolean condition = getCondition();
        for (int i = 0; condition; i++) { // Mutant: Unreachable for loop
            System.out.println("This line will never be executed");
        }
        list.add(10); // Original code
    }
    private boolean getCondition() {
        return false; // Always false to make the loop unreachable
    }
}