import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public void showBug(Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);
        boolean shouldAdd = getCondition();
        if (shouldAdd) {
            // Unreachable if-else statement mutant
            if (false) {
                list.add(10);
            } else {
                System.out.println("Unreachable code executed.");
            }
        } else {
            list.add(10); // Original code
        }
    }

    private boolean getCondition() {
        // Replace this with a dynamic condition
        return false;
    }
}