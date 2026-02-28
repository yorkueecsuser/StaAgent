class ArrayOffsetBug {

    // Method to demonstrate the Array offset out of bounds bug
    public int showBug(int[] array, int offset) {
        // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET) 
        return array[offset];
    }

    public static void main(String[] args) {
        ArrayOffsetBug bugDemo = new ArrayOffsetBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        try {
            // Calling the buggy method with an offset that is out of bounds
            int result = bugDemo.showBug(sampleArray, 5);
            System.out.println("Result: " + result);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Caught an IndexOutOfBoundsException: " + e.getMessage());
        }

        // Inserting unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This will never be printed because shouldRun is always false.");
        } else {
            System.out.println("This will also never be printed because shouldRun is always false.");
        }
    }

    // Method to provide a dynamic condition that is always false
    private static boolean getCondition() {
        return false;
    }
}