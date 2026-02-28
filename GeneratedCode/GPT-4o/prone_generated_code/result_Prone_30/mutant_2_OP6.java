class NullHostileExample {

    public static void main(String[] args) {
        NullHostileExample example = new NullHostileExample();
        try {
            example.showBug("Hello, World!");
            example.showBug(null); // BUG: DangerousLiteralNull
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Unreachable for loop mutant
        boolean unreachableCondition = getUnreachableCondition();
        for (int i = 0; unreachableCondition; i++) {
            // This block will never execute
            System.out.println("This is unreachable code inside a for loop");
        }
    }

    /**
     * A method that demonstrates the DangerousLiteralNull bug.
     * This method does not handle null input, leading to an IllegalArgumentException.
     *
     * @param input The input string which should not be null.
     * @return The length of the input string.
     */
    public int showBug(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return input.length();
    }

    // Method to simulate an unreachable condition
    private static boolean getUnreachableCondition() {
        return false; // Simulates a condition that is always false
    }
}