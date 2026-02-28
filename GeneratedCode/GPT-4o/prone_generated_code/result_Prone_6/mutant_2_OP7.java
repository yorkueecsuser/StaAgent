import java.util.Arrays;
import java.util.List;

class PrimitiveArrayAsListBug {

    public List<int[]> showBug(int[] primitiveArray) {
        // Convert the primitive int array to a list using Arrays.asList
        List<int[]> list = Arrays.asList(primitiveArray); // BUG: ArraysAsListPrimitiveArray

        // Adding an unreachable while loop
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            // This block is unreachable
            System.out.println("This is unreachable code");
        }

        return list;
    }

    private boolean getUnreachableCondition() {
        return false; // This makes the while loop condition always false
    }

    public static void main(String[] args) {
        PrimitiveArrayAsListBug example = new PrimitiveArrayAsListBug();
        int[] numbers = {1, 2, 3, 4, 5};
        List<int[]> result = example.showBug(numbers);

        // This will print the reference of the int array, not individual elements
        System.out.println(result);
    }
}