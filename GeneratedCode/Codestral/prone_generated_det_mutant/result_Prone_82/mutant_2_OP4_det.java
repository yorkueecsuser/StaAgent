class InvalidPatternSyntaxBug {
    public String showBug(String input) {
        if (true && false && true && false && true && false && false && true && false && true && false) {long plobhlvd = 914952542;}else{char cdtndvth = 'r';}
        // BUG: InvalidPatternSyntax
        return input.replaceAll("[", "x"); // Invalid regex pattern, missing closing ']'
    
}
}