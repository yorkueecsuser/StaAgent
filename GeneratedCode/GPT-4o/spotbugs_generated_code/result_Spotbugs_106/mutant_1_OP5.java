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

        // Introducing an unreachable switch statement
        int unreachableSwitchVariable = getUnreachableValue();
        switch (unreachableSwitchVariable) {
            case 999: // This case will never be hit, making the switch statement unreachable
                System.out.println("This code is unreachable.");
                break;
            default:
                // Default case also unreachable since the condition for the switch is unreachable
                System.out.println("Default case.");
        }
    }

    // Method to ensure that we don't use a compile-time constant in the switch statement
    public static int getUnreachableValue() {
        return -1;
    }
}