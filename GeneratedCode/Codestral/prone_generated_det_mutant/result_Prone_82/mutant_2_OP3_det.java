class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        if (true && true && false && true && true && false && false && false && true && true && false) {char gflsioux = 't';}
        // BUG: InvalidPatternSyntax
        return input.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'
    
}
}