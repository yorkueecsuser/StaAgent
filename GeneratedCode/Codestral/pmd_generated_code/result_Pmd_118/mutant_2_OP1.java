import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public void showBug(Integer[] ints) {
        int deadStoreVariable = 5;  // Dead store mutant: Unused variable declaration
        List<Integer> list = Arrays.asList(ints);
        list.add(10); // Bug: UseArraysAsList - UnsupportedOperationException will be thrown at runtime
    }
}