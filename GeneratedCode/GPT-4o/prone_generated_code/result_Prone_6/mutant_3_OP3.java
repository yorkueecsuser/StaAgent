import java.util.Arrays;
import java.util.List;

class PrimitiveArrayAsListBug {

    public List<int[]> showBug(int[] primitiveArray) {
        // Convert the primitive int array to a list using Arrays.asList
        List<int[]> list = Arrays.asList(primitiveArray); // BUG: ArraysAsListPrimitiveArray

        // Unreachable if statement mutation
        boolean unreachableCondition = getCondition(); // Simulated dynamic condition
        if (unreachableCondition) {
            System.out.println("This block is unreachable.");
        }

        return list;
    }

    // Simulated method to provide a non-final condition
    private boolean getCondition() {
        return false; // Always returns false to make the if statement unreachable
    }

    public static void main(String[] args) {
        PrimitiveArrayAsListBug example = new PrimitiveArrayAsListBug();
        int[] numbers = {1, 2, 3, 4, 5};
        List<int[]> result = example.showBug(numbers);

        // This will print the reference of the int array, not individual elements
        System.out.println(result);
    }
}