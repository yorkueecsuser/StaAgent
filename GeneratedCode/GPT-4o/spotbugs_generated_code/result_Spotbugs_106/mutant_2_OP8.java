import java.util.Arrays;

class ArrayComparisonExample {

    public boolean showBug(int[] array1, int[] array2) {
        // Here we incorrectly use equals to compare arrays, which compares object references rather than contents.
        return array1.equals(array2); // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
    }
    
    public boolean showBug(int[] x, int[] y) {
        // Here we incorrectly use equals to compare arrays, which compares object references rather than contents.
        return x.equals(y); // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
    }

    public static void main(String[] args) {
        ArrayComparisonExample example = new ArrayComparisonExample();
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        boolean result = example.showBug(a, b);
        System.out.println("Are arrays equal? " + result);
    }
}