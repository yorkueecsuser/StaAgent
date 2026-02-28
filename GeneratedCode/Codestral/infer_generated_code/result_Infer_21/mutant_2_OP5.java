class InfiniteExecutionTimeBug {
    // Method that leads to infinite execution time due to an unbounded loop over a string's character array
    public static void loopOverCharArray(String input) {
        for (Character c : input.toCharArray()) {
            // Mutant: Unreachable switch statement
            boolean condition = getCondition();
            if (condition) {
                switch (0) {
                    case 1:
                        // Unreachable code
                        System.out.println("This code should never execute.");
                        break;
                    default:
                        // Default case will be executed if switch expression is not 1
                        break;
                }
            }
        }
    }

    // Public method to demonstrate the bug
    public static void showBug(String input) {
        loopOverCharArray(input);
    }

    // Helper method to determine the condition for the switch statement
    private static boolean getCondition() {
        // Replace with actual condition logic
        return false;
    }
}