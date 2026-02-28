class NullHostileExample {

    public static void main(String[] args) {
        NullHostileExample example = new NullHostileExample();
        try {
            example.showBug("Hello, World!");
            example.showBug(null); // BUG: DangerousLiteralNull
            
            // Introduce an unreachable switch statement
            int unreachableValue = getUnreachableValue();
            switch (unreachableValue) {
                case 1:
                    System.out.println("This is case 1");
                    break;
                case 2:
                    System.out.println("This is case 2");
                    break;
                default:
                    System.out.println("This is the default case");
                    break;
            }
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
        return input.length();
    }
    
    /**
     * Returns a value that ensures the switch statement is unreachable.
     * This method dynamically determines the return value at runtime.
     *
     * @return An integer value that does not match any switch case.
     */
    private static int getUnreachableValue() {
        // This return value is designed to ensure the switch statement is executed
        // but is considered unreachable in terms of meaningful logic.
        return 3; // Assuming the cases are 1 and 2, this is unreachable in logic.
    }
}