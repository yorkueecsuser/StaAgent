class InfiniteExecutionTimeBug {
    // Method that leads to infinite execution time due to an unbounded loop over a string's character array
    public static void loopOverCharArray(String input) {
        for (Character c : input.toCharArray()) {} // BUG: INFINITE_EXECUTION_TIME

        // Mutant code: Unreachable for loop
        boolean loopCondition = getCondition();
        for (int i = 0; loopCondition; i++) {
            // This loop is unreachable because the condition is always false
        }
    }

    // Public method to demonstrate the bug
    public static void showBug(String input) {
        loopOverCharArray(input);
    }

    // Method to dynamically determine the condition for the unreachable loop
    private static boolean getCondition() {
        return false;
    }
}