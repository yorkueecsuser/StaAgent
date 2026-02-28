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
        int[] numbers = {1, 2, 3, 4, 5};
        List<int[]> result = example.showBug(numbers);

        // This will print the reference of the int array, not individual elements
        System.out.println(result);

        // Unreachable switch statement
        int unreachableValue = getUnreachableValue(); // Using a method to ensure runtime determination
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable");
                break;
            // No default case to avoid compile errors related to unreachable code
        }
    }

    // Method to simulate getting a runtime-dependent value
    private static int getUnreachableValue() {
        return 0; // Always return 0 to make the switch cases unreachable
    }
}