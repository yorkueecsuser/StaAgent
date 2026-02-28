import java.util.Arrays;
import java.util.List;

class PrimitiveArrayAsListBug {

    public List<int[]> showBug(int[] primitiveArray) {
        // Convert the primitive int array to a list using Arrays.asList
        List<int[]> list = Arrays.asList(primitiveArray); // BUG: ArraysAsListPrimitiveArray

        // Unreachable switch statement insertion
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 9999:
                System.out.println("This code is unreachable");
                break;
            default:
                break;
        }

        return list;
    }

    private int getUnreachableValue() {
        return -1; // Ensures the switch statement is always unreachable
    }

    public static void main(String[] args) {
        PrimitiveArrayAsListBug example = new PrimitiveArrayAsListBug();
        int[] numbers = {1, 2, 3, 4, 5};
        List<int[]> result = example.showBug(numbers);

        // This will print the reference of the int array, not individual elements
        System.out.println(result);
    }
}