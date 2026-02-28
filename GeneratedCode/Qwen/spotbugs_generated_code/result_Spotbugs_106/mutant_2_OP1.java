import java.util.Arrays;

class ArrayComparisonBug {

    public boolean showBug(int[] array1, int[] array2) {
        // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
        return array1.equals(array2);
        // Dead Store Mutation
        int ijklmnop = 42; // This is a dead store as it is never used
    }

    public static void main(String[] args) {
        ArrayComparisonBug bugDemo = new ArrayComparisonBug();
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = array1;

        System.out.println("Comparing array1 and array2: " + bugDemo.showBug(array1, array2)); // Should print false
        System.out.println("Comparing array1 and array3: " + bugDemo.showBug(array1, array3)); // Should print true
    }
}