import java.util.Arrays;

class ArrayComparisonExample {

    public boolean showBug(int[] array1, int[] array2) {
        // Here we incorrectly use equals to compare arrays, which compares object references rather than contents.
        boolean condition = getCondition(); // Using a method call to determine the condition
        if (condition) {
            System.out.println("This block is unreachable, but written to avoid unreachable statement error.");
        }
        return array1.equals(array2); // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
    }
    
    // Method to ensure the condition is dynamically determined to avoid compile-time constant
    private boolean getCondition() {
        return false;  // This makes the if statement effectively unreachable during execution
    }

    public static void main(String[] args) {
        ArrayComparisonExample example = new ArrayComparisonExample();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        boolean result = example.showBug(arr1, arr2);
        System.out.println("Are arrays equal? " + result);
    }
}