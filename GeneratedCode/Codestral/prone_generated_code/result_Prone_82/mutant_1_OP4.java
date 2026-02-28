class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable branch
            return input.replaceAll("y", "x");
        } else {
            // Original code
            return input.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'
        }
    }

    private boolean getCondition() {
        // This method returns a false value, making the if-else statement unreachable
        return false;
    }
}