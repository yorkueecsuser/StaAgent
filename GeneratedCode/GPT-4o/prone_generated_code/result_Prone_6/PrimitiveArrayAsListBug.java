import java.util.Arrays;
import java.util.List;

class PrimitiveArrayAsListBug {

    public List<int[]> showBug(int[] primitiveArray) {
        // Convert the primitive int array to a list using Arrays.asList
        List<int[]> list = Arrays.asList(primitiveArray); // BUG: ArraysAsListPrimitiveArray
        
        // Unreachable while loop mutant
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This code will never execute
            System.out.println("This is an unreachable while loop.");
        }
        
        return list;
    }

    // Method to provide the condition for unreachable while loop
    private boolean getUnreachableCondition() {
        return false; // The condition is always false, making the loop unreachable
    }

    public static void main(String[] args) {
        PrimitiveArrayAsListBug example = new PrimitiveArrayAsListBug();
        int[] numbers = {1, 2, 3, 4, 5};
        List<int[]> result = example.showBug(numbers);

        // This will print the reference of the int array, not individual elements
        System.out.println(result);
    }
}