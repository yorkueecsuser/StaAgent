import java.util.Arrays;
import java.util.List;
import java.util.Random;

class ArrayBug {
    public void showBug(Integer[] ints) {
        Random random = new Random();
        int deadStore = random.nextInt(100); // added dead store

        List<Integer> list = Arrays.asList(ints);
        list.add(10); // BUG: UseArraysAsList - UnsupportedOperationException will be thrown at runtime
    }
}