class InfiniteExecutionTimeBug {
    // Method that leads to infinite execution time due to an unbounded loop over a string's character array
    public static void loopOverCharArray(String input) {
        for (Character c : input.toCharArray()) {
            if (getFalseCondition()) {
                // Unreachable code
                System.out.println("This line should never be executed.");
            } else {
                // This else block is also unreachable
                System.out.println("This line should also never be executed.");
            }
        }
    }

    // Public method to demonstrate the bug
    public static void showBug(String input) {
        loopOverCharArray(input);
    }

    // Method to return a false condition
    private static boolean getFalseCondition() {
        return false;
    }
}