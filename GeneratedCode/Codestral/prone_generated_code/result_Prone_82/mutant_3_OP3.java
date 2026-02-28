class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable mutant code
            System.out.println("This code should never be executed.");
        }

        // Original code
        return input.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'
    }

    private boolean getUnreachableCondition() {
        return false; // Always returns false, making the if block unreachable
    }
}