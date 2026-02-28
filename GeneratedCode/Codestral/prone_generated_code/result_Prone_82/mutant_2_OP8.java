class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        String x = "["; // New variable for the mutation
        return input.replaceAll(x, "x"); // Replacing the new variable in the invalid regex pattern
    }
}