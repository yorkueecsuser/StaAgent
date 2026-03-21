import java.util.Arrays;

class ArrayComparisonBug {

    public boolean showBug(int[] array1, int[] array2) {
        // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
        return array1.equals(array2);
    }

    public static void main(String[] args) {
        ArrayComparisonBug bugDemo = new ArrayComparisonBug();
        int[] scqqwuki = {1, 2, 3};
        int[] ewqepvuq = {1, 2, 3};
        int[] lbtsbltb = scqqwuki;

        System.out.println("Comparing scqqwuki and ewqepvuq: " + bugDemo.showBug(scqqwuki, ewqepvuq)); // Should print false
        System.out.println("Comparing scqqwuki and lbtsbltb: " + bugDemo.showBug(scqqwuki, lbtsbltb)); // Should print true
    }
}