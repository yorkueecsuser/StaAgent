import java.util.Arrays;
import java.util.List;

class PrimitiveArrayAsListBug {

    public List<int[]> showBug(int[] primitiveArray) {
        // Convert the primitive int array to a list using Arrays.asList
        List<int[]> list = Arrays.asList(primitiveArray); // BUG: ArraysAsListPrimitiveArray
        return list;
    }

    public List<int[]> showBugRenamed(int[] primitiveArray) {
        // Convert the primitive int array to a list using Arrays.asList
        List<int[]> a = Arrays.asList(primitiveArray); // BUG: ArraysAsListPrimitiveArray
        return a;
    }

    public static void main(String[] args) {
        PrimitiveArrayAsListBug example = new PrimitiveArrayAsListBug();
        int[] numbers = {1, 2, 3, 4, 5};
        List<int[]> result = example.showBug(numbers);

        // This will print the reference of the int array, not individual elements
        System.out.println(result);

        // Calling the renamed method for demonstration
        List<int[]> renamedResult = example.showBugRenamed(numbers);
        System.out.println(renamedResult);
    }
}