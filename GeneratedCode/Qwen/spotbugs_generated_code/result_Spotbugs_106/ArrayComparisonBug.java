import java.util.Arrays;

class ArrayComparisonBug {

    public boolean showBug(int[] array1, int[] array2) {
        // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
        return array1.equals(array2);
    }

    public static void main(String[] args) {
        ArrayComparisonBug bugDemo = new ArrayComparisonBug();
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = array1;

        System.out.println("Comparing array1 and array2: " + bugDemo.showBug(array1, array2)); // Should print false
        System.out.println("Comparing array1 and array3: " + bugDemo.showBug(array1, array3)); // Should print true

        // Mutated code with renaming
        int[] b = {4, 5, 6};
        int[] c = {4, 5, 6};
        int[] d = b;

        System.out.println("Comparing b and c: " + bugDemo.showBug(b, c)); // Should print false
        System.out.println("Comparing b and d: " + bugDemo.showBug(b, d)); // Should print true
    }
}