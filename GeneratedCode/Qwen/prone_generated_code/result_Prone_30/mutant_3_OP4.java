class DangerousLiteralNullExample {

    // Method that is null-hostile: passing a null literal to it is always wrong
    public String processString(String input) {
        // Inserting an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block will never be executed
            input = "Unreachable";
        } else {
            // This block will also never be executed due to the condition being false
            input = "Still Unreachable";
        }
        return input.toUpperCase(); // This will throw a NullPointerException if input is null
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

    // Helper method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method returns false, but it's not a compile-time constant
    }
}