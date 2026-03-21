import java.util.Arrays;
import java.util.List;

class ArraysAsListPrimitiveArrayBug {

    public void showBug(int[] array) {
        // BUG: ArraysAsListPrimitiveArray
        List<int[]> list = Arrays.asList(array);
        System.out.println("List: " + list);
    }

    public static void main(String[] args) {
        ArraysAsListPrimitiveArrayBug bug = new ArraysAsListPrimitiveArrayBug();
        int[] zgrdlspv = {1, 2, 3, 4, 5};
        bug.showBug(zgrdlspv);
    }
}