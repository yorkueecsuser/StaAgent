import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public void showBug(Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);
        list.add(10); // Original line of code

        // Mutated line of code
        List<Integer> a = list;
        a.add(10);
    }
}