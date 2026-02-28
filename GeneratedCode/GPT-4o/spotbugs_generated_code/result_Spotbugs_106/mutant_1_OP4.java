import java.util.Arrays;

class ArrayComparisonExample {

    public boolean showBug(int[] array1, int[] array2) {
        // Here we incorrectly use equals to compare arrays, which compares object references rather than contents.
        
        boolean isUnreachable = getUnreachableCondition();
        if (isUnreachable) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("Proceeding with array comparison.");
        }
        
        return array1.equals(array2); // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
    }

    private boolean getUnreachableCondition() {
        // This method always returns false, simulating an unreachable block without compile-time constants
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