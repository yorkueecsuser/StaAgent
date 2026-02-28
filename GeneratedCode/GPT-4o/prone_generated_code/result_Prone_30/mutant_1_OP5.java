class NullHostileExample {

    public static void main(String[] args) {
        NullHostileExample example = new NullHostileExample();
        try {
            example.showBug("Hello, World!");
            example.showBug(null); // BUG: DangerousLiteralNull
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        // Adding an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never print");
                break;
            default:
                System.out.println("This default will never print either");
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

    /**
     * Method to simulate a condition that makes the switch statement unreachable.
     * This method always returns a value that does not correspond to any case statement.
     *
     * @return An integer value that is not in the switch cases.
     */
    public static int getUnreachableValue() {
        return 0; // This value does not match any case in the switch statement
    }
}