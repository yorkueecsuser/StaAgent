import java.util.Arrays;
import java.util.List;

class PrimitiveArrayAsListBug {

    public List<int[]> showBug(int[] primitiveArray) {
        // Convert the primitive int array to a list using Arrays.asList
        List<int[]> list = Arrays.asList(primitiveArray); // BUG: ArraysAsListPrimitiveArray
        return list;
    }

    public List<int[]> showBugMutant(int[] primitiveArray) {
        // Mutant method with variable renaming
        List<int[]> a = Arrays.asList(primitiveArray);
        return a;
    }

    public static void main(String[] args) {
        PrimitiveArrayAsListBug example = new PrimitiveArrayAsListBug();
        int[] numbers = {1, 2, 3, 4, 5};
        List<int[]> result = example.showBug(numbers);

        // Mutant testing
        List<int[]> mutantResult = example.showBugMutant(numbers);

        // This will print the reference of the int array, not individual elements
        System.out.println(result);
        System.out.println(mutantResult);
    }
}