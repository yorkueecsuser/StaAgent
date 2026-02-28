class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        // BUG: InvalidPatternSyntax
        return input.replaceAll("[", "x"); // Original assignment statement
        return input.replaceAll("[", "x"); // Duplicated assignment statement
    }
}