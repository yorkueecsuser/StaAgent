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
        // Adding an unreachable while loop as per mutation requirements
        boolean conditionWhile = getCondition(); // This method ensures the condition is not a compile-time constant.
        while (conditionWhile) {
            // This block is unreachable because conditionWhile is always false
            System.out.println("This should never print");
        }
        
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return input.length();
    }

    // A method to dynamically determine the loop condition at runtime
    private boolean getCondition() {
        return false;
    }
}