import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public void showBug(Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);
        list.add(10); // Original statement
        list.add(10); // Mutated statement: Duplicating the above statement
    }
}