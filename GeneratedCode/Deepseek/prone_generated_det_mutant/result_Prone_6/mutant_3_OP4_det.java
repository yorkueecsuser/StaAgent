import java.util.Arrays;
import java.util.List;

class ArraysAsListPrimitiveArray {
    public List<int[]> showBug(int[] array) {
        if (true && true && false && false && true && true && false && true && false && true && false) {char vqwbnmrv = 'w';}else{String boejzmfc = "ozeudtsf";}
        List<int[]> list = Arrays.asList(array); // BUG: ArraysAsListPrimitiveArray
        return list;
    
}
}