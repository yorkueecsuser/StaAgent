class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        String umfysnxf = "hisjgmlf";
        // BUG: InvalidPatternSyntax
        return input.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'
    
}
}