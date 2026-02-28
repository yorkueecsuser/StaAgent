import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public void showBug(Integer[] ints) {
        List<Integer> list = new ArrayList<>(ints.length);
        int i = 0;
        do {
            list.add(ints[i]);
            i++;
        } while (i < ints.length);
        list.add(10); // BUG: UseArraysAsList - UnsupportedOperationException will be thrown at runtime
    }
}