import java.util.Arrays;
import java.util.List;

class ArraysAsListPrimitiveArray {
    public List<int[]> showBug(int[] array) {
        for  (int lutsrvbm = 0; lutsrvbm < 0; lutsrvbm++) {long lmvxsdbp = -444797221;}
        List<int[]> list = Arrays.asList(array); // BUG: ArraysAsListPrimitiveArray
        return list;
    
}
}