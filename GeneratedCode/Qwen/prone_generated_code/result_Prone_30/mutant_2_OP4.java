class DangerousLiteralNullExample {

    // Method that is null-hostile: passing a null literal to it is always wrong
    public String processString(String input) {
        // Introduced an unreachable if-else statement with a dynamic condition
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            input = "UnreachableCode";
        } else {
            // Also unreachable code
            input = "MoreUnreachableCode";
        }
        return input.toUpperCase(); // This will throw a NullPointerException if input is null
    }

    // Method to determine the condition dynamically
    private boolean getCondition() {
        return false; // This method always returns false, but it's not a compile-time constant
    }

    // Method to demonstrate the bug
    public String showBug() {
        return processString(null); // BUG: DangerousLiteralNull
    }

    public static void main(String[] args) {
        DangerousLiteralNullExample example = new DangerousLiteralNullExample();
        try {
            System.out.println(example.showBug());
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}