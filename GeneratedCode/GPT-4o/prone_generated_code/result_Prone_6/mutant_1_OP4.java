import java.util.Arrays;
import java.util.List;

class PrimitiveArrayAsListBug {

    public List<int[]> showBug(int[] primitiveArray) {
        // Convert the primitive int array to a list using Arrays.asList
        List<int[]> list = Arrays.asList(primitiveArray); // BUG: ArraysAsListPrimitiveArray

        // Introduce an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block will never execute
            System.out.println("This will never print.");
        } else {
            // This block will always execute
            System.out.println("Unreachable if-else block executed.");
        }
        
        return list;
    }

    // Method to ensure condition is determined at runtime
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        PrimitiveArrayAsListBug example = new PrimitiveArrayAsListBug();
        int[] numbers = {1, 2, 3, 4, 5};
        List<int[]> result = example.showBug(numbers);

        // This will print the reference of the int array, not individual elements
        System.out.println(result);
    }
}