import java.util.Arrays;
import java.util.List;

class ArrayBug {
    private boolean getCondition() {
        return false;
    }

    public void showBug(Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);
        if (getCondition()) { // Unreachable if statement
            System.out.println("This code is unreachable");
        }
        list.add(10); // BUG: UseArraysAsList - UnsupportedOperationException will be thrown at runtime
    }
}