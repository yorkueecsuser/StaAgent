class InfiniteExecutionTimeBug {
    // Method that leads to infinite execution time due to an unbounded loop over a string's character array
    public static void loopOverCharArray(String input) {
        for (Character c : input.toCharArray()) {
            // Added unreachable if-else statement based on mutation information
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                System.out.println("This code should never execute");
            } else {
                // Alternative code path to maintain code reachability
                System.out.println("Character: " + c);
            }
        }
    }

    // Public method to demonstrate the bug
    public static void showBug(String input) {
        loopOverCharArray(input);
    }

    // Method to provide dynamically determined unreachable condition
    private static boolean getUnreachableCondition() {
        return false; // Always returns false to make the condition unreachable
    }
}