class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            System.out.println("This is an unreachable loop");
        }
        // BUG: InvalidPatternSyntax
        return input.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'
    }

    private boolean getCondition() {
        return false; // This ensures the for loop is unreachable
    }
}