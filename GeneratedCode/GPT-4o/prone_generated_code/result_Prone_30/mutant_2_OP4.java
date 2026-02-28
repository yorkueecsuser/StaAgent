class NullHostileExample {

    public static void main(String[] args) {
        NullHostileExample example = new NullHostileExample();
        try {
            example.showBug("Hello, World!");
            example.showBug(null); // BUG: DangerousLiteralNull
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        // Unreachable if-else statement mutation
        boolean unreachableCondition = getUnreachableCondition(); // This will always return false
        if (unreachableCondition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This is the else branch of the unreachable if-else.");
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

    // Method to simulate a runtime condition that is always false
    private static boolean getUnreachableCondition() {
        return false;
    }
}