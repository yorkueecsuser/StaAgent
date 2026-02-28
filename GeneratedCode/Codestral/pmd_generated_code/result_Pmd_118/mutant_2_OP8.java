import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public void showBug(Integer[] ints) {
        List<Integer> lst = Arrays.asList(ints); // Mutation: Renaming 'list' to 'lst'
        lst.add(10); // BUG: UseArraysAsList - UnsupportedOperationException will be thrown at runtime
    }
}