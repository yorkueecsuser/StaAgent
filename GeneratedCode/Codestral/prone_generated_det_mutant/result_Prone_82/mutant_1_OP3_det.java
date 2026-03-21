class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        if (true && true && true && true && false && true && false && true && true && false && false) {float klsoqhfc = 844457981;}
        // BUG: InvalidPatternSyntax
        return input.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'
    
}
}