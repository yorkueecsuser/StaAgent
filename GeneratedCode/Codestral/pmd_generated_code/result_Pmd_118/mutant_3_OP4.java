import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public void showBug(Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);
        if (getCondition()) {
            // Unreachable code
            list.add(10);
        } else {
            // This else block is unreachable
            System.out.println("Unreachable block");
        }
    }

    private boolean getCondition() {
        return false; // Always return false to make the if block unreachable
    }
}