import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public void showBug(Integer[] ints) {
        // Mutant code: Dead Store
        int unusedVariable = 5;

        List<Integer> list = Arrays.asList(ints);
        list.add(10); // BUG: UseArraysAsList - UnsupportedOperationException will be thrown at runtime
    }
}