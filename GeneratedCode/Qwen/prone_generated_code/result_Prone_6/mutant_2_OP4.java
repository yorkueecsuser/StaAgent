import java.util.Arrays;
import java.util.List;

class ArraysAsListPrimitiveArrayExample {

    // Method to demonstrate the bug
    public List<int[]> showBug(int[] array) {
        // BUG: ArraysAsListPrimitiveArray
        List<int[]> list = Arrays.asList(array);

        // Introduced unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is intended to be unreachable
            System.out.println("This should never be printed");
        } else {
            // Alternative code that is also unreachable due to the nature of the condition
            System.out.println("This should also never be printed");
        }

        return list;
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method always returns false, making the if-else block unreachable
    }

    public static void main(String[] args) {
        ArraysAsListPrimitiveArrayExample example = new ArraysAsListPrimitiveArrayExample();
        int[] array = {1, 2, 3};
        List<int[]> result = example.showBug(array);
        System.out.println("Size of the list: " + result.size()); // This will print 1, not 3
        System.out.println("First element of the list: " + Arrays.toString(result.get(0))); // This will print [1, 2, 3]
    }
}