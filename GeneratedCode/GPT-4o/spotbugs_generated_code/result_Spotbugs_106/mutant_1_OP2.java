import java.util.Arrays;

class ArrayComparisonExample {

    public boolean showBug(int[] array1, int[] array2) {
        // Here we incorrectly use equals to compare arrays, which compares object references rather than contents.
        return array1.equals(array2); // BUG: EC: Invocation of equals() on an array, which is equivalent to == (EC_BAD_ARRAY_COMPARE)
    }

    public static void main(String[] args) {
        ArrayComparisonExample example = new ArrayComparisonExample();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        boolean result = example.showBug(arr1, arr2);
        System.out.println("Are arrays equal? " + result);

        // Duplication Mutation: Duplicating the assignment statement
        int[] arr3 = {4, 5, 6};
        int[] arr4 = {4, 5, 6};
        int[] arr5 = {4, 5, 6}; // Duplicate assignment

        boolean anotherResult = example.showBug(arr3, arr4);
        System.out.println("Are arrays equal? " + anotherResult);
    }
}