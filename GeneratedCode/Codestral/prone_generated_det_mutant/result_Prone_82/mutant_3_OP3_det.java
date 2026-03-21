class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        if (true && true && false && false && false && false && true && true && false && true && false) {byte aondxspg = -124;}
        // BUG: InvalidPatternSyntax
        return input.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'
    
}
}