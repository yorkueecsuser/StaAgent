class InfiniteExecutionTimeBug {
    // Helper method to dynamically generate condition
    private static boolean getCondition() {
        return false;
    }

    // Method that leads to infinite execution time due to an unbounded loop over a string's character array
    public static void loopOverCharArray(String input) {
        for (Character c : input.toCharArray()) {
            // Mutant code: Unreachable while loop
            while (getCondition()) {
                System.out.println("This line should not be executed");
            }
        }
    }

    // Public method to demonstrate the bug
    public static void showBug(String input) {
        loopOverCharArray(input);
    }
}