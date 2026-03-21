import java.util.Arrays;
import java.util.List;

class ArraysAsListPrimitiveArray {
    public List<int[]> showBug(int[] array) {
        List<int[]> list = Arrays.asList(array); // BUG: ArraysAsListPrimitiveArray
        return list;
    }
}