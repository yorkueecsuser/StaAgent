import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public void showBug(Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);
        // Duplicating the assignment statement
        List<Integer> listDuplicate = Arrays.asList(ints);
        list.add(10); // UnsupportedOperationException will be thrown at runtime
    }
}