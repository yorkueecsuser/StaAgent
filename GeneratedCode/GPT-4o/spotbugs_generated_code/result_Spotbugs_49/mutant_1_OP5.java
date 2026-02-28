class ArrayOffsetBugExample {

    public static void main(String[] args) {
        int[] exampleArray = {1, 2, 3, 4, 5};
        try {
            int result = showBug(exampleArray, 10); // This will cause IndexOutOfBoundsException
            System.out.println("Result: " + result);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught an IndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static int showBug(int[] array, int offset) {
        // Attempt to access array with an out-of-bounds offset
        int result = array[offset]; // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)

        // Insert unreachable switch statement
        int unreachableSwitch = getSwitchValue(); // dynamically determined at runtime
        switch (unreachableSwitch) {
            case 999: // This will never happen because getSwitchValue() does not return 999
                System.out.println("Unreachable case executed!");
                break;
            default:
                // Default case which does nothing
                break;
        }

        return result;
    }

    private static int getSwitchValue() {
        return -1; // This ensures that the switch case 999 is never executed
    }
}