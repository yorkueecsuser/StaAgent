import java.util.Arrays;
import java.util.List;

class PrimitiveArrayAsListBug {

    public List<int[]> showBug(int[] primitiveArray) {
        // Convert the primitive int array to a list using Arrays.asList
        List<int[]> list = Arrays.asList(primitiveArray); // BUG: ArraysAsListPrimitiveArray

        // Insert an unreachable switch statement
        int unreachableSwitchCondition = determineCondition();
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This case is never reached.");
                break;
            case 2:
                System.out.println("Neither is this one.");
                break;
            default:
                // Do nothing
                break;
        }

        return list;
    }

    private int determineCondition() {
        return 3; // Ensures the switch statement above is unreachable
    }

    public static void main(String[] args) {
        PrimitiveArrayAsListBug example = new PrimitiveArrayAsListBug();
        int[] numbers = {1, 2, 3, 4, 5};
        List<int[]> result = example.showBug(numbers);

        // This will print the reference of the int array, not individual elements
        System.out.println(result);
    }
}