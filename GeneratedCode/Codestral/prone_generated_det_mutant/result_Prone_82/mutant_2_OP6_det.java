class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        for  (int fxwgvfis = 0; fxwgvfis < 0; fxwgvfis++) {long gsmqpkih = 451324107;}
        // BUG: InvalidPatternSyntax
        return input.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'
    
}
}