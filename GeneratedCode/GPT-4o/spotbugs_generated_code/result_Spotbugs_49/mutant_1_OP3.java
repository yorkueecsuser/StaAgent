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
        // Introduce a non-final boolean variable for an unreachable if statement
        boolean alwaysFalse = getFalseCondition();

        // Unreachable if statement
        if (alwaysFalse) {
            System.out.println("This line will never be executed.");
        }

        // Attempt to access array with an out-of-bounds offset
        return array[offset]; // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)
    }

    // Method to ensure the condition is dynamically determined at runtime
    private static boolean getFalseCondition() {
        return false;
    }
}