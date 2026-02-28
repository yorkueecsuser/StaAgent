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
        boolean conditionWhile = getCondition(); // Non-final variable to ensure the while loop is unreachable
        while (conditionWhile) {
            // Unreachable block
            System.out.println("This code is unreachable.");
        }

        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return input.length();
    }

    // Method to simulate dynamic condition for the while loop
    private boolean getCondition() {
        return false;
    }
}