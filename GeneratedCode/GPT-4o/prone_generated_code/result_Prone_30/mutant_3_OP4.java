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
        // Introduce a non-final variable to ensure the condition is dynamically evaluated
        boolean unreachableCondition = false; // Normally, this would be set by some logic

        // Unreachable if-else block using the non-final variable
        if (unreachableCondition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This block is always executed.");
        }

        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return input.length();
    }
}