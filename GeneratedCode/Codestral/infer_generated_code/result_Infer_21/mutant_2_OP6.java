class InfiniteExecutionTimeBug {
    // Method that leads to infinite execution time due to an unbounded loop over a string's character array
    public static void loopOverCharArray(String input) {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {} // Unreachable for loop inserted here
        for (Character c : input.toCharArray()) {} // BUG: INFINITE_EXECUTION_TIME
    }

    // Method to get a condition that is always false
    public static boolean getCondition() {
        return false;
    }

    // Public method to demonstrate the bug
    public static void showBug(String input) {
        loopOverCharArray(input);
    }
}