import java.util.Arrays;

class ArrayComparisonBug {

    public boolean showBug(int[] array1, int[] array2) {
        // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE) 
        return array1.equals(array2);
    }

    public static void main(String[] args) {
        ArrayComparisonBug bugDemo = new ArrayComparisonBug();
        int[] b = {1, 2, 3};
        int[] c = {1, 2, 3};
        int[] d = b;

        System.out.println("Comparing array1 and array2: " + bugDemo.showBug(b, c)); // Should print false
        System.out.println("Comparing array1 and array3: " + bugDemo.showBug(b, d)); // Should print true
    }
}