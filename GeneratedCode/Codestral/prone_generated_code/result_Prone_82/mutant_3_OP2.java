class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        // BUG: InvalidPatternSyntax
        return input.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'
        // MUTANT: Duplicate the assignment statement
        return input.replaceAll("[", "x"); // Duplicated statement
    }
}