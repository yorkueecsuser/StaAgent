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
        // Unreachable if-else statement
        boolean runtimeCondition = getAlwaysFalseCondition();
        if (runtimeCondition) {
            System.out.println("This code is unreachable and will never be executed.");
        } else {
            System.out.println("This branch is always executed.");
        }
        
        // Attempt to access array with an out-of-bounds offset
        return array[offset]; // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)
    }

    // Helper method to provide a runtime false condition
    private static boolean getAlwaysFalseCondition() {
        return false;
    }
}