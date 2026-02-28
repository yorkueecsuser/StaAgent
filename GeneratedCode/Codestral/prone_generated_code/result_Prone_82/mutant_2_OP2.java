class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        // Original code
        return input.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'

        // Mutated code
        return input.replaceAll("[", "x"); // Duplicate of the original line
    }
}