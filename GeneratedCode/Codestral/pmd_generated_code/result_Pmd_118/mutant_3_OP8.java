import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public void showBug(Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);
        List<Integer> r = list; // Mutant: Renamed 'list' to 'r'
        r.add(10);
    }
}