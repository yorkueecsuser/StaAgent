import java.util.Arrays;

class ArrayComparisonBug {

    public boolean showBug(int[] array1, int[] array2) {
        // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
        return array1.equals(array2);
    }

    public static void main(String[] args) {
        ArrayComparisonBug bugDemo = new ArrayComparisonBug();
        int[] jdduvfdw = {1, 2, 3};
        int[] veqjkuzt = {1, 2, 3};
        int[] jntdjuyh = jdduvfdw;

        System.out.println("Comparing jdduvfdw and veqjkuzt: " + bugDemo.showBug(jdduvfdw, veqjkuzt)); // Should print false
        System.out.println("Comparing jdduvfdw and jntdjuyh: " + bugDemo.showBug(jdduvfdw, jntdjuyh)); // Should print true
    }
}