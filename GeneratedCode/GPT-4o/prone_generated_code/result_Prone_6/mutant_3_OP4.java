import java.util.Arrays;
import java.util.List;

class PrimitiveArrayAsListBug {

    public List<int[]> showBug(int[] primitiveArray) {
        // Convert the primitive int array to a list using Arrays.asList
        List<int[]> list = Arrays.asList(primitiveArray); // BUG: ArraysAsListPrimitiveArray
        
        // Introduce an unreachable if-else statement
        boolean condition = getCondition(); // This method always returns false
        if (condition) {
            System.out.println("This code is never executed");
        } else {
            // This part is reachable, hence no compile-time error
            System.out.println("This code is always executed");
        }
        
        return list;
    }

    private boolean getCondition() {
        return false; // Simulates a condition that is always false
    }
    
    public static void main(String[] args) {
        PrimitiveArrayAsListBug example = new PrimitiveArrayAsListBug();
        int[] numbers = {1, 2, 3, 4, 5};
        List<int[]> result = example.showBug(numbers);

        // This will print the reference of the int array, not individual elements
        System.out.println(result);
    }
}