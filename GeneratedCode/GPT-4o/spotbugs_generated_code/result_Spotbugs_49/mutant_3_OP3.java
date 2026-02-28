class ArrayOffsetBugExample {

    public static void main(String[] args) {
        int[] exampleArray = {1, 2, 3, 4, 5};
        try {
            int result = showBug(exampleArray, 10); // This will cause IndexOutOfBoundsException
            System.out.println("Result: " + result);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught an IndexOutOfBoundsException: " + e.getMessage());
        }

        // Mutation: Inserting unreachable if statement
        boolean condition = getCondition(); // Using a method to ensure dynamic condition
        if (condition) {
            System.out.println("This block is unreachable.");
        }
    }

    public static int showBug(int[] array, int offset) {
        // Attempt to access array with an out-of-bounds offset
        return array[offset]; // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)
    }

    // Method to ensure the condition is evaluated at runtime
    public static boolean getCondition() {
        return false; // Simulating a constant false condition
    }
}