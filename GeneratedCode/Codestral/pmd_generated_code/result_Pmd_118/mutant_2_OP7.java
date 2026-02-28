import java.util.Arrays;
import java.util.List;

class ArrayBug {
    private boolean getFalseCondition() {
        return false;
    }

    public void showBug(Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);
        list.add(10); // BUG: UseArraysAsList - UnsupportedOperationException will be thrown at runtime

        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This code will not be executed.");
        }
    }
}