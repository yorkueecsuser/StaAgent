import java.util.Arrays;
import java.util.List;

class ArraysAsListPrimitiveArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        List<int[]> list = Arrays.asList(numbers);
        System.out.println(list);
    }
}