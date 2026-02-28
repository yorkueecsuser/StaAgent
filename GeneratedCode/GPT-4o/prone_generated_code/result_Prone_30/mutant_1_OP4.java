class NullHostileExample {

    public static void main(String[] args) {
        NullHostileExample example = new NullHostileExample();
        try {
            example.showBug("Hello, World!");
            example.showBug(null); // BUG: DangerousLiteralNull
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
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
        
        // Mutation: Unreachable if-else statement
        boolean unreachableCondition = isConditionFalse();
        if (unreachableCondition) {
            System.out.println("This block is unreachable.");
        } else {
            // Original logic continues here
            return input.length();
        }

        // Ensuring the method always returns a value
        return -1; // This can be a placeholder value, given the logic path should not reach here
    }
    
    // Method to simulate dynamic condition, ensuring no compile-time constant is used directly
    private boolean isConditionFalse() {
        return false;
    }
}