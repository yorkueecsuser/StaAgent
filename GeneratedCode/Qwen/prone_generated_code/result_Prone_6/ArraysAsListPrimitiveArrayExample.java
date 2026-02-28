import java.util.Arrays;
import java.util.List;

class ArraysAsListPrimitiveArrayExample {

    // Method to demonstrate the bug
    public List<int[]> showBug(int[] array) {
        // BUG: ArraysAsListPrimitiveArray
        List<int[]> list = Arrays.asList(array);
        
        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable loop");
        }
        
        return list;
    }

    // Method to provide a dynamic condition for the while loop
    private boolean getCondition() {
        return false; // This method always returns false, making the loop unreachable
    }

    public static void main(String[] args) {
        ArraysAsListPrimitiveArrayExample example = new ArraysAsListPrimitiveArrayExample();
        int[] array = {1, 2, 3};
        List<int[]> result = example.showBug(array);
        System.out.println("Size of the list: " + result.size()); // This will print 1, not 3
        System.out.println("First element of the list: " + Arrays.toString(result.get(0))); // This will print [1, 2, 3]
    }
}