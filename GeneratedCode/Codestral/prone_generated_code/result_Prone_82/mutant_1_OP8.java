class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        String a = input; // Renaming variable 'input' to 'a'
        return a.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'
    }
}