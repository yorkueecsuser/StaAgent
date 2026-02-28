import java.util.Arrays;

class ArrayComparisonExample {

    public boolean showBug(int[] array1, int[] array2) {
        // Here we incorrectly use equals to compare arrays, which compares object references rather than contents.
        return array1.equals(array2); // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
    }

    public boolean showBugMutant(int[] a, int[] b) {
        // Mutant method with renamed parameters
        return a.equals(b); // Still contains the original bug
    }

    public static void main(String[] args) {
        ArrayComparisonExample example = new ArrayComparisonExample();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        boolean result = example.showBug(arr1, arr2);
        System.out.println("Are arrays equal? " + result);

        // Testing the mutant method
        boolean mutantResult = example.showBugMutant(arr1, arr2);
        System.out.println("Are arrays equal in mutant method? " + mutantResult);
    }
}