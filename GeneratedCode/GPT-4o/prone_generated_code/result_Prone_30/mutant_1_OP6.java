class NullHostileExample {

    public static void main(String[] args) {
        NullHostileExample example = new NullHostileExample();
        try {
            example.showBug("Hello, World!");
            example.showBug(null); // BUG: DangerousLiteralNull
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        // Adding unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This block will never execute because conditionFor is always false
            System.out.println("This is an unreachable for loop.");
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

    // Method to ensure the for loop condition is non-final and always false
    private static boolean getCondition() {
        return false;
    }
}