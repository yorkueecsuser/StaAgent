class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        boolean condition = getCondition(); // Added dynamic condition
        for (int i = 0; condition; i++) { // Unreachable for loop
            // This loop will never execute, but it's added to simulate the mutation
        }

        // Original code
        return input.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'
    }

    private boolean getCondition() {
        return false; // The loop condition is always false
    }
}