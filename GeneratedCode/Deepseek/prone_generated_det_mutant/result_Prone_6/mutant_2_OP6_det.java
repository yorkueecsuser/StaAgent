import java.util.Arrays;
import java.util.List;

class ArraysAsListPrimitiveArray {
    public List<int[]> showBug(int[] array) {
        for  (int aktlypbv = 0; aktlypbv < 0; aktlypbv++) {byte bmlrjkhf = -122;}
        List<int[]> list = Arrays.asList(array); // BUG: ArraysAsListPrimitiveArray
        return list;
    
}
}