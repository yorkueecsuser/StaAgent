import java.util.Arrays;

class ArrayComparisonExample {

    public boolean showBug(int[] array1, int[] array2) {
        // Here we incorrectly use equals to compare arrays, which compares object references rather than contents.
        if (isConditionFalse()) {
            // This block is unreachable due to the condition always returning false
            System.out.println("This will never be printed.");
        } else {
            // Original buggy code remains here
            return array1.equals(array2); // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
        }
        return false; // This line is added to maintain method return type integrity
    }

    private boolean isConditionFalse() {
        // This method always returns false, making the if condition unreachable
        return false;
    }

    public static void main(String[] args) {
        ArrayComparisonExample example = new ArrayComparisonExample();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        boolean result = example.showBug(arr1, arr2);
        System.out.println("Are arrays equal? " + result);
    }
}