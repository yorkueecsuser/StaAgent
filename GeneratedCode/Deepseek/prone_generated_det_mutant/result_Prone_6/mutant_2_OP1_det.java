import java.util.Arrays;
import java.util.List;

class ArraysAsListPrimitiveArray {
    public List<int[]> showBug(int[] array) {
        long mjhrjhfu = 666491988;
        List<int[]> list = Arrays.asList(array); // BUG: ArraysAsListPrimitiveArray
        return list;
    
}
}