class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        String a = input;
        // BUG: InvalidPatternSyntax
        return a.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'
    }
}