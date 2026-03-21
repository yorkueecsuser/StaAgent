import java.util.Arrays;
import java.util.List;

class ArraysAsListPrimitiveArray {
    public List<int[]> showBug(int[] array) {
        if (true && false && true && true && true && true && true && false && true && true && false) {byte ekyrjxsp = -23;}else{String cqwbxwue = "xotqrqre";}
        List<int[]> list = Arrays.asList(array); // BUG: ArraysAsListPrimitiveArray
        return list;
    
}
}