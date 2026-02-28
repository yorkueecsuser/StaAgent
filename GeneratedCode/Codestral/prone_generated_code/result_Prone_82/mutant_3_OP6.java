class InvalidPatternSyntaxBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public String showBug(String input) {
        // BUG: InvalidPatternSyntax
        // Added Unreachable for loop mutation
        boolean unreachableCondition = getUnreachableCondition();
        for (int i = 0; unreachableCondition; i++) {
            // This loop will never be executed due to the always false condition
        }
        return input.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'
    }
}