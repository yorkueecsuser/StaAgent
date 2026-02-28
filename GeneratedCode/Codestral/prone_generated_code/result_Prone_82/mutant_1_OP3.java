class InvalidPatternSyntaxBug {
    private boolean getFalseCondition() {
        return false;
    }

    public String showBug(String input) {
        // BUG: InvalidPatternSyntax
        if (getFalseCondition()) {
            // Unreachable if statement (for mutation testing)
            System.out.println("This line should never be executed");
        }
        return input.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'
    }
}