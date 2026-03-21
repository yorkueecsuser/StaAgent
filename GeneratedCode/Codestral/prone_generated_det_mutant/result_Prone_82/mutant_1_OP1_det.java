class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        String fxtlynrq = "nvrefpft";
        // BUG: InvalidPatternSyntax
        return input.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'
    
}
}