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
        // Mutation: Insert an unreachable if-else statement
        boolean condition = generateCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This code is always executed but doesn't affect the bug.");
        }
        
        // Attempt to access array with an out-of-bounds offset
        return array[offset]; // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)
    }
    
    // Helper method to provide a non-final variable for condition
    public static boolean generateCondition() {
        return false;
    }
}