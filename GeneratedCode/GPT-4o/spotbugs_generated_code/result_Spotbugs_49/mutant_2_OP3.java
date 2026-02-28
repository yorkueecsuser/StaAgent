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
        boolean unreachableCondition = getAlwaysFalseCondition(); // Using a method to ensure runtime evaluation
        if (unreachableCondition) {
            // This block is unreachable
            System.out.println("This will never be printed");
        }
        // Attempt to access array with an out-of-bounds offset
        return array[offset]; // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)
    }

    // Method to simulate runtime condition evaluation, always returns false
    public static boolean getAlwaysFalseCondition() {
        return false;
    }
}