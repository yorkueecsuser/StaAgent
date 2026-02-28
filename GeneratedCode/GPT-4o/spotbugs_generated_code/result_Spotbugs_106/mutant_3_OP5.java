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

        // Inserting an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never print");
                break;
            default:
                // Intentionally left empty
                break;
        }
    }

    // This method ensures the switch statement is unreachable
    private static int getUnreachableValue() {
        return 0; // or any constant that does not match the case value
    }
}