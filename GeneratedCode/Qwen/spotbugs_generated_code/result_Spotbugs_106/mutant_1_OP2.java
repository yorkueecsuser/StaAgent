import java.util.Arrays;

class ArrayComparisonBug {

    public boolean showBug(int[] array1, int[] array2) {
        // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
        return array1.equals(array2);
        // Mutant: Duplicating the assignment statement for demonstration purposes
        int[] array4 = {1, 2, 3}; // This is a unique assignment statement
    }

    public static void main(String[] args) {
        ArrayComparisonBug bugDemo = new ArrayComparisonBug();
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = array1;
        // Mutant: Duplicating the assignment statement for demonstration purposes
        int[] array5 = array1; // This is a unique assignment statement

        System.out.println("Comparing array1 and array2: " + bugDemo.showBug(array1, array2)); // Should print false
        System.out.println("Comparing array1 and array3: " + bugDemo.showBug(array1, array3)); // Should print true
    }
}