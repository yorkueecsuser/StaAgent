import java.util.Arrays;
import java.util.List;

class PrimitiveArrayAsListBug {

    public List<int[]> showBug(int[] primitiveArray) {
        // Convert the primitive int array to a list using Arrays.asList
        List<int[]> list = Arrays.asList(primitiveArray); // BUG: ArraysAsListPrimitiveArray
        return list;
    }

    public static void main(String[] args) {
        PrimitiveArrayAsListBug example = new PrimitiveArrayAsListBug();
        int[] ieyzmbaq = {1, 2, 3, 4, 5};
        List<int[]> result = example.showBug(ieyzmbaq);

        // This will print the reference of the int array, not individual elements
        System.out.println(result);
    }
}