import java.util.Arrays;

class ArrayComparisonBug {

    public boolean showBug(int[] array1, int[] array2) {
        // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
        return array1.equals(array2);
    }

    public static void main(String[] args) {
        ArrayComparisonBug bugDemo = new ArrayComparisonBug();
        int[] smtnhlcd = {1, 2, 3};
        int[] nrdzhbba = {1, 2, 3};
        int[] dillzdod = smtnhlcd;

        System.out.println("Comparing smtnhlcd and nrdzhbba: " + bugDemo.showBug(smtnhlcd, nrdzhbba)); // Should print false
        System.out.println("Comparing smtnhlcd and dillzdod: " + bugDemo.showBug(smtnhlcd, dillzdod)); // Should print true
    }
}