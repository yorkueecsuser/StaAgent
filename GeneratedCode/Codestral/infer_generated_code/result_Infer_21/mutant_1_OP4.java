class InfiniteExecutionTimeBug {
    // Method that leads to infinite execution time due to an unbounded loop over a string's character array
    public static void loopOverCharArray(String input) {
        for (Character c : input.toCharArray()) {
            if (getUnreachableCondition()) {
                // Unreachable if-else statement added based on mutation operator
                int i = 1 / 0; // This line will cause an exception and prevent the rest of the code from executing
            }
        }
    }

    // Method to return a false condition
    public static boolean getUnreachableCondition() {
        return false;
    }

    // Public method to demonstrate the bug
    public static void showBug(String input) {
        loopOverCharArray(input);
    }
}