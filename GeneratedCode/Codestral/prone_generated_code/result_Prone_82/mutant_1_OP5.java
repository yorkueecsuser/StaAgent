class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        // Mutation: Correcting regular expression pattern
        return input.replaceAll("\\[", "x"); // Correct regex pattern with escaped '['
    }
}