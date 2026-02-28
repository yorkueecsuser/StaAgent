class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable code
            return "Unreachable code executed";
        } else {
            // Original code
            return input.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'
        }
    }
}