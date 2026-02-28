class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        String deadStoreVariable = "unusedVariable"; // dead store variable
        return input.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'
    }
}